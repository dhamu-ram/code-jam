package com.dhamuram.codejam.designpattern.creational.singleton;

public class SingletonPattern {

    private static volatile SingletonPattern instance;

    public static SingletonPattern getInstance() {
        if (instance == null) {
            synchronized (SingletonPattern.class) {
                if (instance == null) {
                    instance = new SingletonPattern();
                }
            }
        }
        return instance;
    }

    private void printValue(){
        System.out.println("Singleton Instance !!!");
    }

    public static void main(String[] args) {

        SingletonPattern singleton = SingletonPattern.getInstance();

        singleton.printValue();
    }
}
