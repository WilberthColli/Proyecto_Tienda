package com.example.TiendaJoya.service;

import java.util.List;
import com.example.TiendaJoya.model.Productos;

public interface IProductosService {
	void guardar(Productos productos);
	void eliminar(Integer idProductos);
	void actualizar (Productos productos);
	List<Productos> buscarTodas();
	Productos buscarPorId(Integer idProducto);
}
