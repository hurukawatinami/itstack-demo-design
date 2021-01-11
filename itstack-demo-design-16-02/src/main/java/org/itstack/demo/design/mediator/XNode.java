package org.itstack.demo.design.mediator;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

/**
 * 公众号 | bugstack虫洞栈
 * 博 客 | https://bugstack.cn
 * Create by 小傅哥 @2020
 */
@Setter
@Getter
public class XNode {

    private String namespace;
    private String id;
    private String parameterType;
    private String resultType;
    private String sql;
    private Map<Integer, String> parameter;

}
