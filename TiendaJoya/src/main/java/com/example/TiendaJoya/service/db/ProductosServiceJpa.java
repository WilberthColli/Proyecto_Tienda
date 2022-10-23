package com.example.TiendaJoya.service.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.TiendaJoya.model.Productos;
import com.example.TiendaJoya.repository.ProductosRepository;
import com.example.TiendaJoya.service.IProductosService;

public class ProductosServiceJpa implements IProductosService{

	
	@Autowired
	private ProductosRepository producRepo;
	
	@Override
	public List<Productos> buscarTodas() {
		System.out.println("buscando");
		return (List<Productos>) producRepo.findAll();
	}

	@Override
	public Productos buscarPorId(Integer idProducto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(Productos productos) {
		producRepo.save(productos);
	}

	@Override
	public void eliminar(Integer idProductos) {
		producRepo.deleteById(idProductos);
	}

	@Override
	public void actualizar(Productos productos) {
		producRepo.save(productos);
	}

}
