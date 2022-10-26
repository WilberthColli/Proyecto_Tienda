package com.example.TiendaJoya.service;

import java.util.List;

import com.example.TiendaJoya.model.Categoria;

public interface ICategoriasService {
	void guardar(Categoria categoria);
	void eliminar(Integer idCategoria);
	Categoria buscarPorId(Integer idCategoria);
	List<Categoria> buscarTodas();
}
