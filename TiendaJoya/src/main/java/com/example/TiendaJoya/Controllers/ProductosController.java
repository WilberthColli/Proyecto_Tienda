package com.example.TiendaJoya.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.TiendaJoya.model.Productos;
import com.example.TiendaJoya.service.IProductosService;


import net.itinajero.util.Utileria;

@Controller
@RequestMapping("/productos")
public class ProductosController {
	
	private String ruta;
	
	@Autowired
	private IProductosService serviceProductos;

	@GetMapping("/delete")
	public String eliminar(@RequestParam("id") int idProducto, Model model) {
		System.out.println("Borrando producto con id: " + idProducto);
		model.addAttribute("id", idProducto);
		return "tabla-productos";
	}
	
	@GetMapping("/create")
	public String crear(Productos producto, Model model) {
		return "productos/formProductos";
	}
	
	@PostMapping("/save")
	public String guardar(Productos producto, BindingResult result, RedirectAttributes attributes, @RequestParam("archivoImagen") MultipartFile multiPart, Model model) {
		if (result.hasErrors()) {
			for (ObjectError error: result.getAllErrors()){
				System.out.println("Ocurrió un error: "+ error.getDefaultMessage());
			}	
			return "productos/formProductos";
		}
		
		if (!multiPart.isEmpty()) {
			String nombreImagen = Utileria.guardarArchivo(multiPart, ruta);
			if (nombreImagen != null){
				producto.setArchivoImagen (nombreImagen);
			}
		}	
		
		serviceProductos.guardar(producto);
		attributes.addFlashAttribute("msg", "Registro Guardado");		
		System.out.println("Producto: " + producto);		
		return "redirect:/tabla-productos"; 
	}
	
	@GetMapping("/view/{id}")
	public String verDetalle(@PathVariable("id") int idProducto, Model model) {
		Productos producto = serviceProductos.buscarPorId(idProducto);
		model.addAttribute("producto", producto);
 
		return "productos/product_details";
	}
}
