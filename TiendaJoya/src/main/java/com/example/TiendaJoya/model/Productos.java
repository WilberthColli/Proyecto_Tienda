package com.example.TiendaJoya.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
	private String archivoImagen="no-image.png";
	private String Oferta;

	@OneToOne
	@JoinColumn(name="idCategoria")
	private Categoria categoria;
	
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
	
	public String getOferta() {
		return Oferta;
	}
	public void setOferta(String oferta) {
		this.Oferta = oferta;
	}

	public String getArchivoImagen() {
		return archivoImagen;
	}
	public void setArchivoImagen(String archivoImagen) {
		this.archivoImagen = archivoImagen;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	@Override
	public String toString() {
		return "Productos [id=" + id + ", Nombre=" + Nombre + ", Descripcion=" + Descripcion + ", Materiales="
				+ Materiales + ", Talla=" + Talla + ", Precio=" + Precio + ", archivoImagen=" + archivoImagen
				+ ", Oferta=" + Oferta + ", categoria=" + categoria + "]";
	}
	
}
