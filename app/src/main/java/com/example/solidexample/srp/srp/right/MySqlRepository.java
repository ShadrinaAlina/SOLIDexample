package com.example.solidexample.srp.srp.right;

import com.example.solidexample.models.Order;
import com.example.solidexample.srp.srp.wrong.MySqlCoonection;

public class MySqlRepository {
    public boolean save(Order order){
        MySqlCoonection coonection = new MySqlCoonection ("database.url");
        // сохраняем заказ в базу данных
        return true;
    }
}
