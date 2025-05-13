package com.sj.carapp.carapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sj.carapp.carapplication.service.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car,Integer> {
	
	
	            public List<Car> findByModel(String model);
	            public List<Car> findByColour(String colour);
	            
	

}
