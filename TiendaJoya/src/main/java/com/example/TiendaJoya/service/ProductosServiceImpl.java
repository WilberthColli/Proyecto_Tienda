package com.example.TiendaJoya.service;


import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.TiendaJoya.model.Productos;

@Service
public class ProductosServiceImpl implements IProductosService {

	private List<Productos> lista = null;

	public ProductosServiceImpl() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		lista = new LinkedList<Productos>();
		// Creamos la oferta de trabajo 1
		Productos Productos1 = new Productos();
		Productos1.setId(1);
		Productos1.setNombre("Collar V");
		Productos1.setDescripcion("Cadena de oro delgada con dije V exclusivo de Versache. ");
		Productos1.setArchivoImagen(null);
		Productos1.setPrecio(20000.0);
		
		
		Productos1.setOferta("-30%");
		Productos1.setIdCategoria(1);

		// Creamos la oferta de trabajo 2
		Productos Productos4 = new Productos();
		Productos4.setId(2);
		Productos4.setNombre("Pendientes de Circonia");
		Productos4.setDescripcion("Pendientes de circonias negras con diamantes incrustados. ");
		Productos4.setArchivoImagen(null);
		Productos4.setPrecio(32500.0);

		
		Productos4.setOferta("--");
		Productos4.setIdCategoria(2);

		// Creamos la oferta de trabajo 3
		Productos Productos2 = new Productos();
		Productos2.setId(3);
		Productos2.setNombre("Cadena Brethc");
		Productos2.setDescripcion("Cadena de oro de 24kilates con diseño exclusivo de Versache. ");
		Productos2.setArchivoImagen(null);
		Productos2.setPrecio(19500.0);

	
		Productos2.setOferta("--");
		Productos2.setIdCategoria(1);

		// Creamos la oferta de trabajo 4
		Productos Productos3 = new Productos();
		Productos3.setId(4);
		Productos3.setNombre("Cadena Royals King");
		Productos3.setDescripcion("Cadena de oro con incrustacion del logo versache exclusiva de la temporada. ");
		Productos3.setArchivoImagen(null);
		Productos3.setPrecio(40000.0);

		
		Productos3.setOferta("-6%");
		Productos3.setIdCategoria(1);

		// Creamos la oferta de trabajo 4
		Productos Productos7 = new Productos();
		Productos7.setId(5);
		Productos7.setNombre("Brazalete Brethc");
		Productos7.setDescripcion("Brazalete de oro laminado de 24 kilates con diseño exclusivo de Versache. ");
		Productos7.setArchivoImagen(null);
		Productos7.setPrecio(2500.0);

		
		Productos7.setOferta("-5%");
		Productos7.setIdCategoria(3);

		// Creamos la oferta de trabajo 4
		Productos Productos8 = new Productos();
		Productos8.setId(6);
		Productos8.setNombre("Brazalete Medusa");
		Productos8.setDescripcion(
				"Brazalete de oro y plata con incrustacion de oro del logo Medusa ícono de Versache. ");
		Productos8.setArchivoImagen(null);
		Productos8.setPrecio(20000.0);
		
		
		Productos8.setOferta("-30%");
		Productos8.setIdCategoria(3);

		// Creamos la oferta de trabajo 4
		Productos Productos9 = new Productos();
		Productos9.setId(7);
		Productos9.setNombre("Pulsera Leitreh");
		Productos9.setDescripcion("Pulsera de cuero con incrustaciones de oro con el logo ícono de Versache. ");
		Productos9.setArchivoImagen(null);
		Productos9.setPrecio(10500.0);
		
		
		Productos9.setOferta("--");
		Productos9.setIdCategoria(3);

		// Creamos la oferta de trabajo 4
		Productos Productos5 = new Productos();
		Productos5.setId(8);
		Productos5.setNombre("Pendientes de Perla");
		Productos5.setDescripcion(
				"Pendientes de oro con logo Versache con incrustaciones de perlas blancas exclusivas de temporada. ");
		Productos5.setArchivoImagen(null);
		Productos5.setPrecio(45000.0);
		
		
		Productos5.setOferta("-25%");
		Productos5.setIdCategoria(2);

		// Creamos la oferta de trabajo 4
		Productos Productos6 = new Productos();
		Productos6.setId(9);
		Productos6.setNombre("Pendientes Medusa");
		Productos6.setDescripcion(
				"Pendientes de oro con incrustaciones de diamantes con diseño exclusivo de Versache. ");
		Productos6.setArchivoImagen(null);
		Productos6.setPrecio(20000.0);
		
		
		Productos6.setOferta("-14%");
		Productos6.setIdCategoria(2);

		// Agregamos los 4 objetos de tipo Vacante a la lista...
		lista.add(Productos1);
		lista.add(Productos2);
		lista.add(Productos3);
		lista.add(Productos4);
		lista.add(Productos5);
		lista.add(Productos6);
		lista.add(Productos7);
		lista.add(Productos8);
		lista.add(Productos9);

	}

	@Override
	public List<Productos> buscarTodas() {
		return lista;
	}

	@Override
	public Productos buscarPorId(Integer idProductos) {

		for (Productos v : lista) {
			if (v.getId() == idProductos) {
				return v;
			}
		}

		return null;
	}

	@Override
	public void guardar(Productos productos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Integer idProductos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Productos productos) {
		// TODO Auto-generated method stub
		
	}

}
