package br.com.dh.spring03.controller;

import br.com.dh.spring03.model.Vehicle;
import br.com.dh.spring03.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
