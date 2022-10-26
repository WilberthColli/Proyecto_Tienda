package com.example.TiendaJoya.service.db;

import java.util.List;
import java.util.Optional;

import com.example.TiendaJoya.model.Categoria;
import com.example.TiendaJoya.repository.CategoriasRepository;
import com.example.TiendaJoya.service.ICategoriasService;

public class CategoriaServiceJpa implements ICategoriasService{

	private CategoriasRepository cateRepo;
	
	
	@Override
	public List<Categoria> buscarTodas() {
		System.out.println("buscando");
		return (List<Categoria>) cateRepo.findAll();
	}
	@Override
	public Categoria buscarPorId(Integer idCategoria) {
		// TODO Auto-generated method stub
				Optional<Categoria> optional = cateRepo.findById(idCategoria);
				if(optional.isPresent()) {
				  return optional.get();
				}
				return null;
	}
	
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
