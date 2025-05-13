package com.sj.cardemo.simple_car_demo.repo;

import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.sj.cardemo.simple_car_demo.service.model.Car;

@Component
public class CarRepo {
	
	//Set<Car> cars;
	
	

	public Set<Car> getCars() {
		Set<Car> cars = new TreeSet<>();
		Car c1 = new Car(1,"blue","Merc");
		Car c2 = new Car(2,"skyBlue","ECreta");
		Car c3 = new Car(3,"grey","Honda City");
		cars.add(c1);
		cars.add(c2);
		cars.add(c3);
		return cars;
		
	}
	
	public Car findCarById(int id) {
		Set<Car> cars = getCars();
		Car c =null;
		for(Car car:cars) {
			if (car.getId() ==id)
				c =car;
		}
        return c;
	}
    /*
	public Set<Car> setCars(Set cars) {
		
	}*/
	
	public Car addNewCar(Car car) {
		Set<Car> cars = getCars();
		cars.add(car);
		Car c =null;
		for(Car car1:cars) {
			if (car1.getId() ==car.getId())
				c = car1;
		}
        return c;
	
	}

	public Set<Car> updateCar(Car car) {
		// TODO Auto-generated method stub
		Car toUpdate = new Car();
		Set<Car> cars = getCars();		
	
			toUpdate.setColour(car.getColour());
			toUpdate.setModel(car.getModel());
			toUpdate.setId(car.getId());
			
			cars.remove(findCarById(car.getId()));
			cars.add(toUpdate);
		  return	cars;
			
			
		}

	public void deleteCar(int id) {
		// TODO Auto-generated method stub
	   Car toDelete=	findCarById(id);
	   Set<Car> cars = getCars();
	   cars.remove(toDelete);
	   
	}
	
}
	

	
	


