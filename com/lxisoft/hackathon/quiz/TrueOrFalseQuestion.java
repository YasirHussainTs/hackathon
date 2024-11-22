
package com.lxisoft.hackathon.quiz;

import com.lxisoft.hackathon.exception.SeriouslyWrongException;

public class TrueOrFalseQuestion extends Question {

    boolean answer ;

    public TrueOrFalseQuestion(String questionText, boolean answer) {
        super(questionText);
        if (questionText == null){
            throw SeriouslyWrongException ;
        }
    }

    @Override
    public void ask() {
        System.out.println(getQuestionText() + " (True/False)");
        // use scanner to collect the answer
    }
}
