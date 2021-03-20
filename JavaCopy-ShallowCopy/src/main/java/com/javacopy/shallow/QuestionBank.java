package com.javacopy.shallow;

import lombok.Data;

/**
 * @author SongOf
 * @ClassName QuestionBank
 * @Description
 * @Date 2021/3/20 15:42
 * @Version 1.0
 */
@Data
public class QuestionBank implements Cloneable{
    private String candidate;
    private String number;
    private ChoiceQuestion choiceQuestion;
    private AnswerQuestion answerQuestion;

    @Override
    protected QuestionBank clone() throws CloneNotSupportedException {
        return (QuestionBank)super.clone();//为浅拷贝
    }
}
