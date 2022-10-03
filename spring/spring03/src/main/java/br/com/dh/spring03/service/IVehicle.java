package br.com.dh.spring03.service;

import br.com.dh.spring03.exception.VehicleNotFoundException;
import br.com.dh.spring03.model.Vehicle;

import java.util.List;

public interface IVehicle {
    Vehicle getByBoard(String board) throws VehicleNotFoundException;
    List<Vehicle> getAll();
}
