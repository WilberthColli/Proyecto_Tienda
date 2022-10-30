package com.example.TiendaJoya.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.TiendaJoya.model.Administradores;
import com.example.TiendaJoya.model.Productos;
import com.example.TiendaJoya.service.IAdminService;

@Controller
@RequestMapping("/administradores")
public class AdminsController {

	@Autowired
	private IAdminService serviceAdmins;
	
	@GetMapping("/index")
	public String mostrarLista(Model model) {
		List<Administradores> lista = serviceAdmins.buscarTodos();
		model.addAttribute("adminstradores", lista);
		return "administradores/tabla-admin";
	}
	
	@GetMapping("/delete/{id}")
	public String eliminar(@PathVariable("id") int idAdmin, RedirectAttributes attributes) {		    	
    	serviceAdmins.eliminar(idAdmin);
		attributes.addFlashAttribute("msg", "El Administrador fue eliminado!");

		return "redirect:/administradores/tabla";
	}
	
	@GetMapping("/view/{id}")
	public String verDetalle(@PathVariable("id") int idAdmin, Model model) {
		Administradores admin = serviceAdmins.buscarPorId(idAdmin);
		model.addAttribute("admin", admin);
 
		return "administradores/admin-details";
	}
}
