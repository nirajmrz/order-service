package com.niraj;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

@Repository
public class OrderDao {

	public List<Order> getOrders(){
		return Stream.of(
				new Order(1, "Iphone 12", 1, 2000),
				new Order(2, "Iphone 11", 1, 1500),
				new Order(3, "Iphone 10", 1, 1000),
				new Order(4, "Iphone 8", 1, 500),
				new Order(5, "Iphone 7", 1, 200)
				).collect(Collectors.toList());
	}
	 
	
}
