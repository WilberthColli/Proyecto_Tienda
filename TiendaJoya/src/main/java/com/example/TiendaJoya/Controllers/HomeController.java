package com.example.TiendaJoya.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String mostrarHome(Model model) {
		
		return "index";
	}
	@GetMapping("/shop")
	public String mostrarShop(Model model) {
		
		return "shop";
	}
	@GetMapping("/about")
	public String mostrarAbout(Model model) {
		
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
	@GetMapping("/elements")
	public String mostrarElements(Model model) {
		
		return "elements";
	}
	@GetMapping("/product_details")
	public String mostrarPDetails(Model model) {
		
		return "product_details";
	}
	
	
	
}
