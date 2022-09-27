package com.example.TiendaJoya.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.TiendaJoya.model.Producto;

import org.springframework.stereotype.Service;

@Service
public class ProductosServiceImpl implements IProductosService {

		private List<Producto> lista = null;
		
		public ProductosServiceImpl() {
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			lista = new LinkedList<Producto>();
			try {
				// Creamos la oferta de trabajo 1
				Producto producto1 = new Producto();
				producto1.setId(1);
				producto1.setNombre("Collar V");
				producto1.setDescripcion("Cadena de oro delgada con dije V exclusivo de Versache. ");
				producto1.setFecha(sdf.parse("08-02-2019"));
				producto1.setPrecio(20000.0);
				producto1.setDestacado(1);
				producto1.setImagen("joya1.webp");
				
				// Creamos la oferta de trabajo 2
				Producto producto2 = new Producto();
				producto2.setId(2);
				producto2.setNombre("Pendientes de Circonia");
				producto2.setDescripcion("Pendientes de circonias negras con diamantes incrustados. ");
				producto2.setFecha(sdf.parse("09-02-2019"));
				producto2.setPrecio(32500.0);
				producto2.setDestacado(0);
				producto2.setImagen("joya2.webp");

				// Creamos la oferta de trabajo 3
				Producto producto3 = new Producto();
				producto3.setId(3);
				producto3.setNombre("Cadena Brethc");
				producto3.setDescripcion("Cadena de oro de 24kilates con diseño exclusivo de Versache. ");
				producto3.setFecha(sdf.parse("10-02-2019"));
				producto3.setPrecio(19500.0);
				producto3.setDestacado(0);
				producto3.setImagen("joya3.webp");
				
				// Creamos la oferta de trabajo 4
				Producto producto4 = new Producto();
				producto4.setId(4);
				producto4.setNombre("Cadena Royals King");
				producto4.setDescripcion("Cadena de oro con incrustacion del logo versache exclusiva de la temporada. ");
				producto4.setFecha(sdf.parse("11-02-2019"));
				producto4.setPrecio(40000.0);
				producto4.setDestacado(1);
				producto4.setImagen("joya4.webp");
				
				// Creamos la oferta de trabajo 4
				Producto producto5 = new Producto();
				producto5.setId(5);
				producto5.setNombre("Brazalete Brethc");
				producto5.setDescripcion("Brazalete de oro laminado de 24 kilates con diseño exclusivo de Versache. ");
				producto5.setFecha(sdf.parse("11-02-2019"));
				producto5.setPrecio(2500.0);
				producto5.setDestacado(1);
				producto5.setImagen("joya5.webp");
				
				// Creamos la oferta de trabajo 4
				Producto producto6 = new Producto();
				producto6.setId(6);
				producto6.setNombre("Brazalete Medusa");
				producto6.setDescripcion("Brazalete de oro y plata con incrustacion de oro del logo Medusa ícono de Versache. ");
				producto6.setFecha(sdf.parse("11-02-2019"));
				producto6.setPrecio(20000.0);
				producto6.setDestacado(1);
				producto6.setImagen("joya6.webp");
				
				// Creamos la oferta de trabajo 4
				Producto producto7 = new Producto();
				producto7.setId(7);
				producto7.setNombre("Pulsera Leitreh");
				producto7.setDescripcion("Pulsera de cuero con incrustaciones de oro con el logo ícono de Versache. ");
				producto7.setFecha(sdf.parse("11-02-2019"));
				producto7.setPrecio(10500.0);
				producto7.setDestacado(0);
				producto7.setImagen("joya7.webp");
				
				// Creamos la oferta de trabajo 4
				Producto producto8 = new Producto();
				producto8.setId(8);
				producto8.setNombre("Pendientes de Perla");
				producto8.setDescripcion("Pendientes de oro con logo Versache con incrustaciones de perlas blancas exclusivas de temporada. ");
				producto8.setFecha(sdf.parse("11-02-2019"));
				producto8.setPrecio(45000.0);
				producto8.setDestacado(1);
				producto8.setImagen("joya8.webp");
				
				// Creamos la oferta de trabajo 4
				Producto producto9 = new Producto();
				producto9.setId(9);
				producto9.setNombre("Pendientes Medusa");
				producto9.setDescripcion("Pendientes de oro con incrustaciones de diamantes con diseño exclusivo de Versache. ");
				producto9.setFecha(sdf.parse("11-02-2019"));
				producto9.setPrecio(20000.0);
				producto9.setDestacado(1);
				producto9.setImagen("joya9.webp");
				
				
				/**
				 * Agregamos los 4 objetos de tipo Vacante a la lista...
				 * 
				 */
				
				lista.add(producto1);
				lista.add(producto2);
				lista.add(producto3);
				lista.add(producto4);
				lista.add(producto5);
				lista.add(producto6);
				lista.add(producto7);
				lista.add(producto8);
				lista.add(producto9);


			} catch (ParseException e) {
				System.out.println("Error: " + e.getMessage());
			}

		}
		
		@Override
		public List<Producto> buscarTodas() {
			return lista;
		}

		@Override
		public Producto buscarPorId(Integer idProducto) {
			
			for (Producto v : lista) {
				if (v.getId()==idProducto) {
					return v;
				}
			}
			
			return null;
		}

	}


