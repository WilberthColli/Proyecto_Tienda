package com.example.TiendaJoya.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="compras")
public class Compras {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idCompra;
	private Date Fecha;
	private Integer idUsuario;
	private Integer idProducto;
	public Integer getIdCompra() {
		return idCompra;
	}
	public void setIdCompra(Integer idCompra) {
		this.idCompra = idCompra;
	}
	public Date getFecha() {
		return Fecha;
	}
	public void setFecha(Date fecha) {
		Fecha = fecha;
	}
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public Integer getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	
	@Override
	public String toString() {
		return "Compras [idCompra=" + idCompra + ", Fecha=" + Fecha + ", idUsuario=" + idUsuario + ", idProducto="
				+ idProducto + "]";
	}
	
	
}
