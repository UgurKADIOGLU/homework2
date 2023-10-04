package com.homework2.homework2.contoller;

import com.homework2.homework2.dto.ProductPutRequestDto;
import com.homework2.homework2.dto.ProductPutResponseDto;
import com.homework2.homework2.entities.Product;
import com.homework2.homework2.entities.User;
import com.homework2.homework2.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;
    @PostMapping
    public Product save(Product product){
       return productService.save(product);
    }
    @GetMapping
    public List<Product> findAll(){
        return productService.findAll();
    }
    @GetMapping("{id}")
    public Product findById(@PathVariable Long id){
        return productService.findById(id);
    }
    @DeleteMapping("delete/{id}")
    public void deleteById(@PathVariable Long id){
        productService.deleteById(id);
    }
    @PutMapping("{id}")
    public ProductPutResponseDto put(ProductPutRequestDto productPutRequestDto){
        return productService.put(productPutRequestDto);
    }
}
