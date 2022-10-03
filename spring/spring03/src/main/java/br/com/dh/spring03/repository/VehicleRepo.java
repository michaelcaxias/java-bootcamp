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

    public Vehicle get(String board) {
        List<Vehicle> vehicles = null;
        try {
            vehicles = Arrays.asList(mapper.readValue(new File(linkFile), Vehicle[].class));
        } catch (Exception e) {
            System.out.println("Deu pau");
        }
        for (Vehicle vehicle: vehicles) {
            if (vehicle.getBoard().equals(board)) {
                return vehicle;
            }
        }
        return null;
    }
}
