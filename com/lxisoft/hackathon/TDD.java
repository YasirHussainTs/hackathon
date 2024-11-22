package com.lxisoft.hackathon;

import com.lxisoft.hackathon.quiz.*;

public class TDD {
    public static void main(String[] args) {
        IQuestion[] quiz = {
            new MultipleChoiceQuestion("What is 2 + 2?", new String[]{"3", "4", "5"}, 2),
            new TrueOrFalseQuestion("The lxi is green.", true),
            new SocialTaskQuestion("Share a post about Gaza and Israel War.")
        };

        System.out.println("Welcome to the quiz!");

        for (IQuestion q : quiz) {
            q.displayQuestion();
        }

        System.out.println("Thank you for attending the Quiz!");
    }
}

