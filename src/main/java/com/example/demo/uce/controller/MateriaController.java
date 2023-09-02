package com.example.demo.uce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.uce.repository.modelo.Materia;
import com.example.demo.uce.service.IMateriaService;

@RequestMapping("/materias")
@Controller

public class MateriaController {
	
	
	@Autowired
	private IMateriaService iMateriaService;
	
	@GetMapping("/insertarVst")
	public String insertarVst(Materia materia) {
		
		return "vistaInsertarMateria";
	}
	
	@PostMapping("/insertar")
	public String insertar(Materia materia) {
		
		iMateriaService.insertar(materia);
		
		return "redirect:/materias/insertarVst";
	}
	
	
	
	
	

}
