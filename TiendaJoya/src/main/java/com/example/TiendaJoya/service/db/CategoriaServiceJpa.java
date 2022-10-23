package com.example.TiendaJoya.service.db;

import java.util.List;

import com.example.TiendaJoya.model.Categoria;
import com.example.TiendaJoya.repository.CategoriasRepository;
import com.example.TiendaJoya.service.ICategoriasService;

public class CategoriaServiceJpa implements ICategoriasService{

	private CategoriasRepository cateRepo;
	
	@Override
	public void guardar(Categoria categoria) {
		cateRepo.save(categoria);
	}

	@Override
	public void eliminar(Integer idCategoria) {
		cateRepo.deleteById(idCategoria);
	}

	@Override
	public List<Categoria> buscarTodos() {
		// TODO Auto-generated method stub
		return (List<Categoria>) cateRepo.findAll();
	}

}
