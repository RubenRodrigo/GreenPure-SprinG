package com.miempresa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.miempresa.modelo.datoMapa;
import com.miempresa.modelo.distrito.datoDistrito;

@Configuration
public class Configuracion {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
	
	@Value("${resource.ubicaciones}/mapa")
	private String resourceMapa;
	
	@Value("${resource.ubicaciones}/distritoDatos/{id}")
	private String resourceDistrito;
	
	public List<datoMapa> findAllMapa(){
		List<datoMapa> data =  Arrays.stream(restTemplate.getForObject(resourceMapa, datoMapa[].class)).collect(Collectors.toList());
		return data;
	}
	
	public datoDistrito findDistrict(String ID){
		Map<String, String> params = new HashMap<String, String>();
		params.put("id", ID);
		datoDistrito result = restTemplate.getForObject(resourceDistrito, datoDistrito.class, params);
		return result;
	}
	
}
