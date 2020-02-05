package com.homecourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homecourse.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
