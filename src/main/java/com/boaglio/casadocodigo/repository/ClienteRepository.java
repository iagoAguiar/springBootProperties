package com.boaglio.casadocodigo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boaglio.casadocodigo.dominio.Cliente;

public interface ClienteRepository extends JpaRepository <Cliente, String> {
	
	}
