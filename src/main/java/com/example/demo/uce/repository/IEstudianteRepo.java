package com.example.demo.uce.repository;

import com.example.demo.uce.repository.modelo.Estudiante;
import com.example.demo.uce.repository.modelo.Materia;

public interface IEstudianteRepo {
	
	
	public void insertar(Estudiante estudiante);
	
	public void actualizar(Estudiante estudiante );
	
	public  Estudiante buscar(String cedula);

}
