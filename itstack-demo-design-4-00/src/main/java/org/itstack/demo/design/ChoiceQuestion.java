package org.itstack.demo.design;

import java.util.Map;

/**
 * 单选题
 */
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ChoiceQuestion {

    private String name;                 // 题目
    private Map<String, String> option;  // 选项；A、B、C、D
    private String key;                  // 答案；B

    public ChoiceQuestion() {
    }

    public ChoiceQuestion(String name, Map<String, String> option, String key) {
        this.name = name;
        this.option = option;
        this.key = key;
    }
}
