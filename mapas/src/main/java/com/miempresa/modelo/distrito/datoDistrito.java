package com.miempresa.modelo.distrito;

import java.util.List;

public class datoDistrito {
	private int idDistrito;
	private String nombre;
	private String ciudadNombre;
	private int calidadAVG;
	private List<Datos> datos;
	
	public datoDistrito() {
		super();
	}

	public int getIdDistrito() {
		return idDistrito;
	}

	public void setIdDistrito(int idDistrito) {
		this.idDistrito = idDistrito;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudadNombre() {
		return ciudadNombre;
	}

	public void setCiudadNombre(String ciudadNombre) {
		this.ciudadNombre = ciudadNombre;
	}

	public int getCalidadAVG() {
		return calidadAVG;
	}

	public void setCalidadAVG(int calidadAVG) {
		this.calidadAVG = calidadAVG;
	}

	public List<Datos> getDatos() {
		return datos;
	}

	public void setDatos(List<Datos> datos) {
		this.datos = datos;
	}

	@Override
	public String toString() {
		return "datoDistrito [idDistrito=" + idDistrito + ", nombre=" + nombre + ", ciudadNombre=" + ciudadNombre
				+ ", calidadAVG=" + calidadAVG + ", datos=" + datos + "]";
	}
	
}
