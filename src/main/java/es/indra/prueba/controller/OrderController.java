package es.indra.prueba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import es.indra.prueba.entity.Order;
import es.indra.prueba.service.OrderServiceImpl;

@Controller
@RequestMapping("orders")
public class OrderController {
	
	@Autowired
	OrderServiceImpl orderService;
	
	@RequestMapping(value = "/creates/", method = RequestMethod.POST)
	public ResponseEntity<Order> createOrder(@RequestBody Order order) {
		
		orderService.createOrder(order);
		return new ResponseEntity<Order>(order, HttpStatus.CREATED);
	}

}
