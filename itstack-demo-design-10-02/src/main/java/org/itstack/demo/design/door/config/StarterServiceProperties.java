package org.itstack.demo.design.door.config;

import lombok.Setter;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 切面定义
 * 公众号：bugstack虫洞栈 | 沉淀、分享、成长，让自己和他人都能有所收获！
 * 博  客：http://bugstack.cn
 * Create by 小傅哥 on @2020
 */
@Setter
@Getter
@ConfigurationProperties("itstack.door")
public class StarterServiceProperties {

    private String userStr;

}
