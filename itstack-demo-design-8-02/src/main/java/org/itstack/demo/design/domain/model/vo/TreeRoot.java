package org.itstack.demo.design.domain.model.vo;

/**
 * 树根信息
 * 微信公众号：bugstack虫洞栈 | 专注原创技术专题案例
 * 论坛：http://bugstack.cn
 * Create by 小傅哥 on @2020
 */
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TreeRoot {

    private Long treeId;         //规则树ID
    private Long treeRootNodeId; //规则树根ID
    private String treeName;     //规则树名称

}
