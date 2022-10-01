package br.com.michael.demo.controller;

import br.com.michael.demo.model.Product;
import br.com.michael.demo.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping("/{id}")
    public ResponseEntity<Product> findProductById(@PathVariable("id") int id) {
        Product product = new ProductService().findProductById(id);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Product> deleteById(@PathVariable("id") int id) {
        Product product = new ProductService().deleteById(id);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }
}
