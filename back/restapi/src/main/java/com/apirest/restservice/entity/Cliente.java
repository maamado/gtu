package com.apirest.restservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Cliente {

	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;	
	private String nombreUsuario;
	private String validacion;
// AES 128
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getValidacion() {
		return validacion;
	}

	public void setValidacion(String validacion) {
		this.validacion = validacion;
	}

	

	@Override
	public String toString() {
		return "Cliente{" + "id='" + id + '\'' + ", nombreUsuario='" + nombreUsuario + '\'' + ", validacion='" + validacion  + '\'' + '}';
	}
}
