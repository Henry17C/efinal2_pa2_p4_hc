package com.example.demo.uce.repository;

import java.util.List;

import com.example.demo.uce.repository.modelo.Matricula;
import com.example.demo.uce.repository.modelo.dto.MatriculaDTO;

public interface IMatriculaRepo {
	
	public void insertar(Matricula matricula);
	public List<MatriculaDTO> listaMatriculas(); 

}
