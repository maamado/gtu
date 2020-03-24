package com.apirest.restservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Cola {

	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;	
	private String time;
	private String comercio;
	private String cliente;
	private String posicion;
// AES 128
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getComercio() {
		return comercio;
	}

	public void setComercio(String comercio) {
		this.comercio = comercio;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	@Override
	public String toString() {
		return "User{" + "id='" + id + '\'' + ", time='" + time + '\'' + ", comercio='" + comercio + '\''
				+ ", cliente='" + cliente + '\'' + ", posicion='" + posicion + '\'' + '}';
	}
}
