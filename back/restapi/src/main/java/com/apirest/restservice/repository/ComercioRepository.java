package com.apirest.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.apirest.restservice.entity.Comercio;

@RestResource(exported = false)
public interface ComercioRepository extends JpaRepository<Comercio, Long> {


}
