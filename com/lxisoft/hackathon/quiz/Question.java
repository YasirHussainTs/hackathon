
package com.lxisoft.hackathon.quiz;

public abstract class Question implements IQuestion{
    static int totalScores ;


    // Implement  int calculateAverageScores() 

    private String questionText;

    public Question(String questionText) {
        this.questionText = questionText;
    }

    public String getQuestionText() {
        return questionText;
    }

    public abstract void ask();
}
