package com.example.TiendaJoya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TiendaJoya.model.Administradores;

public interface AdminRepository extends JpaRepository<Administradores, Integer> {
	
	Administradores findByUsername(String username);
}
