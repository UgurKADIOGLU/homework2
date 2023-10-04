package com.homework2.homework2.services;
import com.homework2.homework2.entities.Product;
import com.homework2.homework2.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    public Product save(Product product) {
        return productRepository.save(product);
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

    public Product put(Long id) {
        Product product=productRepository.findById(id).orElse(null);
        return productRepository.save(product);
    }
}
