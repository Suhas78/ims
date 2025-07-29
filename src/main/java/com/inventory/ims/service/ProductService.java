package com.inventory.ims.service;

import com.inventory.ims.model.Product;
import com.inventory.ims.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repo;

    // Constructor Injection
    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    // Get all products
    public List<Product> getAll() {
        return repo.findAll();
    }

    // Get one product by ID
    public Product getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    // Create a new product
    public Product save(Product product) {
        return repo.save(product);
    }

    // Update a product
    public Product update(Long id, Product newProduct) {
        Product existing = repo.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(newProduct.getName());
            existing.setCategory(newProduct.getCategory());
            existing.setQuantity(newProduct.getQuantity());
            existing.setPrice(newProduct.getPrice());
            return repo.save(existing);
        }
        return null;
    }

    // Delete a product
    public void delete(Long id) {
        repo.deleteById(id);
    }
}

