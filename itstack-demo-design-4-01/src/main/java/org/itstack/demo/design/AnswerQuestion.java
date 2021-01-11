package org.itstack.demo.design;

/**
 * 解答题
 */
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AnswerQuestion {

    private String name;  // 问题
    private String key;   // 答案

    public AnswerQuestion() {
    }

    public AnswerQuestion(String name, String key) {
        this.name = name;
        this.key = key;
    }
}
