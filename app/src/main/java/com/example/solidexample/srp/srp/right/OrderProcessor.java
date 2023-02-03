package com.example.solidexample.srp.srp.right;

import com.example.solidexample.dip.MySqlOrderRepository;
import com.example.solidexample.models.Order;

public class OrderProcessor {
    public void process(Order order){

        MySqlOrderRepository repository = new MySqlOrderRepository();
        ConfirmationEmailSender emailSender = new ConfirmationEmailSender();

        if (order.isValid () && repository.save(order)){
            emailSender.sendConfirmationEmail(order);
        }
    }
}
