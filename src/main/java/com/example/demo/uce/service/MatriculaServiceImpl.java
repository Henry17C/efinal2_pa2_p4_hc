package com.example.demo.uce.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.repository.IMatriculaRepo;
import com.example.demo.uce.repository.modelo.Estudiante;
import com.example.demo.uce.repository.modelo.Materia;
import com.example.demo.uce.repository.modelo.Matricula;
import com.example.demo.uce.repository.modelo.dto.MatriculaDTO;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	
	
	@Autowired
	private IMateriaService iMateriaService;
	
	
	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private IMatriculaRepo iMatriculaRepo;
	
	@Override
	public void matricular(String cedula, String codigoM1, String codigoM2, String codigoM3, String codigoM4) {
		// TODO Auto-generated method stub
	

		
		
		
		
		
		
		Materia materi1 = this.iMateriaService.buscar(codigoM1);
		Materia materi2 = this.iMateriaService.buscar(codigoM2);
		Materia materi3 = this.iMateriaService.buscar(codigoM3);
		Materia materi4 = this.iMateriaService.buscar(codigoM4);

		
		List<Materia> listaM = new ArrayList<>();

		// Matricular las materias en paralelo
		List<Materia> materiasAProcesar = Arrays.asList(materi1, materi2, materi3, materi4);

		materiasAProcesar.parallelStream().forEach(materia -> {
			
			Estudiante estudiante = this.estudianteService.buscar(cedula);
			Thread hiloActual = Thread.currentThread();
			
		Matricula matri= new Matricula();
		matri.setEstudiante(estudiante);
		matri.setFechaMatricula(LocalDateTime.now());
		matri.setNombreHilo(hiloActual.toString());
		matri.setMateria(materia)	;
		iMatriculaRepo.insertar(matri)	;
		    // Agregar la materia a la lista
		    listaM.add(materia);
		});

		
		
		
		


		
		
		
	}

	@Override
	public List<MatriculaDTO> listaMatriculas() {
		// TODO Auto-generated method stub
		return iMatriculaRepo.listaMatriculas();
	}

}
