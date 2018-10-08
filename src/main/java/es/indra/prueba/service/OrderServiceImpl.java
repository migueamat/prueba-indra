package es.indra.prueba.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.indra.prueba.entity.Order;
import es.indra.prueba.entity.Phone;
import es.indra.prueba.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {
	
	private static final Logger logger = Logger.getLogger(OrderServiceImpl.class.getName());

	@Autowired
	OrderRepository orderRepository;

	@Override
	public void createOrder(Order order) {

		Double price = calculateTotalPrice(order.getPhoneList());
		logger.info("The order " + order.toString() + "has been stored with a total price of: " + price);
		orderRepository.save(order);
	}

	
	/**
	 * Calculates the totalPrice
	 * 
	 * @param phoneList
	 * @return
	 */
	private Double calculateTotalPrice(List<Phone> phoneList) {
		return phoneList.stream().map(Phone::getPrice).mapToDouble(Double::doubleValue).sum();
	}

}
