package com.example.TiendaJoya.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/joya")
public class FormularioController {

	// @GetMapping("/index")
		@RequestMapping(value = "/index", method = RequestMethod.GET)
		public String mostrarIndex(Model model) {
			return "formulario/guardado";
		}
	
	
	// @GetMapping("/create")
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String crear() {
		return "formulario/formJoya";
	}

	// @PostMapping("/save")
		@RequestMapping(value="/save", method=RequestMethod.GET)
		public String guardar(@RequestParam("nombre") String nombre,@RequestParam("descripcion") String descripcion, @RequestParam("material") String material, @RequestParam("marca") String marca, @RequestParam("talla") String talla, @RequestParam("precio") String precio, Model model) {
			System.out.println("Categoria:" + nombre);
			System.out.println("Descripcion: " + descripcion);
			System.out.println("Descripcion: " + material);
			System.out.println("Descripcion: " + marca);
			System.out.println("Descripcion: " + talla);
			System.out.println("Descripcion: " + precio);

			return "formulario/guardado";
		}
		
		
}
