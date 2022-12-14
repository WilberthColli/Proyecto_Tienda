package com.example.TiendaJoya.model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "administradores")
public class Administradores {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String Nombre;
	private String Correo;
	private String username;
	private String Password;
	private Integer Estatus;
	private Integer Telefono;
	@OneToOne
	@JoinColumn(name="idRol")
	private Roles rol;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public Roles getRol() {
		return rol;
	}
	public void setRol(Roles rol) {
		this.rol = rol;
	}
	
	@Override
	public String toString() {
		return "Administradores [id=" + id + ", Nombre=" + Nombre + ", Correo=" + Correo + ", username=" + username
				+ ", Password=" + Password + ", Estatus=" + Estatus + ", Telefono=" + Telefono + ", rol=" + rol + "]";
	}
	
	
}
