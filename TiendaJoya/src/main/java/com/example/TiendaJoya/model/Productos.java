package com.example.TiendaJoya.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productos")
public class Productos {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String Nombre;
	private String Descripcion;
	private String Materiales;
	private String Talla;
	private Double Precio;
	private String Imagen;
	private Double Oferta;
	private Integer idCategoria;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public String getMateriales() {
		return Materiales;
	}
	public void setMateriales(String materiales) {
		Materiales = materiales;
	}
	public String getTalla() {
		return Talla;
	}
	public void setTalla(String talla) {
		Talla = talla;
	}
	public Double getPrecio() {
		return Precio;
	}
	public void setPrecio(Double precio) {
		Precio = precio;
	}
	public String getImagen() {
		return Imagen;
	}
	public void setImagen(String imagen) {
		Imagen = imagen;
	}
	public Double getOferta() {
		return Oferta;
	}
	public void setOferta(Double oferta) {
		Oferta = oferta;
	}
	public Integer getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}
	
	@Override
	public String toString() {
		return "Productos [id=" + id + ", Nombre=" + Nombre + ", Descripcion=" + Descripcion + ", Materiales="
				+ Materiales + ", Talla=" + Talla + ", Precio=" + Precio + ", Imagen=" + Imagen + ", Oferta=" + Oferta
				+ ", idCategoria=" + idCategoria + "]";
	}
	
	
}
