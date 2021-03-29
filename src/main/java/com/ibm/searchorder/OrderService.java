
package com.ibm.searchorder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	@Autowired
	OrderRepository orderRepository;//DI is used here

	public List<Order> getOrders() {
		return orderRepository.findAll();
		
//		public Optional<Order> getOrder(String orderId) {
//			return orderRepository.findById(orderId);
//		}

	}

}