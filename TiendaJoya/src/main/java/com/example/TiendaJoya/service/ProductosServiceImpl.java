package com.example.TiendaJoya.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

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
				producto1.setOfertas("-30%");
				producto1.setCategoria(1);
				
				
				// Creamos la oferta de trabajo 2
				Producto producto4 = new Producto();
				producto4.setId(2);
				producto4.setNombre("Pendientes de Circonia");
				producto4.setDescripcion("Pendientes de circonias negras con diamantes incrustados. ");
				producto4.setFecha(sdf.parse("09-02-2019"));
				producto4.setPrecio(32500.0);
				producto4.setDestacado(0);
				producto4.setImagen("joya2.webp");
				producto4.setOfertas("--");
				producto4.setCategoria(2);

				// Creamos la oferta de trabajo 3
				Producto producto2 = new Producto();
				producto2.setId(3);
				producto2.setNombre("Cadena Brethc");
				producto2.setDescripcion("Cadena de oro de 24kilates con diseño exclusivo de Versache. ");
				producto2.setFecha(sdf.parse("10-02-2019"));
				producto2.setPrecio(19500.0);
				producto2.setDestacado(0);
				producto2.setImagen("joya3.webp");
				producto2.setOfertas("--");
				producto2.setCategoria(1);
				
				// Creamos la oferta de trabajo 4
				Producto producto3 = new Producto();
				producto3.setId(4);
				producto3.setNombre("Cadena Royals King");
				producto3.setDescripcion("Cadena de oro con incrustacion del logo versache exclusiva de la temporada. ");
				producto3.setFecha(sdf.parse("11-02-2019"));
				producto3.setPrecio(40000.0);
				producto3.setDestacado(1);
				producto3.setImagen("joya4.webp");
				producto3.setOfertas("-6%");
				producto3.setCategoria(1);
				
				// Creamos la oferta de trabajo 4
				Producto producto7 = new Producto();
				producto7.setId(5);
				producto7.setNombre("Brazalete Brethc");
				producto7.setDescripcion("Brazalete de oro laminado de 24 kilates con diseño exclusivo de Versache. ");
				producto7.setFecha(sdf.parse("11-02-2019"));
				producto7.setPrecio(2500.0);
				producto7.setDestacado(1);
				producto7.setImagen("joya5.webp");
				producto7.setOfertas("-5%");
				producto7.setCategoria(3);
				
				// Creamos la oferta de trabajo 4
				Producto producto8 = new Producto();
				producto8.setId(6);
				producto8.setNombre("Brazalete Medusa");
				producto8.setDescripcion("Brazalete de oro y plata con incrustacion de oro del logo Medusa ícono de Versache. ");
				producto8.setFecha(sdf.parse("11-02-2019"));
				producto8.setPrecio(20000.0);
				producto8.setDestacado(1);
				producto8.setImagen("joya6.webp");
				producto8.setOfertas("-30%");
				producto8.setCategoria(3);
				
				// Creamos la oferta de trabajo 4
				Producto producto9 = new Producto();
				producto9.setId(7);
				producto9.setNombre("Pulsera Leitreh");
				producto9.setDescripcion("Pulsera de cuero con incrustaciones de oro con el logo ícono de Versache. ");
				producto9.setFecha(sdf.parse("11-02-2019"));
				producto9.setPrecio(10500.0);
				producto9.setDestacado(0);
				producto9.setImagen("joya7.webp");
				producto9.setOfertas("--");
				producto9.setCategoria(3);
				
				// Creamos la oferta de trabajo 4
				Producto producto5 = new Producto();
				producto5.setId(8);
				producto5.setNombre("Pendientes de Perla");
				producto5.setDescripcion("Pendientes de oro con logo Versache con incrustaciones de perlas blancas exclusivas de temporada. ");
				producto5.setFecha(sdf.parse("11-02-2019"));
				producto5.setPrecio(45000.0);
				producto5.setDestacado(1);
				producto5.setImagen("joya8.webp");
				producto5.setOfertas("-25%");
				producto5.setCategoria(2);
				
				// Creamos la oferta de trabajo 4
				Producto producto6 = new Producto();
				producto6.setId(9);
				producto6.setNombre("Pendientes Medusa");
				producto6.setDescripcion("Pendientes de oro con incrustaciones de diamantes con diseño exclusivo de Versache. ");
				producto6.setFecha(sdf.parse("11-02-2019"));
				producto6.setPrecio(20000.0);
				producto6.setDestacado(1);
				producto6.setImagen("joya9.webp");
				producto6.setOfertas("-14%");
				producto6.setCategoria(2);
				
				
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


