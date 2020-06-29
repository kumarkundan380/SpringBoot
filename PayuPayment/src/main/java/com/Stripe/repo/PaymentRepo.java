package com.Stripe.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Stripe.entity.Payment;

@Repository
public interface PaymentRepo extends CrudRepository<Payment,Integer> {

    Payment findByTxnId(String txnId);
}