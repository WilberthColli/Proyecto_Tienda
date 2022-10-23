package com.example.TiendaJoya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.TiendaJoya.repository.ProductosRepository;

@SpringBootApplication
public class TiendaJoyaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(TiendaJoyaApplication.class, args);
	}
	
	@Autowired
	private ProductosRepository repoProductos;
	
	private void guardar() {
		System.out.println("insertando un nuevo registro");
	}
	
	private void eliminar() {
		System.out.println("insertando un nuevo registro");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(repoProductos);
		
	}

}
