package com.apirest.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.apirest.restservice.entity.Cola;

@RestResource(exported = false)
public interface ColaRepository extends JpaRepository<Cola, Long> {


}
