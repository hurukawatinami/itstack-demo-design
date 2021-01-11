package org.itstack.demo.design.group;

import lombok.Getter;
import lombok.Setter;

/**
 * 雇员
 */
@Setter
@Getter
public class Employee {

    private String uId;   // ID
    private String name;  // 姓名
    private String desc;  // 备注

    public Employee(String uId, String name) {
        this.uId = uId;
        this.name = name;
    }

    public Employee(String uId, String name, String desc) {
        this.uId = uId;
        this.name = name;
        this.desc = desc;
    }

}
