package com.codewithmosh.store;

public class StripPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount){
        System.out.println("Strip");
        System.out.println("Amount: "+amount);
    }
}
