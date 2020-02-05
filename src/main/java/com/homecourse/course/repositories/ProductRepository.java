package com.homecourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homecourse.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
