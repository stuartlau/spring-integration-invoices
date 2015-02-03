package com.vrtoonjava.invoices;

import org.springframework.integration.annotation.Filter;
import org.springframework.stereotype.Component;

import com.vrtoonjava.banking.Order;

@Component
public class RebateFilter {

    public static final int LOW_ENOUGH_THRESHOLD = 10_000;

    @Filter
    public boolean accept(Order order) {
        boolean lowEnough = order.getAmount() < LOW_ENOUGH_THRESHOLD;
        System.out.println("Amount of $" + order.getAmount()
                + (lowEnough ? " can" : " can not") + " be automatically processed by system---");

        return lowEnough;
    }

}
