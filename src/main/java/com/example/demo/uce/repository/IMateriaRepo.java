package com.example.demo.uce.repository;

import com.example.demo.uce.repository.modelo.Materia;

public interface IMateriaRepo {
	
	public void insertar(Materia materia);
	
	public void actualizar(Materia materia);
	
	public  Materia buscar(String codigo);

}
