package com.javacopy.shallow;

import lombok.Data;

/**
 * @author SongOf
 * @ClassName Question
 * @Description
 * @Date 2021/3/20 15:24
 * @Version 1.0
 */
@Data
public class Question {
    private int score;
    public Question() {
    }
    public Question(int score) {
        this.score = score;
    }
}
