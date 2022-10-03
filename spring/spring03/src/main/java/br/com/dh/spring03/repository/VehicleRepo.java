package br.com.dh.spring03.repository;

import br.com.dh.spring03.model.Vehicle;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.Arrays;
import java.util.List;

@Repository
public class VehicleRepo {
    private final String linkFile = "src/main/resources/vehicles.json";
    ObjectMapper mapper = new ObjectMapper();

    public Vehicle getByBoard(String board) {
        List<Vehicle> vehicles = null;
        try {
            vehicles = Arrays.asList(mapper.readValue(new File(linkFile), Vehicle[].class));

            for (Vehicle vehicle: vehicles) {
                if (vehicle.getBoard().equals(board)) {
                    return vehicle;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    public List<Vehicle> getAll() {
        List<Vehicle> vehicles = null;
        try {
            vehicles = Arrays.asList(mapper.readValue(new File(linkFile), Vehicle[].class));
            return vehicles;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }
}
