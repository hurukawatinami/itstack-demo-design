package org.itstack.demo.design.mq;

import com.alibaba.fastjson.JSON;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrderMq {

    private String uid;           // 用户ID
    private String sku;           // 商品
    private String orderId;       // 订单ID
    private Date createOrderTime; // 下单时间

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
