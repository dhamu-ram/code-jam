package com.dhamuram.codejam.designpattern.structural.bridge;

public class QuestionManager {

    public String catalog;
    protected Question question;

    public QuestionManager(String catalog) {
        this.catalog = catalog;
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
        System.out.println("Catalog : " + catalog);
        question.displayAllQuestion();
    }
}
