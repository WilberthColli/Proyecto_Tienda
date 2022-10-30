package com.example.TiendaJoya.service;

import java.util.List;

import com.example.TiendaJoya.model.Administradores;
import com.example.TiendaJoya.model.Categoria;

public interface IAdminService {
	void guardar(Administradores admin);
	void eliminar(Integer idAdmin);
	List<Administradores> buscarTodos();
	Administradores buscarPorId (Integer idAdmin);
	Administradores buscarPorUsername(String username);
}
