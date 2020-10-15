package com.example.Interaction_mode.状态模式.example;

import lombok.AllArgsConstructor;

/**
 * @Author missli
 * @Description
 * @Date 2020/10/15 16:21
 **/
@AllArgsConstructor
public class StateContext {
    private OrderState orderState;

    public void swichStateOrder(){
        orderState.OrderState();
    }
}
