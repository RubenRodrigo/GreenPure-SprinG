package com.miempresa.modelo.distrito;

public class distritos {
	private int idDistrito;
	private String ciudad;
	private String distrito;
	private String humedad;
	private String temperatura;
	private String fecha;
	private String hora;
	private String calidadAVG;
	public distritos() {
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
	public String getCalidadAVG() {
		return calidadAVG;
	}
	public void setCalidadAVG(String calidadAVG) {
		this.calidadAVG = calidadAVG;
	}
	@Override
	public String toString() {
		return "distritos [idDistrito=" + idDistrito + ", ciudad=" + ciudad + ", distrito=" + distrito + ", humedad="
				+ humedad + ", temperatura=" + temperatura + ", fecha=" + fecha + ", hora=" + hora + ", calidadAVG="
				+ calidadAVG + "]";
	}
	
}
