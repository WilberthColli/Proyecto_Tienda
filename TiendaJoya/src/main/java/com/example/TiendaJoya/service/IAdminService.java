package com.example.TiendaJoya.service;

import java.util.List;

import com.example.TiendaJoya.model.Administradores;

public interface IAdminService {
	void guardar(Administradores admin);
	void eliminar(Integer idAdmin);
	List<Administradores> buscarTodos();
	Administradores buscarPorUsername(String username);
}
