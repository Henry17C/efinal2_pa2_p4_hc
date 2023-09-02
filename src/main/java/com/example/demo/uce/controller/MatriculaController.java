package com.example.demo.uce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.uce.repository.modelo.Matricula;
import com.example.demo.uce.repository.modelo.dto.MatriculaDTO;
import com.example.demo.uce.service.IMatriculaService;

@RequestMapping("/matriculas")
@Controller
public class MatriculaController {

	
	@Autowired
	private IMatriculaService iMatriculaService;
	
	
	
	
	
	@GetMapping("/insertarVst")
	public String insertarVst(Matricula matricula) {
		
		return "vistaInsertarMatricula";
	}
	
	@PostMapping("/insertar")
	public String insertar(String cedula, String codigoM1, String codigoM2, String codigoM3, String codigoM4) {
		
		iMatriculaService.matricular(cedula, codigoM1, codigoM2, codigoM3, codigoM4);
		
		return "redirect:/matriculas/insertarVst";
	}
	
	
	
	
	@GetMapping("/listar")
	public String listar(Model model) {
	List<MatriculaDTO> matriculas=	this.iMatriculaService.listaMatriculas();
	model.addAttribute("matriculas",matriculas);
	
	
	
	return "vistaListarMatriculas";
	}
	
	
	//vistaListarMatriculas
	
	
}
