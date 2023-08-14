package com.example.criteria;

import java.util.List;
import java.util.Map;

import com.example.simple.Product;

public interface ProductDaoCriteria {
    void saveProduct(Product product);
    Product getProductById(Long id);
    List<Product> getAllProducts();
    void updateProduct(Product product);
    void deleteProduct(Product product);
	List<Product> getAllProductsOrderedByName();
	Map<Integer, Long> getProductsGroupedByYear();
}
