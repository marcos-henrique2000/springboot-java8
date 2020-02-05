package com.homecourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homecourse.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
