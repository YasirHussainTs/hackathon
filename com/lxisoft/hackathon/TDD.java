package com.lxisoft.hackathon;

import com.lxisoft.hackathon.quiz.IQuestion;
import com.lxisoft.hackathon.quiz.MultipleChoiceQuestion;
import com.lxisoft.hackathon.quiz.SocialTaskQuestion;
import com.lxisoft.hackathon.quiz.TrueOrFalseQuestion;

public class TDD {
    public static void main(String[] args){
        
        IQuestion[] quiz = {
            new MultipleChoiceQuestion("What is 2 + 2?", new String[]{"3", "4", "5"}, 2),
            new TrueOrFalseQuestion("The lxi is green.", true),
            new SocialTaskQuestion("Share a post about Gaza Israel War.")
        };
    
        System.out.println("Welcome to quiz");

        for (IQuestion q : quiz) {
            q.displayQuestion();
        }

        System.out.println("Thank you for attending the Quiz");
    }
}
