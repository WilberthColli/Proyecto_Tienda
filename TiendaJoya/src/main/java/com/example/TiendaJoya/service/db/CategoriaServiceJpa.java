package com.example.TiendaJoya.service.db;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.TiendaJoya.model.Categoria;
import com.example.TiendaJoya.repository.CategoriasRepository;
import com.example.TiendaJoya.service.ICategoriasService;

@Service
@Primary
public class CategoriaServiceJpa implements ICategoriasService{

	@Autowired
	private CategoriasRepository cateRepo;
	
	@Override
	public List<Categoria> buscarTodas() {
		System.out.println("buscando");
		List<Categoria> lista = cateRepo.findAll();
		for(Categoria c : lista) {
			System.out.println(c.getId() + " " + c.getNombre());
		}
		return null;
	}
	
	@Override
	public Categoria buscarPorId(Integer idCategoria) {
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

}
