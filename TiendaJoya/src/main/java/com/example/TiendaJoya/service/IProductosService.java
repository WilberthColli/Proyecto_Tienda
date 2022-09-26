package com.example.TiendaJoya.service;

import java.util.List;

import com.example.TiendaJoya.model.Producto;

public interface IProductosService {
	List<Producto> buscarTodas();
	Producto buscarPorId(Integer idProducto);
}
