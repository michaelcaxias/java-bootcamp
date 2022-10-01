package br.com.michael.demo.controller;

import br.com.michael.demo.model.Product;
import br.com.michael.demo.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping("/{id}")
    public Product findProductById(@PathVariable("id") int id) {
        return new ProductService().findProductById(id);
    }
}
