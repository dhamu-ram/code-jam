package com.dhamuram.codejam.designpattern.structural.bridge;

public class QuestionManager {

    public String catalog;
    protected Question question;

    public QuestionManager() {

    }

    public void next() {
        question.nextQuestion();
    }

    public void previous() {
        question.previousQuestion();
    }

    public void newQuestion(String quest) {
        question.newQuestion(quest);
    }

    public void delete(String quest) {
        question.deleteQuestion(quest);
    }

    public void display() {
        question.displayQuestion();
    }

    public void displayAll() {
        question.displayAllQuestion();
    }
}
