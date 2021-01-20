package com.miempresa.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class datoMapa {
	private int idDistrito;
    private String ciudad;
    private String distrito;
    private String latitud;
    private String longitud;
    private String humedad;
    private String temperatura;
    private String fecha;
    private String hora;
    private int calidadAVG;
	public datoMapa() {
		super();
	}
	public int getIdDistrito() {
		return idDistrito;
	}
	public void setIdDistrito(int idDistrito) {
		this.idDistrito = idDistrito;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public String getLatitud() {
		return latitud;
	}
	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}
	public String getLongitud() {
		return longitud;
	}
	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}
	public String getHumedad() {
		return humedad;
	}
	public void setHumedad(String humedad) {
		this.humedad = humedad;
	}
	public String getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public int getCalidadAVG() {
		return calidadAVG;
	}
	public void setCalidadAVG(int calidadAVG) {
		this.calidadAVG = calidadAVG;
	}
    
}
