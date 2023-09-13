package com.dhamuram.codejam.designpattern.structural.bridge;

import java.util.ArrayList;
import java.util.List;

public class KidsQuestions implements Question {

    private final List<String> questions = new ArrayList<>();

    private int pointer;

    KidsQuestions() {

        questions.add("What's your favorite game to play?\n");
        questions.add("If you could be any animal what would you be and why?");
        questions.add("What's your favorite thing to do in the car?\n");
        questions.add("Tell me about the best and worst parts of your day.");
        questions.add("If you could be anywhere right now where would you be? What would you be doing?");
        questions.add("What’s your favorite cereal? Why?");
        questions.add("What’s the silliest face that you can make?");
        questions.add("What’s your favorite song? Why do you like it?");
        questions.add("What was the best holiday you ever had?");
        questions.add("Where do you like to go in the car?");
        questions.add("If we were at the grocery store, what would you like to buy?");
        questions.add("How many animal noises can you make?");
        questions.add("Have you ever had an imaginary friend? Tell me about him.");
        questions.add("How high can you count?");
        questions.add("If you could make three wishes, what would they be?");
        questions.add("Who do you love? Why?");
        questions.add("What’s the coolest thing you’ve ever built?");
        questions.add("What do you want to be when you grow up?");
        questions.add("Tell me about your favorite movie or TV show.");
        questions.add("If you could only keep one book which one would you keep? Why?");

    }

    @Override
    public void nextQuestion() {
        if (pointer <= questions.size() - 1) {
            pointer++;
        } else {
            pointer = questions.size() - 1;
        }
    }

    @Override
    public void previousQuestion() {
        if (pointer > 0) {
            pointer--;
        } else {
            pointer = questions.size() - 1;
        }
    }

    @Override
    public void newQuestion(String question) {
        questions.add(question);
    }

    @Override
    public void deleteQuestion(String question) {
        questions.remove(question);
    }

    @Override
    public void displayQuestion() {
        System.out.println(questions.get(pointer));
    }

    @Override
    public void displayAllQuestion() {
        for (String question : questions) {
            System.out.println(question);
        }
    }
}
