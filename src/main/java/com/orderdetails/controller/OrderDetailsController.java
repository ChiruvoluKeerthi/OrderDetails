package com.orderdetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.orderdetails.entity.OrderDetails;
import com.orderdetails.service.OrderDetailsService;



@RestController
public class OrderDetailsController {

	@Autowired
	private OrderDetailsService orderdetailsService;
	

	@GetMapping("/OrderDetails")
	public List<OrderDetails> getAllOrderDetails() {
		return this.orderdetailsService.getAllOrderDetails();
	}
	@GetMapping("/OrderDetails/{orderId}")
	public OrderDetails getOrderDetailsById(@PathVariable Integer orderId) {
		return this.orderdetailsService.getOrderDetailsById(orderId);
}
	
	
	@PostMapping("/OrderDetails")
	public OrderDetails addOrderDetails(@RequestBody OrderDetails orderdetails) {
		
			return this.orderdetailsService.addOrderDetails(orderdetails);
	}
	
	@PutMapping("/OrderDetails") 
	public OrderDetails updateOrderDetails(@RequestBody OrderDetails orderdetails) {
		return this.orderdetailsService.updateOrderDetails(orderdetails);
	
	}
@DeleteMapping("/OrderDetails/{orderId}")
public void deleteOrderDetailsById(@PathVariable Integer orderId) {
	this.orderdetailsService.deleteOrderDetailsById(orderId);
}

}
