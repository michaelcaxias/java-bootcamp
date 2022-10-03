package br.com.dh.spring03.controller;

import br.com.dh.spring03.model.Vehicle;
import br.com.dh.spring03.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    @Autowired // injeçao de dependencias (o framework gera o objeto)
    private VehicleService service;

    @GetMapping("/{board}")
    public ResponseEntity<Vehicle> getByBoard(@PathVariable String board) {
        Vehicle vehicle = service.getByBoard(board);

        return new ResponseEntity<>(vehicle, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<Vehicle>> getAll() {
        List<Vehicle> vehicles = service.getAll();

        return new ResponseEntity<>(vehicles, HttpStatus.OK);
    }

    @GetMapping("/byvalue")
    public ResponseEntity<List<Vehicle>> getAllOrderByValue() {
        List<Vehicle> vehicles = service.getAllOrderByValue();

        return new ResponseEntity<>(vehicles, HttpStatus.OK);
    }

    @GetMapping("/model/{model}")
    public ResponseEntity<List<Vehicle>> getByModel(@PathVariable String model) {
        List<Vehicle> vehicles = service.getByModel(model);

        return new ResponseEntity<>(vehicles, HttpStatus.OK);
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Vehicle vehicle) {
        service.create(vehicle);
    }
}
