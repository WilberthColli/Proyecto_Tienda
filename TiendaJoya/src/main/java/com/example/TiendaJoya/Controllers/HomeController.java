package com.example.TiendaJoya.Controllers;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.TiendaJoya.model.Administradores;
import com.example.TiendaJoya.model.Categoria;
import com.example.TiendaJoya.model.Productos;
import com.example.TiendaJoya.service.IAdminService;
import com.example.TiendaJoya.service.ICategoriasService;
import com.example.TiendaJoya.service.IProductosService;

@Controller
public class HomeController {
	
	@Autowired
	private IProductosService serviceProductos;
	
	@Autowired
	private IAdminService serviceAdmins;
	
	@Autowired
	private ICategoriasService serviceCategorias;
	
	// PAGINAS PRINCIPALES
	@GetMapping("/")
	public String mostrarHome(Model model) {
		return "index"; 
	}
	
	@GetMapping("/shop")
	public String mostrarShop(Model model) {
		List<Productos> lista = serviceProductos.buscarTodas();
		model.addAttribute("productos", lista);		
		return "shop";
	}
	
	@GetMapping("/about")
	public String mostrarAbout(Model model) {
		List<Productos> lista = serviceProductos.buscarTodas();
		model.addAttribute("productos", lista);
		return "about";
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
	
	// PAGINAS PRODUCTOS
	@GetMapping("/productos/tabla")
	public String mostrarTabla(Model model) {
		List<Productos> lista = serviceProductos.buscarTodas();
		model.addAttribute("productos", lista);
		return "productos/tabla-productos";
	}
	
	@GetMapping("/productos/crear")
	public String mostrarEl(Model model) {
		return "productos/formProductos";
	}
	
	@GetMapping("/joya/save")
	public String mostrar(Model model) {
		return "formulario/guardado";
	}
	
	@GetMapping("/product_details")
	public String mostrarDetalle(Model modelo) {
		Productos producto = new Productos();
		producto.setNombre("Collar V");
		producto.setPrecio(20000.0);
		producto.setDescripcion("Cadena de oro delgada con dije V exclusivo de Versache.");
		
		modelo.addAttribute("producto", producto);
		return "productos/product_details";
	}
	
	@GetMapping("/productos/collares")
	public String mostrarCollares(Model model) {
		List<Productos> lista = serviceProductos.buscarTodas();
		model.addAttribute("productos", lista);
		return "productos/collares";
	}
	
	@GetMapping("/productos/brazaletes")
	public String mostrarBrazaletes(Model model) {
		List<Productos> lista = serviceProductos.buscarTodas();
		model.addAttribute("productos", lista);
		return "productos/brazaletes";
	}
	
	@GetMapping("/productos/pendientes")
	public String mostrarPendientes(Model model) {
		List<Productos> lista = serviceProductos.buscarTodas();
		model.addAttribute("productos", lista);
		return "productos/pendientes";
	}
	
	// PAGINAS CATEGORIAS
	@GetMapping("/categorias/tabla")
	public String mostrarCategorias(Model model) {
		List<Categoria> lista = serviceCategorias.buscarTodas();
		model.addAttribute("categorias", lista);
		return "categorias/tabla-categorias";
	}
	
	// PAGINAS ADMINISTRADORES
	@GetMapping("/administradores/tabla")
	public String mostrarAdmin(Model model) {
		List<Administradores> lista = serviceAdmins.buscarTodos();
		model.addAttribute("administradores", lista);
		return "administradores/tabla-admin";
	}
	
	@GetMapping("/index")
	public String mostrarIndex(Authentication auth, HttpSession session) {
		String username = auth.getName();
		System.out.println("Nombre del usuario: " + username);
		
		for(GrantedAuthority rol: auth.getAuthorities()) {
			System.out.println("ROL:" + rol.getAuthority());
		}
		
		if (session.getAttribute("admin")==null) {
		Administradores admin = serviceAdmins.buscarPorUsername(username);
		admin.setPassword(null);
		System.out.println("Admin: " + admin);
		session.setAttribute("admin", admin);
		}
		return "redirect:/";
	}

}
	
	
	
	

