package com.javacopy.shallow;

import lombok.Data;
import java.util.HashMap;
import java.util.Map;

/**
 * @author SongOf
 * @ClassName QuestionBankController
 * @Description
 * @Date 2021/3/20 15:58
 * @Version 1.0
 */
@Data
public class QuestionBankController {
    private QuestionBank questionBank = new QuestionBank();

    public QuestionBankController(String candidate, String number) {

        Map<String, String> map01 = new HashMap<String, String>();
        map01.put("A", "JAVA2 EE");
        map01.put("B", "JAVA2 Card");
        map01.put("C", "JAVA2 ME");
        map01.put("D", "JAVA2 HE");
        map01.put("E", "JAVA2 SE");

        questionBank.setCandidate(candidate);
        questionBank.setNumber(number);
        questionBank.setChoiceQuestion(new ChoiceQuestion("JAVA所定义的版本中不包括", map01, "D", 10));
        questionBank.setAnswerQuestion(new AnswerQuestion("为什么好马不吃回头草", "后面的草没了", 20));
    }

    public QuestionBank createPaper() throws CloneNotSupportedException {
        return questionBank.clone();
    }
}
