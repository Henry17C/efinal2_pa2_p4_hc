package com.example.demo.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.uce.repository.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class EstudianteRepoimpl implements IEstudianteRepo{
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		entityManager.persist(estudiante);
	}

	@Override
	public void actualizar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		entityManager.merge(estudiante);
	}

	@Override
	public Estudiante buscar(String cedula) {
		// TODO Auto-generated method stub
		
		TypedQuery<Estudiante> query= this.entityManager.createQuery("Select m from Estudiante m where m.cedula= :cedula",Estudiante.class);
		query.setParameter("cedula", cedula);
		return query.getSingleResult();
	}

}
