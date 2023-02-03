package com.example.solidexample.srp.srp.wrong;

import com.example.solidexample.models.Order;
import com.example.solidexample.srp.srp.wrong.MySqlCoonection;

public class OrderProcessor {
    public void processor(Order order){
        if (order.isValid() && save(order)){
            sendConfirmationEmail(order);
        }
    }
    private boolean save (Order order){
        MySqlCoonection connection = new MySqlCoonection ("database.url");
        // сохраняем заказ в базу данных
        return true;
    }
    private void sendConfirmationEmail(Order order){
        String name = order.getCustomerName ();
        String mail = order.getCustomerEmail ();
        // шлем письмо клиенту
    }
}
