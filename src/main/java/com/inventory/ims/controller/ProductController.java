package com.inventory.ims.controller;

import com.inventory.ims.model.Product;
import com.inventory.ims.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    // GET all products
    @GetMapping
    public List<Product> getAllProducts() {
        return service.getAll();
    }

    // GET a product by ID
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return service.getById(id);
    }

    // POST a new product
    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return service.save(product);
    }

    // PUT (update) a product
    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
        return service.update(id, product);
    }

    // DELETE a product
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        service.delete(id);
    }
}
