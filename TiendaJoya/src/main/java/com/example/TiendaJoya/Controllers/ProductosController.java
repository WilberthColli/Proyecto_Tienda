package com.example.TiendaJoya.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.TiendaJoya.model.Categoria;
import com.example.TiendaJoya.model.Productos;
import com.example.TiendaJoya.service.ICategoriasService;
import com.example.TiendaJoya.service.IProductosService;


import net.itinajero.util.Utileria;

@Controller
@RequestMapping("/productos")
public class ProductosController {
	
	@Autowired
	private IProductosService serviceProductos;
	
	@Autowired
	private ICategoriasService serviceCategorias;
	
	@GetMapping("/create")
	public String crear(Productos producto, Model model) {
		model.addAttribute("categorias", serviceCategorias.buscarTodas()); 
		return "productos/formProductos-crear";
	}
	
	@PostMapping("/save")
	public String guardar(Productos producto, Model model, BindingResult result, RedirectAttributes attributes, @RequestParam("archivoImagen") MultipartFile multiPart) {
		// código para verificar errores
		if (result.hasErrors()) {
			for (ObjectError error: result.getAllErrors()){
				System.out.println("Ocurrió un error: "+ error.getDefaultMessage());
			}	
			return "productos/tabla-productos";
		}if (!multiPart.isEmpty()) {
			//String ruta = "c:/empleos/img-vacantes/"; // Windows
			String nombreImagen = Utileria.guardarArchivo(multiPart, "c:/empleos/img-vacantes/");
			if (nombreImagen != null){ // La imagen si se subio
			// Procesamos la variable nombreImagen

			producto.setImagen (nombreImagen);

			}
		}
		
		serviceProductos.guardar(producto);
		attributes.addFlashAttribute("msg", "Registro Guardado!");
		model.addAttribute("categorias", serviceCategorias);
		return "redirect:/productos/tabla";
	}
	
	@GetMapping("/delete/{id}")
	public String eliminar(@PathVariable("id") int idProducto, RedirectAttributes attribute) {
		serviceProductos.eliminar(idProducto);
		attribute.addFlashAttribute("msg", "El producto fue eliminado!");
		return "redirect:/productos/tabla";
	}
	
	@GetMapping("/edit/{id}")
	public String editar(@PathVariable("id") int idProducto, Model model) {
		Productos producto = serviceProductos.buscarPorId(idProducto);
		model.addAttribute("categorias", serviceCategorias.buscarTodas());
		model.addAttribute("producto", producto);
		return "productos/formProductos";
	}
	
	@GetMapping("/view/{id}")
	public String verDetalle(@PathVariable("id") int idProducto, Model model) {
		Productos producto = serviceProductos.buscarPorId(idProducto);
		model.addAttribute("producto", producto);
 
		return "productos/product_details";
	}
}
