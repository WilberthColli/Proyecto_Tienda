package com.example.TiendaJoya.service;

import java.util.List;
import com.example.TiendaJoya.model.Productos;

public interface IProductosService {
	List<Productos> buscarTodas();
	Productos buscarPorId(Integer idProducto);
}
