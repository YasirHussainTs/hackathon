
package com.lxisoft.hackathon.quiz;

import com.lxisoft.hackathon.exception.CannotGoException;

public class MultipleChoiceQuestion extends Question {
    private String[] options;
    private int answerChoice ;

    public MultipleChoiceQuestion(String questionText, String[] options, int answerChoice) {
        super(questionText);
        if ( options == null)
            throw CannotGoException() ;
        this.options = options;
    }

    @Override
    public void ask() {
        System.out.println(getQuestionText());
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
        // use scanner to collect the answer
    }
}
