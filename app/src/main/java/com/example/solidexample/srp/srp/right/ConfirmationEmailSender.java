package com.example.solidexample.srp.srp.right;

import com.example.solidexample.models.Order;

public class ConfirmationEmailSender {
    public void sendConfirmationEmail(Order order){
        String name = order.getCustomerName();
        String email = order.getCustomerEmail();
        // Шлем письмо клиенту

    }
}
