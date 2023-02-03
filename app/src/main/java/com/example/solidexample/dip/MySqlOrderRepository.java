package com.example.solidexample.dip;

import com.example.solidexample.models.Order;
import com.example.solidexample.srp.srp.wrong.MySqlCoonection;

public class MySqlOrderRepository implements OrderRepository  {
    @Override
    public boolean save(Order order){
        MySqlCoonection coonection = new MySqlCoonection ("database.url");
        return true;
    }
}
