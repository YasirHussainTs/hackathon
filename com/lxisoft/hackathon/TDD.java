package com.lxisoft.hackathon;

import com.lxisoft.hackathon.quiz.*;

public class TDD {
    public static void main(String[] args) {
        IQuestion[] quiz = {
            new MultipleChoiceQuestion("What is 2 + 2?", new String[]{"3", "4", "5"}, 2),
            new TrueOrFalseQuestion("The sky is blue.", true),
            new SocialTaskQuestion("Share a post about environmental conservation.")
        };

        System.out.println("Welcome to the quiz!");

        for (IQuestion q : quiz) {
            q.displayQuestion();
        }

        System.out.println("Thank you for participating!");
    }
}

