package com.starters.cardatabase.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


	public interface CarRepository extends CrudRepository <Car, Long>{

	//Fetch cars by brand using SQL
	@Query("select c from Car c  where c.brand= ?1")
	List<Car> findByBrand(String brand);
	//Fetch cars by year
	List<Car> findByYear(int year);
	//Fetch cars by brand and color
	List<Car> findByBrandAndColor(String brand, String color);
	//Fetch cars by brand and sort by year
	List<Car> findByBrandOrderByYearAsc(String brand);
	
	}