package com.example.demo.uce.service;

import java.util.List;

import com.example.demo.uce.repository.modelo.dto.MatriculaDTO;

public interface IMatriculaService {
  
	
	public void matricular(String cedula, String codigoM1,String codigoM2,String codigoM3,String codigoM4);

	public List<MatriculaDTO> listaMatriculas(); 

}
