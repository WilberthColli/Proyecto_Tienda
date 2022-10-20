package com.example.TiendaJoya.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clientes")
public class Clientes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String Nombre;
	private String Correo;
	private String Direccion;
	private Integer Telefono;
	private Date Cumple;
	
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
	public String getCorreo() {
		return Correo;
	}
	public void setCorreo(String correo) {
		Correo = correo;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public Integer getTelefono() {
		return Telefono;
	}
	public void setTelefono(Integer telefono) {
		Telefono = telefono;
	}
	public Date getCumple() {
		return Cumple;
	}
	public void setCumple(Date cumple) {
		Cumple = cumple;
	}
	
	@Override
	public String toString() {
		return "Clientes [id=" + id + ", Nombre=" + Nombre + ", Correo=" + Correo + ", Direccion=" + Direccion
				+ ", Telefono=" + Telefono + ", Cumple=" + Cumple + "]";
	}
	
	
}
