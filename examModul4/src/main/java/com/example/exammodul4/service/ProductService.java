package com.example.exammodul4.service;

import com.example.exammodul4.model.Orders;
import com.example.exammodul4.model.Product;
import com.example.exammodul4.responsitory.OderRepository;
import com.example.exammodul4.responsitory.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product selectById(Long id) {
        return productRepository.findById(id).orElse(null);
    }
}
