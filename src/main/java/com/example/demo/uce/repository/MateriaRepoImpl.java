package com.example.demo.uce.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.uce.repository.modelo.Materia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class MateriaRepoImpl implements IMateriaRepo {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public void insertar(Materia materia) {
		// TODO Auto-generated method stub
		entityManager.persist(materia);
	}

	@Override
	public void actualizar(Materia materia) {
		// TODO Auto-generated method stub
		entityManager.merge(materia);
	}

	@Override
	public Materia buscar(String codigo) {
		// TODO Auto-generated method stub
		
		TypedQuery<Materia> query= this.entityManager.createQuery("Select m from Materia m where m.codigo= :codigo",Materia.class);
		query.setParameter("codigo", codigo);
		return query.getSingleResult();
	}

}
