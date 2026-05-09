package com.dhamuram.codejam.designpattern.structural.composite;

public class GradeTwo implements Student {

    int rollNumber;
    String name;

    int englishGrade;

    int mathGrade;

    int scienceGrade;

    int historyGrade;

    public GradeTwo(int rollNumber, String name, int englishGrade, int mathGrade, int scienceGrade, int historyGrade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.englishGrade = englishGrade;
        this.mathGrade = mathGrade;
        this.scienceGrade = scienceGrade;
        this.historyGrade = historyGrade;
    }

    @Override
    public int getRollNumber() {
        return rollNumber;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getEnglishGrade() {
        return englishGrade;
    }

    @Override
    public int getMathGrade() {
        return mathGrade;
    }

    @Override
    public int getHistoryGrade() {
        return historyGrade;
    }

    @Override
    public int getScienceGrade() {
        return scienceGrade;
    }
}
