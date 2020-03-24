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

import com.apirest.restservice.entity.Cliente;
import com.apirest.restservice.repository.ClienteRepository;

import javassist.tools.web.BadHttpRequest;

@RestController
@RequestMapping(path = "/cliente")
public class ClienteController {

	@Autowired
	private ClienteRepository repository;

	@GetMapping
	public Iterable<Cliente> findAll() {
		return repository.findAll();
	}

	@GetMapping(path = "/{id}")
	public Cliente find(@PathVariable("id") Long id) {
		return repository.findOne(id);
	}

	@PostMapping(consumes = "application/json")
	public Cliente create(@RequestBody Cliente cliente) {
		return repository.save(cliente);
	}

	@DeleteMapping(path = "/{id}")
	public void delete(@PathVariable("id") Long id) {
		repository.delete(id);
	}

	@PutMapping(path = "/{id}")
	public Cliente update(@PathVariable("id") Long id, @RequestBody Cliente cliente) throws BadHttpRequest {
		if (repository.exists(id)) {
			cliente.setId(id);
			return repository.save(cliente);
		} else {
			throw new BadHttpRequest();
		}
	} 

}