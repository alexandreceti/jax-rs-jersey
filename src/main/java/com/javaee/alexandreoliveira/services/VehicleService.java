package com.javaee.alexandreoliveira.services;

import java.util.List;

import com.javaee.alexandreoliveira.domain.Vehicle;

public interface VehicleService {

	List<Vehicle> getAll();

	Vehicle findById(Integer id);

	Vehicle saveVehicle(Vehicle vehicle);

	void deleteById(Integer id);
}