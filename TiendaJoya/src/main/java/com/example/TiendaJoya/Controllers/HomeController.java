package com.example.TiendaJoya.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.TiendaJoya.model.Producto;
import com.example.TiendaJoya.service.IProductosService;


@Controller
public class HomeController {
	
	@Autowired
	private IProductosService serviceProductos;
	
	@GetMapping("/product_details")
	public String mostrarTabla(Model model) {
		List<Producto> lista = serviceProductos.buscarTodas();
		model.addAttribute("productos", lista);
		
		return "product_details";
	}

	@GetMapping("/index")
	public String mostrarHome(Model model) {
		
		return "index"; 
	}
	@GetMapping("/shop")
	public String mostrarShop(Model model) {
		
		return "shop";
	}
	@GetMapping("/hotsale")
	public String mostrarAbout(Model model) {
		
		return "hotsale";
	}
	@GetMapping("/blog")
	public String mostrarBlog(Model model) {
		
		return "blog";
	}
	@GetMapping("/contact")
	public String mostrarContact(Model model) {
		
		return "contact";
	}
	@GetMapping("/blog_details")
	public String mostrarBdetails(Model model) {
		
		return "blog_details";
	}
	@GetMapping("/elements")
	public String mostrarElements(Model model) {
		
		return "elements";
	}
	@GetMapping("/formulario/formJoya")
	public String mostrarEl(Model model) {
		
		return "formulario/formJoya";
	}
	@GetMapping("/joya/save")
	public String mostrar(Model model) {
		
		return "formulario/guardado";
	}
	

	
	
	
	
}
