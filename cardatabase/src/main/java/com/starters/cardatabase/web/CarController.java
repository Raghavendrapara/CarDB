package com.starters.cardatabase.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.starters.cardatabase.domain.Car;
import com.starters.cardatabase.domain.CarRepository;

@RestController
public class CarController {

	@Autowired
	private CarRepository repository;
	@RequestMapping(value="/cars", method=RequestMethod.GET)
	public Iterable<Car> getCars(){
		return repository.findAll();
	}
}
