package br.com.dh.spring03.service;

import br.com.dh.spring03.exception.NotFoundException;
import br.com.dh.spring03.model.Vehicle;

import java.util.List;

public interface IVehicle {
    Vehicle getByBoard(String board) throws NotFoundException;
    List<Vehicle> getAll();
}
