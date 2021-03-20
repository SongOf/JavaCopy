package com.javacopy.shallow;

import lombok.Data;

/**
 * @author SongOf
 * @ClassName AnswerQuestion
 * @Description
 * @Date 2021/3/20 15:23
 * @Version 1.0
 */
@Data
public class AnswerQuestion extends Question {
    private String name;
    private String key;
    public AnswerQuestion() {}
    public AnswerQuestion(String name, String key, int score) {
        super(score);
        this.name = name;
        this.key = key;
    }
}
