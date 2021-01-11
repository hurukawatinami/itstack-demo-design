package org.itstack.demo.design;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AwardRes {

    private String code; // 编码
    private String info; // 描述

    public AwardRes(String code, String info) {
        this.code = code;
        this.info = info;
    }

}
