package com.javacopy.shallow;

import org.openjdk.jol.vm.VM; //https://blog.csdn.net/zhoufanyang_china/article/details/86750351

/**
 * @author SongOf
 * @ClassName Test
 * @Description 利用clone方法复制对象时，新建一个对象，但属性为浅拷贝模式
 * @Date 2021/3/20 15:50
 * @Version 1.0
 */
public class Test {
    @org.junit.Test
    public void testShallowCopy() {
        QuestionBankController questionBankController = new QuestionBankController("李明", "12313");
        QuestionBank questionBank = questionBankController.getQuestionBank();
        QuestionBank newQuestionBank = null;
        try {
            newQuestionBank = questionBankController.createPaper();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(questionBank.hashCode() == newQuestionBank.hashCode());
    }
}
