package com.example.TiendaJoya.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.TiendaJoya.model.Producto;
import com.example.TiendaJoya.service.IProductosService;

@Controller
@RequestMapping("/productos")
public class ProductosController {
	
	@Autowired
	private IProductosService serviceProductos;

	@GetMapping("/delete")
	public String eliminar(@RequestParam("id") int idProducto, Model model) {
		System.out.println("Borrando producto con id: " + idProducto);
		model.addAttribute("id", idProducto);
		return "mensaje";
	}
	
	@GetMapping("/view/{id}")
	public String verDetalle(@PathVariable("id") int idProducto, Model model) {
		
		Producto producto = serviceProductos.buscarPorId(idProducto);
		model.addAttribute("producto", producto);
		
		return "product_details";
	}
}
