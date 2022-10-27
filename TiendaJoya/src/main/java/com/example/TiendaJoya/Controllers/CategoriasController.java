package com.example.TiendaJoya.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.TiendaJoya.model.Categoria;
import com.example.TiendaJoya.service.ICategoriasService;

@Controller
@RequestMapping("/categorias")
public class CategoriasController {
	
	@Autowired
	private ICategoriasService serviceCategorias;
	
	@GetMapping("/index")
	public String mostrarIndex(Model model) {
		List<Categoria> lista = serviceCategorias.buscarTodas();
    	model.addAttribute("vacantes", lista);
		return "categorias/tabla-categorias";
	}
	
	@GetMapping("/delete/{id}")
	public String eliminar(@PathVariable("id") int idCategoria, RedirectAttributes attributes) {
		serviceCategorias.eliminar(idCategoria);
		attributes.addFlashAttribute("msg", "La categoria fue eliminada");
		return "redirect:/categorias/index";
	}
	
	@GetMapping("/create")
	public String crear(Categoria categoria) {
		return "categorias/formCategoria";
	}
	
	/*
	@PostMapping("/save")
	public String guardar(Categoria categoria, BindingResult result, RedirectAttributes attributes, Model model) {
		if (result.hasErrors()) {
			for (ObjectError error: result.getAllErrors()){
				System.out.println("Ocurrió un error: "+ error.getDefaultMessage());
			}	
			return "categorias/tabla-categorias";
		}	
		
		serviceCategorias.guardar(categoria);
		attributes.addFlashAttribute("msg", "Registro Guardado");		
		System.out.println("Categoria: " + categoria);		
		return "redirect:/tabla-categorias"; 
	}
	*/
	
	@PostMapping("/save")
	public String guardar(Categoria categoria, BindingResult result, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			for (ObjectError error: result.getAllErrors()){
				System.out.println("Ocurrió un error: "+ error.getDefaultMessage());
			}
			return "categorias/formCategoria";
		}
		
		serviceCategorias.guardar(categoria);
		attributes.addFlashAttribute("msg", "Categoria Creada!");
		return "categorias/tabla-categorias";

	}
	
	@GetMapping("/edit/{id}")
	public String editar(@PathVariable("id") int idCategoria, Model model) {
		Categoria categoria = serviceCategorias.buscarPorId(idCategoria);
		model.addAttribute("categoria", categoria);
		return "categorias/formCategoria";
	}
}
