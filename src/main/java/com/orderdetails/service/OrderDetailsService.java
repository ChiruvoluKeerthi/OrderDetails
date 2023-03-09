package com.orderdetails.service;

import java.util.List;

import com.orderdetails.entity.OrderDetails;



public interface OrderDetailsService {
	public List<OrderDetails> getAllOrderDetails();
	public OrderDetails getOrderDetailsById(Integer orderId);
	public OrderDetails addOrderDetails(OrderDetails orderdetails);
	public OrderDetails updateOrderDetails(OrderDetails orderdetails);
	public void deleteOrderDetailsById(Integer OrderId);
}
