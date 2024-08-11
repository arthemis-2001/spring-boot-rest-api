package com.artemtartakovsky.learn_spring_boot.ponies.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.artemtartakovsky.learn_spring_boot.ponies.bean.Pony;

@RestController
public class PonyController {
	// http://localhost:8080/ponies
	@GetMapping("/ponies")
	public List<Pony> getAllPonies() {
		return Arrays.asList(new Pony(1, "Rainbow Dash", "Pegasus"), new Pony(2, "Pinkie Pie", "Earth Pony"));
	}

	// http://localhost:8080/ponies/1
	@GetMapping("/ponies/1")
	public Pony getPony() {
		return new Pony(1, "Fluttershy", "Pegasus");
	}
}
