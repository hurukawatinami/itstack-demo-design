package org.itstack.demo.design;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class LotteryResult {

    private String uId;    // 用户ID
    private String msg;    // 摇号信息
    private Date dateTime; // 业务时间

    public LotteryResult(String uId, String msg, Date dateTime) {
        this.uId = uId;
        this.msg = msg;
        this.dateTime = dateTime;
    }

}
