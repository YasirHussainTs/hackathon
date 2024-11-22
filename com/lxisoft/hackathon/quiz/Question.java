package com.lxisoft.hackathon.quiz;

public abstract class Question implements IQuestion {
    private String questionText;

    public Question(String questionText) {
        this.questionText = questionText;
    }

    public String getQuestionText() {
        return questionText;
    }

    @Override
    public void displayQuestion() {
        System.out.println("Question: " + getQuestionText());
        ask();
    }

    public abstract void ask();
}

