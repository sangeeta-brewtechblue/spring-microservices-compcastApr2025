/**
 * 
 */
package com.sj.carapp.carapplication.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sj.carapp.carapplication.repository.CarRepository;
import com.sj.carapp.carapplication.service.model.Car;

/**
 * @author sange
 *
 */
@Service
public class CarService {
	
	@Autowired
	CarRepository carRepo;
	
	public List<Car> getAllCars(){
		
		 return    carRepo.findAll();
		
	}
	
	public List<Car> getCarsByModel(String model){
		
		return carRepo.findByModel( model);
		
	}
	
     public List<Car> getCarsByColour(String colour){
		
		return carRepo.findByColour( colour);
		
	}
	
	public Car getCarById(int id) {
		  Optional<Car> carOptional=    carRepo.findById(id);
		  if(carOptional.isPresent())
			  return carOptional.get();
		  else
			  return null;
		      
	}
	
	public Car insertCar(Car car) {
		
		  return   carRepo.save(car);
	}
	
	public Car updateCar(Car c, int id) {
		
	    Car foundCar = getCarById(id);
	    
	    foundCar.setColour(c.getColour());
	    foundCar.setModel(c.getModel());
	    return  carRepo.save(foundCar);
	    
	}
	
	
	public List<Car> deleteCar(int id) {
		 Car toDelete = this.getCarById(id);		
		 carRepo.delete(toDelete);
		 return getAllCars();
		
	}
	
	
	

}
