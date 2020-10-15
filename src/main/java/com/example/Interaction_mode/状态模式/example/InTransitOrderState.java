package com.example.Interaction_mode.状态模式.example;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author missli
 * @Description
 * @Date 2020/10/15 16:18
 **/
@Slf4j
public class InTransitOrderState implements OrderState {

    @Override
    public Object OrderState() {
        log.info(">> 切换为正在运送状态");
        return "切换为正在运送状态";
    }
}
