package com.pedid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedid.entities.Pedido;

public interface PedRepository extends JpaRepository<Pedido, Long> {

	
	

}