package com.sujan.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sujan.demo.model.Jewellry;
import com.sujan.demo.model.Orders;
import com.sujan.demo.model.User;
import com.sujan.demo.repositories.OrdersRepository;

@Service
public class OrdersService {
	
	@Autowired
	OrdersRepository ordersrepository;
	
	public ResponseEntity<Orders> createOrders(Orders orders) {
		try {
			Orders ordersNew = ordersrepository.save(new Orders(orders.getjewellryName(), orders.getPrice(), orders.getcustomerName(), orders.getAddress()));
		    return new ResponseEntity<>(ordersNew, HttpStatus.CREATED);
		} catch (Exception e) {
		    return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
		}
	}
	
//	public ResponseEntity<List<Orders>> listOrders() {
//		try {
//		    List<Orders> orders = new ArrayList<Orders>();
//		    ordersrepository.findAll().forEach(orders::add);
//		    if (orders.isEmpty()) {
//		      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//		    }
//		    return new ResponseEntity<>(orders, HttpStatus.OK);
//		} catch (Exception e) {
//		    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}
//	
//	public ResponseEntity<HttpStatus> deleteOrders(String id) {
//		Optional<Orders> orders = ordersrepository.findById(id);
//		if (orders.isPresent()) {
//			ordersrepository.delete(orders.get());
//		    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//		} else {
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		}
//	}
	

}
