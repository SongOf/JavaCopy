package com.javacopy.shallow;

import lombok.Data;

import java.util.Map;

/**
 * @author SongOf
 * @ClassName ChoiceQuestion
 * @Description
 * @Date 2021/3/20 15:21
 * @Version 1.0
 */
@Data
public class ChoiceQuestion extends Question {
    private String name;
    private Map<String, String> options;
    private String key;
    public ChoiceQuestion() {}
    public ChoiceQuestion(String name, Map<String, String> options, String key, int score) {
        super(score);
        this.name = name;
        this.options = options;
        this.key = key;
    }
}
