package com.example.TiendaJoya.Controllers;

import java.util.LinkedList;
import java.util.List;
import java.util.Date;

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
	
	@GetMapping("/tabla")
	public String mostrarTabla(Model model) {
		List<Producto> lista = serviceProductos.buscarTodas();
		
			
		model.addAttribute("productos", lista);
		
		return "tabla";
	}

	
	
	@GetMapping("/index")
	public String mostrarHome(Model model) {
			
		return "index"; 
	}
	@GetMapping("/shop")
	public String mostrarShop(Model model) {
			
			List<Producto> lista = serviceProductos.buscarTodas();
			model.addAttribute("productos", lista);
			
		
		return "shop";
	}
	@GetMapping("/about")
	public String mostrarAbout(Model model) {
		List<Producto> lista = serviceProductos.buscarTodas();
		model.addAttribute("productos", lista);
		
		return "about";
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
	@GetMapping("/collares")
	public String mostrarCollares(Model model) {

		List<Producto> lista = serviceProductos.buscarTodas();
		model.addAttribute("productos", lista);
		
		return "collares";
	}
	@GetMapping("/brazaletes")
	public String mostrarBrazaletes(Model model) {

		List<Producto> lista = serviceProductos.buscarTodas();
		model.addAttribute("productos", lista);
		
		return "brazaletes";
	}
	@GetMapping("/pendientes")
	public String mostrarPendientes(Model model) {

		List<Producto> lista = serviceProductos.buscarTodas();
		model.addAttribute("productos", lista);
		
		return "pendientes";
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
	
	@GetMapping("/product_details")
	public String mostrarDetalle(Model modelo) {
		Producto producto = new Producto();
		producto.setNombre("Collar V");
		producto.setFecha(new Date());
		producto.setPrecio(20000.0);
		producto.setDescripcion("Cadena de oro delgada con dije V exclusivo de Versache.");
		
		modelo.addAttribute("producto", producto);
		return "product_details";
	}
}
	
	
	
	

