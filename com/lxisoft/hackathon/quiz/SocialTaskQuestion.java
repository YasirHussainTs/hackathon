
package com.lxisoft.hackathon.quiz;

import com.lxisoft.hackathon.exception.CompletelyWrongException;

public class SocialTaskQuestion extends Question {

    public SocialTaskQuestion(String questionText) {
        super(questionText);
        if (questionText == null){
            throws CompletelyWrongException ;
        }
    }

    @Override
    public void ask() {
        System.out.println(getQuestionText() + " (This question requires a social task.)");
        // use scanner to collect the answer
    }
}
