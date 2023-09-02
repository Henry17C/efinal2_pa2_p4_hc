package com.example.demo.uce.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.repository.modelo.Matricula;
import com.example.demo.uce.repository.modelo.dto.MatriculaDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional

public class MatriculaRepoImpl implements IMatriculaRepo {

	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		entityManager.persist(matricula);
	}

	@Override
	public List<MatriculaDTO> listaMatriculas() {
		// TODO Auto-generated method stub
		
	String consulta="Select new com.example.demo.uce.repository.modelo.dto.MatriculaDTO (m.estudiante.cedula, m.estudiante.nombre, m.materia.codigo, m.fechaMatricula, m.nombreHilo ) from Matricula m";	
		
		TypedQuery< MatriculaDTO> query= this.entityManager.createQuery(consulta, MatriculaDTO.class);
		return query.getResultList();
	}

}
