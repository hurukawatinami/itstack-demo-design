package org.itstack.demo.design.mediator;

import lombok.Setter;

import java.sql.Connection;
import java.util.Map;


/**
 * 公众号 | bugstack虫洞栈
 * 博 客 | https://bugstack.cn
 * Create by 小傅哥 @2020
 */
@Setter
public class Configuration {

    protected Connection connection;
    protected Map<String, String> dataSource;
    protected Map<String, XNode> mapperElement;

}
