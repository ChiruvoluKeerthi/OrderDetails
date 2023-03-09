package com.orderdetails.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table
public class OrderDetails {
@Id
@Column(name="orderid")
private Integer orderId;
@JoinColumn
@Column(name="customerid")
private Integer customerId;
public OrderDetails(Integer orderId, Integer customerId) {
	super();
	this.orderId = orderId;
	this.customerId = customerId;
}
public OrderDetails() {
	super();
}
public Integer getOrderId() {
	return orderId;
}
public void setOrderId(Integer orderId) {
	this.orderId = orderId;
}
public Integer getCustomerId() {
	return customerId;
}
public void setCustomerId(Integer customerId) {
	this.customerId = customerId;
}
@Override
public String toString() {
	return "OrderDetails [orderId=" + orderId + ", customerId=" + customerId + "]";
}

}
