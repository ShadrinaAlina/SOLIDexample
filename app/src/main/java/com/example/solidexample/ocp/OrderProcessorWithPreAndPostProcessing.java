package com.example.solidexample.ocp;

import com.example.solidexample.models.Order;
import com.example.solidexample.srp.srp.right.OrderProcessor;

public class OrderProcessorWithPreAndPostProcessing  extends OrderProcessor {
    @Override
    public void process(Order order) {
        beforeProcessing();
        super.process (order);
        afterProcessing();
    }
    private void beforeProcessing(){
        //  Осуществим некоторое дейтсвие перед обработкой заказа
    }
    private void afterProcessing(){
        // Осуществим некоторые действия после обработки заказа
    }
}
