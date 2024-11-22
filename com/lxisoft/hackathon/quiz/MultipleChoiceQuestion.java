package com.lxisoft.hackathon.quiz;

import com.lxisoft.hackathon.exception.CannotGoException;

public class MultipleChoiceQuestion extends Question {
    
    private String[] options;
    private int correctAnswer;

    public MultipleChoiceQuestion(String questionText, String[] options, int correctAnswer) {
        super(questionText);
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    
}
