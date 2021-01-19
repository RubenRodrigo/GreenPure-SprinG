package com.miempresa.modelo.distrito;

public class Datos {
	private String latitud;
	private String longitud;
	private String calidad;
	private String fecha;
	private String hora;
	private String humedad;
	private String temperatura;
	private String calor;
	private String concentracion;
	private Boolean sensorHumo;
	private Boolean sensorMetano;

	public Datos() {
		super();
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
	public String getCalidad() {
		return calidad;
	}
	public void setCalidad(String calidad) {
		this.calidad = calidad;
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
	public String getCalor() {
		return calor;
	}
	public void setCalor(String calor) {
		this.calor = calor;
	}
	public String getConcentracion() {
		return concentracion;
	}
	public void setConcentracion(String concentracion) {
		this.concentracion = concentracion;
	}
	public Boolean getSensorHumo() {
		return sensorHumo;
	}
	public void setSensorHumo(Boolean sensorHumo) {
		this.sensorHumo = sensorHumo;
	}
	public Boolean getSensorMetano() {
		return sensorMetano;
	}
	public void setSensorMetano(Boolean sensorMetano) {
		this.sensorMetano = sensorMetano;
	}

	@Override
	public String toString() {
		return "Datos [latitud=" + latitud + ", longitud=" + longitud + ", calidad=" + calidad + ", fecha=" + fecha
				+ ", hora=" + hora + ", humedad=" + humedad + ", temperatura=" + temperatura + ", calor=" + calor
				+ ", concentracion=" + concentracion + ", sensorHumo=" + sensorHumo + ", sensorMetano=" + sensorMetano
				+ "]";
	}
	
	
}
