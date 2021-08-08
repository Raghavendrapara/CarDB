package com.starters.cardatabase.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.starters.cardatabase.domain.Car;
import com.starters.cardatabase.domain.CarRepository;
import com.starters.cardatabase.domain.Owner;

@RestController
public class CarController {

	@Autowired
	private CarRepository repository;
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public Iterable<Car> getCars(){
		return repository.findAll();
	}
	
	@GetMapping(path = "cars/{id}")
	public Car getCarById(@PathVariable("id") long id) {
		return repository.findById(id).get();
	}
	@GetMapping(path="cars/{id}/owner")
	public Owner getCarOwner(@PathVariable("id") long id) {
		return repository.findById(id).get().getOwner();
	}
}
