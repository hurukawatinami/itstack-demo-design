package org.itstack.demo.design.group;

/**
 * 树节点链路
 */

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Link {

    private String fromId; // 雇员ID
    private String toId;   // 雇员ID

    public Link(String fromId, String toId) {
        this.fromId = fromId;
        this.toId = toId;
    }

}
