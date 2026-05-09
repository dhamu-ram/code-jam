package com.dhamuram.codejam.designpattern.structural.bridge;

public class BridgePattern {

    public static void main(String[] args) {

        QuestionFormat questionFormat = new QuestionFormat("This is a questions for Kids");

        // This is the bridge.
        questionFormat.question = new KidsQuestions();

        questionFormat.display();

        questionFormat.displayAll();
    }
}
