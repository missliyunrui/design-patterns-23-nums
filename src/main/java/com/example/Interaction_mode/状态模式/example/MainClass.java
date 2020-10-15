package com.example.Interaction_mode.状态模式.example;

import com.example.Interaction_mode.状态模式.SpringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author missli
 * @Description
 * @Date 2020/10/15 16:25
 **/
@RestController
public class MainClass {

    @GetMapping("/orderState")
    public String orderState(String stateBeanId){ //stateBeanId = AlreadySignedOrderState,...

        //1.使用Spring上下文获取bean中对象
        OrderState orderState = SpringUtils.getBean(stateBeanId, OrderState.class);

        // 2.使用上下文切换到不同的状态
        StateContext stateContext = new StateContext(orderState);

        // 如果写多重if判断的话 整个代码流程 耗时比较长   直接Spring中精准定位到策略或者是状态的话 Map get方法的时候底层是数组
        stateContext.swichStateOrder();

        return "success";
    }
}
