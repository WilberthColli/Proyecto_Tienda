package com.example.TiendaJoya.service.db;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TiendaJoya.model.Administradores;
import com.example.TiendaJoya.model.Categoria;
import com.example.TiendaJoya.repository.AdminRepository;
import com.example.TiendaJoya.service.IAdminService;

@Service
public class AdministradoresServiceJpa implements IAdminService {

	@Autowired
	private AdminRepository adminRepo;
	
	@Override
	public void guardar(Administradores admin) {
		adminRepo.save(admin);
	}

	@Override
	public void eliminar(Integer idAdmin) {
		adminRepo.deleteById(idAdmin);
	}

	@Override
	public List<Administradores> buscarTodos() {
		return adminRepo.findAll();
	}
	
	@Override
	public Administradores buscarPorId(Integer idAdmin) {
		Optional<Administradores> optional = adminRepo.findById(idAdmin);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public Administradores buscarPorUsername(String username) {
		return adminRepo.findByUsername(username);
	}

}
