package com.example.demo.uce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.uce.repository.modelo.Estudiante;
import com.example.demo.uce.service.IEstudianteService;



@RequestMapping("/estudiantes")
@Controller
public class EstudianteController {
	
	
	@Autowired
	private IEstudianteService estudianteService;
	
	@GetMapping("/insertarVst")
	public String insertarVst(Estudiante estudiante) {
		
		return "vistaInsertarEstudiante";
	}
	
	@PostMapping("/insertar")
	public String insertar(Estudiante estudiante ) {
		
		estudianteService.insertar(estudiante);
		
		return "redirect:/estudiantes/insertarVst";
	}
	
	

}
