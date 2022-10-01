package br.com.michael.demo.service;

import br.com.michael.demo.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    List<Product> products = new ArrayList<>();

    public ProductService() {
        products.add(new Product(1, "Macbook Pro 2020", 21000));
        products.add(new Product(2, "Acer Nitro 5", 8000));
        products.add(new Product(3, "GeniusDesk", 3500));
    }

    public Product findProductById(int id) {

        try {
            int currentId = id - 1;
            return products.get(currentId);
        } catch (IndexOutOfBoundsException e) {
            return new Product(id, "Produto inexistente", 0);
        }
    }
}
