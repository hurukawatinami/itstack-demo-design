package org.itstack.demo.design.po;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class School {

    private Long id;
    private String name;
    private String address;
    private Date createTime;
    private Date updateTime;

}
