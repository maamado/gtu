package com.apirest.restservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Comercio {

	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;	
	private String tiempoEspera;
	private String nombre;
	private String rubro;
	private String usuario;
	private String direccion;
// AES 128
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTiempoEspera() {
		return tiempoEspera;
	}

	public void setTiempoEspera(String tiempoEspera) {
		this.tiempoEspera = tiempoEspera;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRubro() {
		return rubro;
	}

	public void setRubro(String rubro) {
		this.rubro = rubro;
	}
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "User{" + "id='" + id + '\'' + ", tiempoEspera='" + tiempoEspera + '\'' + ", nombre='" + nombre + '\''
				+ ", rubro='" + rubro + '\'' + ", usuario='" + usuario + '\'' + '}';
	}
}
