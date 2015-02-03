package com.vrtoonjava.invoices;

import java.util.Random;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

import com.vrtoonjava.banking.Order;

@Component
public class OrderSaverHandler {

	@ServiceActivator
	public Order process(Invoice invoice){
		System.out.println("---save invoice to database, dollars="+invoice.getDollars().intValue());
		Order order  = new Order();
		Random r = new Random();
		order.setType(r.nextInt(2)+1);
		order.setAmount(Integer.valueOf(invoice.getDollars().intValue()));
		System.out.println("+++generate order, type="+order.getTypes()+",dollars="+invoice.getDollars().intValue());
		return order;
	}
}
