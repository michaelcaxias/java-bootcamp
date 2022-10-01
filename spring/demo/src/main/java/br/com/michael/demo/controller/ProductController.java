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

    @GetMapping("/")
    public ResponseEntity<List<Product>> getAll() {
        List<Product> products = new ProductService().getAll();
        return ResponseEntity.ok(products);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findProductById(@PathVariable("id") String id) {
        try {
            int currentId = Integer.parseInt(id);
            Product product = new ProductService().findProductById(currentId);
            return new ResponseEntity<>(product, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Erro teste", HttpStatus.NOT_FOUND);
        }

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Product> deleteById(@PathVariable("id") int id) {
        Product product = new ProductService().deleteById(id);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }
}
