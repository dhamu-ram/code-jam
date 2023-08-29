package com.dhamuram.codejam.designpattern.singleton;

public class Singleton {

    private static volatile Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    private void printValue(){
        System.out.println("Singleton Instance !!!");
    }

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();

        singleton.printValue();
    }
}
