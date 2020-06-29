package com.Stripe.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.stripe.Stripe;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.model.Charge;

@Component
public class StripeClient {
	
	@Autowired
    StripeClient() {
        Stripe.apiKey = "sk_test_OR5dYaeZb1Lp7jVUXZfCDyPF00z2hG0s7j";
    }
	
//	public Customer createCustomer(String token, String email) throws Exception {
//        Map<String, Object> customerParams = new HashMap<String, Object>();
//        customerParams.put("email", email);
//        customerParams.put("source", token);
//        return Customer.create(customerParams);
//    }
//	
//	public Customer getCustomer(String id) throws Exception {
//        return Customer.retrieve(id);
//    }
//
//    public Charge chargeCreditCard(String token, double amount) throws Exception {
//        Map<String, Object> chargeParams = new HashMap<String, Object>();
//        chargeParams.put("amount", (int)(amount * 100));
//        chargeParams.put("currency", "USD");
//        chargeParams.put("source", token);
//        Charge charge = Charge.create(chargeParams);
//        return charge;
//    }
//    
//    
//    public Charge chargeCustomerCard(String customerId, int amount) throws Exception {
//        String sourceCard = getCustomer(customerId).getDefaultSource();
//        Map<String, Object> chargeParams = new HashMap<String, Object>();
//        chargeParams.put("amount", amount);
//        chargeParams.put("currency", "USD");
//        chargeParams.put("customer", customerId);
//        chargeParams.put("source", sourceCard);
//        Charge charge = Charge.create(chargeParams);
//        return charge;
//    }
	public Charge chargeCreditCard(String token, double amount) throws InvalidRequestException, AuthenticationException, APIConnectionException, CardException, APIException {
        Map<String, Object> chargeParams = new HashMap<String, Object>();
        chargeParams.put("amount", (int)(amount * 100));
        chargeParams.put("currency", "inr");
        chargeParams.put("source", token);
        Charge charge = Charge.create(chargeParams);
        return charge;
    }

}
