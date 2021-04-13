package com.boaglio.casadocodigo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boaglio.casadocodigo.dominio.Propriedade;
import com.boaglio.casadocodigo.repository.PropriedadeRepository;

@RestController
@RequestMapping("/api")
public class PropriedadeController {

	
	@Autowired
	private PropriedadeRepository repository;
	
	@GetMapping("/find")
	List<Propriedade> findByFiltro(@PathVariable("filtro") String filtro){
		
		
		return repository.findbyFiltro(filtro);
		
		
	}
}
