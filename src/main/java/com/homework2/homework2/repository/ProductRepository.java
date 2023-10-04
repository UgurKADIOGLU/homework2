package com.homework2.homework2.repository;

import com.homework2.homework2.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
