package com.sujan.demo.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sujan.demo.model.Orders;

@Repository
public interface OrdersRepository extends MongoRepository<Orders, String>{
	Optional<Orders> findByjewellryName(String name);
}
