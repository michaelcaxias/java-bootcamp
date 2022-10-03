package br.com.dh.spring03.service;

import br.com.dh.spring03.model.Vehicle;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService  implements IVehicle {
    @Override
    public Vehicle get(String board) {
        return new Vehicle(board, "Tesla", 2022, 15_000);
    }

    @Override
    public List<Vehicle> getAll() {
        return null;
    }
}
