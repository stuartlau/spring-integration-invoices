package com.vrtoonjava.invoices;

import java.math.BigDecimal;

import com.vrtoonjava.banking.Order;
import com.vrtoonjava.banking.Payment;
import com.vrtoonjava.banking.PaymentCreator;
import com.vrtoonjava.banking.PaymentException;

import org.springframework.integration.annotation.Transformer;
import org.springframework.stereotype.Component;

@Component
public class LocalOrderCreator {

    // hard coded account value for demo purposes
    private static final String CURRENT_IBAN_ACC = "liushuo-local-order";

    @Transformer
    public Payment createPayment(Order order) throws PaymentException {
    		BigDecimal bd = new BigDecimal(order.getAmount());
        return new Payment(CURRENT_IBAN_ACC, "dd-ee-ff", bd);
    }

}
