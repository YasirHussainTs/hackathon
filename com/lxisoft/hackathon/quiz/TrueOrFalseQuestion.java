package com.lxisoft.hackathon.quiz;

import com.lxisoft.hackathon.exception.SeriouslyWrongException;

public class TrueOrFalseQuestion extends Question {

    private boolean isAnswer;

    public TrueOrFalseQuestion(String questionText, boolean isAnswer) {
        super(questionText);
        this.isAnswer = isAnswer;
    }

    @Override
    public void ask() {
        System.out.println("(True/False)");
    }
}


