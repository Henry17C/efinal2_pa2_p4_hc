package com.example.demo.uce.repository.modelo;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity
@Table(name = "matricula")
public class Matricula {
	
	@Id
	@GeneratedValue(generator = "seq_matri", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_matri", sequenceName = "seq_matri", allocationSize = 1)
	@Column(name = "matri_id")
	private Integer id;
	
	
	@Column(name = "matri_fecha_matricula")
	private LocalDateTime fechaMatricula;
	
	@Column(name = "matri_nombre_hilo")
	private String nombreHilo;
	
	
	@ManyToOne
	@JoinColumn(name = "matri_id_estudiante")
	private Estudiante estudiante;
	
	@ManyToOne
	@JoinColumn(name = "matri_id_materia")
	private Materia materia ;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	
	
	
	
	

}
