package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.repository.IMateriaRepo;
import com.example.demo.uce.repository.modelo.Materia;

@Service
public class MateriaServiceImpl  implements IMateriaService{

	@Autowired
	private IMateriaRepo iMateriaRepo;
	
	@Override
	public void insertar(Materia materia) {
		// TODO Auto-generated method stub
		iMateriaRepo.insertar(materia);
	}

	@Override
	public void actualizar(Materia materia) {
		// TODO Auto-generated method stub
		iMateriaRepo.actualizar(materia);
	}

	@Override
	public Materia buscar(String codigo) {
		// TODO Auto-generated method stub
		return iMateriaRepo.buscar(codigo);
	}

}
