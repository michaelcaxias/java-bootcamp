package br.com.dh.spring03.service;

import br.com.dh.spring03.model.Vehicle;

import java.util.List;

public interface IVehicle {
    Vehicle get(String board);
    List<Vehicle> getAll();
}
