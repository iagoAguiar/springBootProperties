package com.boaglio.casadocodigo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boaglio.casadocodigo.dominio.Item;

public interface ItemRepository extends JpaRepository <Item, String> {
	
}
