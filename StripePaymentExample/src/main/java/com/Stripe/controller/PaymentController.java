package com.Stripe.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Stripe.service.StripeClient;
import com.stripe.model.Charge;

@RestController
@RequestMapping("/payment")
@CrossOrigin
public class PaymentController {

	@Autowired
    private StripeClient stripeClient;

    
//    @PostMapping("/charge")
//    public Charge chargeCard(HttpServletRequest request) throws Exception {
//        String token = request.getHeader("token");
//        Double amount = Double.parseDouble(request.getHeader("amount"));
//        return this.stripeClient.chargeCreditCard(token, amount);
//    }
	
	@PostMapping("/charge")
    public Charge chargeCard(@RequestBody int grandTotal, HttpServletRequest request) throws Exception {
        String token = request.getHeader("token");
        int amount = grandTotal;
        System.out.println("Token"+ token + "Amount:"+ amount);
        return this.stripeClient.chargeCreditCard(token, amount);
    }
}
