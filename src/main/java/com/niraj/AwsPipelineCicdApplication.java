package com.niraj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/orders")
public class AwsPipelineCicdApplication {

	@Autowired
	public OrderDao orderDao;
	
	@GetMapping
	public List<Order> fetchOrder(){
			return orderDao.getOrders().stream()
				.sorted(Comparator.comparing(Order::getPrice)).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AwsPipelineCicdApplication.class, args);
	}

}
