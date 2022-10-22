package com.example.TiendaJoya.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "administradores")
public class Administradores {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String Username;
	private String Nombre;
	private String Apellido;
	private String Correo;
	private String Password;
	private Integer Estatus;
	private Integer Telefono;
	
	//private Integer idRol;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getCorreo() {
		return Correo;
	}
	public void setCorreo(String correo) {
		Correo = correo;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Integer getEstatus() {
		return Estatus;
	}
	public void setEstatus(Integer estatus) {
		Estatus = estatus;
	}
	public Integer getTelefono() {
		return Telefono;
	}
	public void setTelefono(Integer telefono) {
		Telefono = telefono;
	}
	@Override
	public String toString() {
		return "Administradores [id=" + id + ", Username=" + Username + ", Nombre=" + Nombre + ", Apellido=" + Apellido
				+ ", Correo=" + Correo + ", Password=" + Password + ", Estatus=" + Estatus + ", Telefono=" + Telefono
				+ "]";
	}
		
}
