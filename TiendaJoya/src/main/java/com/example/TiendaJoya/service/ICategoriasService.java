package com.example.TiendaJoya.service;

import java.util.List;

import com.example.TiendaJoya.model.Categoria;
import com.example.TiendaJoya.model.Productos;

public interface ICategoriasService {
	void guardar(Categoria categoria);
	void eliminar(Integer idCategoria);
	List<Categoria> buscarTodos();
	Categoria buscarPorId(Integer idCategoria);
	List<Categoria> buscarTodas();
}
