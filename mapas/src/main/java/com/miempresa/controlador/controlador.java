package com.miempresa.controlador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.miempresa.Configuracion;
import com.miempresa.modelo.datoMapa;
import com.miempresa.modelo.distrito.Datos;
import com.miempresa.modelo.distrito.datoDistrito;

@Controller
@RequestMapping
public class controlador {
		
	private int GOOD_AIR = 30;
	private int  MODERATE_AIR = 50;
	private int  REGULAR_AIR = 70;
	private String CALIDAD_ESTADO = "NaN";
	@Autowired
	private Configuracion service;

	@GetMapping("/")
	public String index(Model model) {
		List<datoMapa> datos = service.findAllMapa();
		model.addAttribute("datos", datos);
		return "index";
	}

	@GetMapping("/distrito/{id}")
	public String distritoDato(@PathVariable String id, Model model) {
		// data from API
		datoDistrito distrito = service.findDistrict(id);
		
		// set data in variables
		int idDistrito = distrito.getIdDistrito();
		String distritoNombre = distrito.getNombre();
		String ciudadNombre = distrito.getCiudadNombre();
		int calidadAVG = distrito.getCalidadAVG();
		
		// create arrays to sensors
		List<Datos> datos = distrito.getDatos();
		List<String> horas = new ArrayList<String>();
		List<String> calidad = new ArrayList<String>();
		List<String> temperatura = new ArrayList<String>();
		List<String> concentracion = new ArrayList<String>();
		List<String> humedad = new ArrayList<String>();
		List<String> humo = new ArrayList<String>();
		List<String> metano = new ArrayList<String>();
		
		// set data in arrays
		for (Datos dato : datos) {
			horas.add(dato.getHora());
			calidad.add(dato.getCalidad());
			temperatura.add(dato.getTemperatura());
			concentracion.add(dato.getConcentracion());
			humedad.add(dato.getHumedad());
			humo.add(dato.getSensorHumo()? "1": "0");
			metano.add(dato.getSensorMetano()? "1": "0");
		}
		
		// send data to view
		model.addAttribute("idDistrito", idDistrito);
		model.addAttribute("distritoNombre", distritoNombre);
		model.addAttribute("ciudadNombre", ciudadNombre);
		model.addAttribute("calidadAVG", calidadAVG);
		model.addAttribute("horas", horas);
		model.addAttribute("calidad", calidad);
		model.addAttribute("temperatura", temperatura);
		model.addAttribute("concentracion", concentracion);
		model.addAttribute("humedad", humedad);
		model.addAttribute("humo", humo);
		model.addAttribute("metano", metano);
		model.addAttribute("estadoCalidad", estadoCalidad(60));

		return "distritoDato";
	}
	
	private String estadoCalidad(int calidadAVG) {
		String estado = "";
		if(calidadAVG >= 0 && calidadAVG <= GOOD_AIR) {
			estado = "Bueno";
		} else if(calidadAVG > GOOD_AIR && calidadAVG <=MODERATE_AIR) {
			estado = "Moderado";
		} else if(calidadAVG > MODERATE_AIR && calidadAVG <= REGULAR_AIR) {
			estado = "Regular";
		} else if(calidadAVG > REGULAR_AIR) {
			estado = "Malo";
		} else {
			estado = "NaN";
		}
		return estado;
	}
}
