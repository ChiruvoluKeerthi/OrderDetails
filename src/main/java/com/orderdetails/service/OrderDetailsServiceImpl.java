package com.orderdetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.orderdetails.dao.OrderDetailsDAO;
import com.orderdetails.entity.OrderDetails;
@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {

	
	@Autowired
	private OrderDetailsDAO orderdetailsDao;
	@Override
	public List<OrderDetails> getAllOrderDetails() {
		return orderdetailsDao.findAll();
	}

	@Override
	public OrderDetails getOrderDetailsById(Integer orderId) {
		OrderDetails od= orderdetailsDao.findById(orderId).get();
		return od;
	}

	@Override
	public OrderDetails addOrderDetails(OrderDetails orderdetails) {
		orderdetailsDao.save(orderdetails);
		return orderdetails;
		
	}

	@Override
	public OrderDetails updateOrderDetails(OrderDetails orderdetails) {
		orderdetailsDao.save(orderdetails);
		return orderdetails;
	
	}

	@Override
	public void deleteOrderDetailsById(Integer orderId) {
	OrderDetails o =orderdetailsDao.getById(orderId);
		orderdetailsDao.delete(o);
		
	}

}
