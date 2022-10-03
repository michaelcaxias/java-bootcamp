package br.com.dh.spring03.service;

import br.com.dh.spring03.model.Vehicle;
import br.com.dh.spring03.repository.VehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService  implements IVehicle {
    @Autowired
    private VehicleRepo repository;

    @Override
    public Vehicle getByBoard(String board) {
        return repository.getByBoard(board);
    }

    @Override
    public List<Vehicle> getAll() {
        return null;
    }
}
