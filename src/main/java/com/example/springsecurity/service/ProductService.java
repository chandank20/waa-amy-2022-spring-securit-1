package com.example.springsecurity.service;

import com.example.springsecurity.dto.ProductDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> findAll();

    ProductDto findById(Long id);

    ProductDto save(ProductDto product);

    void remove(Long id);

    List<ProductDto> findAllByPriceGreaterThan(Double minPrice);

    List<ProductDto> findByCategoryNameAndPriceLessThan(String categoryName, Double maxPrice);

    List<ProductDto> findAllByNameContains(String keyword);
}
