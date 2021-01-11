package org.itstack.demo.design;

import lombok.Getter;
import lombok.Setter;

/**
 * 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 * 公众号：bugstack虫洞栈
 * Create by 小傅哥(fustack) @2020
 */
@Setter
@Getter
public class Stock {

    private int total; // 库存总量
    private int used;  // 库存已用

    public Stock(int total, int used) {
        this.total = total;
        this.used = used;
    }

}
