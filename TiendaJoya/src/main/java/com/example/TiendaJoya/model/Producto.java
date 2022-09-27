package com.example.TiendaJoya.model;
import java.util.Date;

public class Producto {

		private Integer id;
		private String nombre;
		private String descripcion;
		private Date fecha;
		private Double precio;
		private String ofertas;
		private Integer destacado;
		private Integer categoria;
		
		
		
		public void setCategoria(Integer categoria) {
			this.categoria = categoria;
		}
	
		private String imagen="no-image.png";
		
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		public String getOfertas() {
			return ofertas;
		}
		public void setOfertas(String ofertas) {
			this.ofertas = ofertas;
		}
		public Date getFecha() {
			return fecha;
		}
		public void setFecha(Date fecha) {
			this.fecha = fecha;
		}
		public Double getPrecio() {
			return precio;
		}
		public void setPrecio(Double precio) {
			this.precio = precio;
		}
		public Integer getDestacado() {
			return destacado;
		}
		public Integer getCategoria() {
			return categoria;
		}
		public void setDestacado(Integer destacado) {
			this.destacado = destacado;
		}
		
		public String getImagen() {
			return imagen;
		}
		public void setImagen(String imagen) {
			this.imagen = imagen;
		}
		@Override
		public String toString() {
			return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fecha=" + fecha
					+ ", precio=" + precio + ", ofertas=" + ofertas + ", categoria=" + categoria + ", destacado="
					+ destacado + ", imagen=" + imagen + "]";
		}
		
		
		
		
	}




