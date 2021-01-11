package org.itstack.demo.design.coupon;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CouponResult {

    private String code; // 编码
    private String info; // 描述

    public CouponResult(String code, String info) {
        this.code = code;
        this.info = info;
    }
}
