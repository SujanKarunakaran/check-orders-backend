package com.sujan.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sujan.demo.model.Jewellry;
import com.sujan.demo.model.Orders;
import com.sujan.demo.services.OrdersService;

@CrossOrigin("*")
@RestController
@RequestMapping("/orders")
public class OrdersController {
	
	@Autowired
	OrdersService ordersService;
	
	@PostMapping
    public ResponseEntity<Orders> createOrders(@RequestBody Orders orders){
		return ordersService.createOrders(orders);
	}
	
//	@GetMapping
//    public ResponseEntity<List<Orders>> listOrders(){
//		return ordersService.listOrders();
//    }
//	
//	@DeleteMapping("/{id}")
//	public ResponseEntity<HttpStatus> deleteOrders(@PathVariable int id) {
//	    return ordersService.deleteOrders(id);
//	}

}
