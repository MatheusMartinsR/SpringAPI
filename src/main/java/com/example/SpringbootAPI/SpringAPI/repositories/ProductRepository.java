package com.example.SpringbootAPI.SpringAPI.repositories;

import com.example.SpringbootAPI.SpringAPI.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, Long> {
}
