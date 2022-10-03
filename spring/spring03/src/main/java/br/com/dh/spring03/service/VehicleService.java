package br.com.dh.spring03.service;

import br.com.dh.spring03.exception.NotFound;
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
    public Vehicle getByBoard(String board) throws NotFound {
        Vehicle vehicle = repository.getByBoard(board);

        if (vehicle == null) {
            throw new NotFound("Veiculo nao encontrado");
        }

        return vehicle;
    }

    @Override
    public List<Vehicle> getAll() {
        return null;
    }
}
