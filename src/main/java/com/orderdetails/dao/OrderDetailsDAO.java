package com.orderdetails.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orderdetails.entity.OrderDetails;

public interface OrderDetailsDAO extends JpaRepository<OrderDetails, Integer>{

}
