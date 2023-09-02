package com.example.demo.uce.repository.modelo.dto;

import java.time.LocalDateTime;

public class MatriculaDTO {
	
	
	//estu
	private String cedula;
	private String nombre;
	
	
	//mate
	private String codigo;
	
	//matri
	private LocalDateTime fechaMatricula;
	private String nombreHilo;
	
	
	

	public MatriculaDTO(String cedula,String nombre,String codigo,
			LocalDateTime fechaMatricula,String nombreHilo) {
		// TODO Auto-generated constructor stub
		
		super();
		this.cedula=cedula;
		this.nombre=nombre;
		this.codigo= codigo;
		this.fechaMatricula=fechaMatricula;
		this.nombreHilo=nombreHilo;
		
	}
	
	public MatriculaDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public LocalDateTime getFechaMatricula() {
		return fechaMatricula;
	}

	public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}

	public String getNombreHilo() {
		return nombreHilo;
	}

	public void setNombreHilo(String nombreHilo) {
		this.nombreHilo = nombreHilo;
	}
	
	
	
	

}
