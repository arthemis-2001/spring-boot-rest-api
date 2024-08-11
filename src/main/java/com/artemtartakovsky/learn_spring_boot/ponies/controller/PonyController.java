package com.artemtartakovsky.learn_spring_boot.ponies.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.artemtartakovsky.learn_spring_boot.ponies.bean.Pony;
import com.artemtartakovsky.learn_spring_boot.ponies.repository.PonyRepository;

@RestController
public class PonyController {

	@Autowired
	private PonyRepository repository;

	// http://localhost:8080/ponies
	@GetMapping("/ponies")
	public List<Pony> getAllPonies() {
//		return Arrays.asList(new Pony(1, "Rainbow Dash", "Pegasus"), new Pony(2, "Pinkie Pie", "Earth Pony"));
		return repository.findAll();
	}

	// http://localhost:8080/ponies/{id}
	@GetMapping("/ponies/{id}")
	public Pony getPony(@PathVariable long id) {
		Optional<Pony> pony = repository.findById(id);
		if (pony.isEmpty()) {
			throw new RuntimeException("Pony not found with id " + id);
		}

		return pony.get();
	}
}
