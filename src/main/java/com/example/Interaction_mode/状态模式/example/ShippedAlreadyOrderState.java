package com.example.Interaction_mode.状态模式.example;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author missli
 * @Description
 * @Date 2020/10/15 16:20
 **/
@Slf4j
public class ShippedAlreadyOrderState implements OrderState {
    @Override
    public Object OrderState() {
        log.info(">> 切换为已经发货状态");
        return "切换为已经发货状态";
    }
}
