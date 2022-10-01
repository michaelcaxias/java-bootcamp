package br.com.michael.demo.controller;

import br.com.michael.demo.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    List<Product> products = new ArrayList<>();

    public ProductController() {
        products.add(new Product(1, "Macbook Pro 2020", 21000));
        products.add(new Product(2, "Acer Nitro 5", 8000));
        products.add(new Product(3, "GeniusDesk", 3500));
        System.out.println(products);
    }

    @GetMapping("/{id}")
    public Product findProductById(@PathVariable("id") int id) {
        int currentId = id - 1;
        return products.get(currentId);
    }
}
