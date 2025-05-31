package com.codewithmosh.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		ApplicationContext contex = SpringApplication.run(StoreApplication.class, args);
		var orderService = contex.getBean(OrderService.class);
		orderService.placeOrder();
//		var orderService = new OrderService(new StripPaymentService());
//		orderService.placeOrder();
//		var orderService2 = new OrderService(new PayPalPaymentService());
//		orderService2.placeOrder();
	}

}