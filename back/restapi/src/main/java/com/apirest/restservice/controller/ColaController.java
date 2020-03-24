package com.apirest.restservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.restservice.entity.Cola;
import com.apirest.restservice.repository.ColaRepository;

import javassist.tools.web.BadHttpRequest;

@RestController
@RequestMapping(path = "/cola")
public class ColaController {

	@Autowired
	private ColaRepository repository;

	@GetMapping
	public Iterable<Cola> findAll() {
		return repository.findAll();
	}

	@GetMapping(path = "/{id}")
	public Cola find(@PathVariable("id") Long id) {
		return repository.findOne(id);
	}

	@PostMapping(consumes = "application/json")
	public Cola create(@RequestBody Cola cola) {
		return repository.save(cola);
	}

	@DeleteMapping(path = "/{id}")
	public void delete(@PathVariable("id") Long id) {
		repository.delete(id);
	}

	@PutMapping(path = "/{id}")
	public Cola update(@PathVariable("id") Long id, @RequestBody Cola cola) throws BadHttpRequest {
		if (repository.exists(id)) {
			cola.setId(id);
			return repository.save(cola);
		} else {
			throw new BadHttpRequest();
		}
	} 

}