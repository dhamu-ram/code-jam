package com.dhamuram.codejam.designpattern.structural.bridge;

public interface Question {

    void nextQuestion();

    void previousQuestion();

    void newQuestion(String question);

    void deleteQuestion(String question);

    void displayQuestion();

    void displayAllQuestion();
}
