package com.lxisoft.hackathon.quiz;

import com.lxisoft.hackathon.exception.CompletelyWrongException;

public class SocialTaskQuestion extends Question {

    public SocialTaskQuestion(String questionText) {
        super(questionText);
    }

    @Override
    public void ask() {
        System.out.println("Complete this task and give proof.");
    }
}

