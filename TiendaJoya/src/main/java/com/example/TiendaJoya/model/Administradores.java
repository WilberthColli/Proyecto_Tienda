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
import javax.persistence.Table;

@Entity
@Table(name = "administradores")
public class Administradores {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String Username;
	private String Nombre;
	private String Correo;
	private String Password;
	private Integer Estatus;
	private Integer Telefono;
	
	/*
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="AdminRol",
			   joinColumns = @JoinColumn(name="idAdmin"),
			   inverseJoinColumns = @JoinColumn(name="idRol"))
	
	private List<Roles> roles;
	public void agregar(Roles tempRol) {
		if (roles == null) {
			roles = new LinkedList<Roles>();
		}
		roles.add(tempRol);
	} 
	*/
	
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
		return "Administradores [id=" + id + ", Username=" + Username + ", Nombre=" + Nombre + 
				", Correo=" + Correo + ", Password=" + Password + ", Estatus=" + Estatus + ", Telefono=" + Telefono
				+ "]";
	}
		
}
