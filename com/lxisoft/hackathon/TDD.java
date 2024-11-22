package com.lxisoft.hackathon;

import com.lxisoft.hackathon.quiz.IQuestion;
import com.lxisoft.hackathon.quiz.MultipleChoiceQuestion;
import com.lxisoft.hackathon.quiz.SocialTaskQuestion;
import com.lxisoft.hackathon.quiz.TrueOrFalseQuestion;

public class TDD {
    IQuestion quiz[] =
    { 
    new MultipleChoiceQuestion(null, null, 0), 
    new TrueOrFalseQuestion(null, false),
    new SocialTaskQuestion(null)  
    };


    public static void main(String[] args){
    
        System.out.println("Welcome to quiz");

        for( IQuestion q : quiz)
        {
            q.displayQuestion();
        }

        System.out.println("Thank you");
    }
}
