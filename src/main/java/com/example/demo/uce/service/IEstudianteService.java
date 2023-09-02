package com.example.demo.uce.service;

import com.example.demo.uce.repository.modelo.Estudiante;

public interface IEstudianteService {
	
public void insertar(Estudiante estudiante);
	
	public void actualizar(Estudiante estudiante );
	
	public  Estudiante buscar(String cedula);


}
