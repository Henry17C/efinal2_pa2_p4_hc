package com.example.demo.uce.service;

import com.example.demo.uce.repository.modelo.Materia;

public interface IMateriaService {
	
	public void insertar(Materia materia);
	
	public void actualizar(Materia materia);
	
	public  Materia buscar(String codigo);

}
