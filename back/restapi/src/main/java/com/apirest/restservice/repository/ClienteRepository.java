package com.apirest.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.apirest.restservice.entity.Cliente;

@RestResource(exported = false)
public interface ClienteRepository extends JpaRepository<Cliente, Long> {


}
