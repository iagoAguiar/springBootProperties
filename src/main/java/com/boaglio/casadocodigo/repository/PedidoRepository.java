package com.boaglio.casadocodigo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boaglio.casadocodigo.dominio.Pedido;

public interface PedidoRepository extends JpaRepository <Pedido, String> {
	
}
