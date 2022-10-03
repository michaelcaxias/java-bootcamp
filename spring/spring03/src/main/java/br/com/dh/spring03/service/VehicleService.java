package br.com.dh.spring03.service;

import br.com.dh.spring03.exception.NotFoundException;
import br.com.dh.spring03.model.Vehicle;
import br.com.dh.spring03.repository.VehicleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VehicleService  implements IVehicle {
    @Autowired
    private VehicleRepo repository;

    @Override
    public Vehicle getByBoard(String board) throws NotFoundException {
        Vehicle vehicle = repository.getByBoard(board);

        if (vehicle == null) {
            throw new NotFoundException("Veiculo nao encontrado");
        }

        return vehicle;
    }

    @Override
    public List<Vehicle> getAll() {
        List<Vehicle> vehicles = repository.getAll();

        if (vehicles == null) {
            throw new NotFoundException("Veiculo nao encontrado");
        }

        return vehicles;
    }

    @Override
    public List<Vehicle> getAllOrderByValue() {
        List<Vehicle> vehicles = repository.getAll();

        if (vehicles == null) {
            throw new NotFoundException("Veiculo nao encontrado");
        }

        return vehicles.stream().sorted().collect(Collectors.toList());
    }

    @Override
    public void create(Vehicle vehicle) {
        repository.addVehicle(vehicle);
    }

    @Override
    public List<Vehicle> getByModel(String model) {
        return this.getAll().stream()
                .filter((vehicle -> vehicle.getModel().toLowerCase().contains(model.toLowerCase())))
                .collect(Collectors.toList());
    }

}
