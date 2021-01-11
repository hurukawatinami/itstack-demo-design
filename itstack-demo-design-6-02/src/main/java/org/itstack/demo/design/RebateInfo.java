package org.itstack.demo.design;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RebateInfo {

    private String userId;  // 用户ID
    private String bizId;   // 业务ID
    private Date bizTime;   // 业务时间
    private String desc;    // 业务描述

}
