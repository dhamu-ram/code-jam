package com.dhamuram.codejam.designpattern.structural.composite;

public class GradeFour implements Student {

    int rollNumber;
    String name;

    int englishGrade;

    int mathGrade;

    int scienceGrade;

    int historyGrade;

    int phyGeo;

    public GradeFour(int rollNumber, String name, int englishGrade, int mathGrade, int scienceGrade, int historyGrade, int phyGeo) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.englishGrade = englishGrade;
        this.mathGrade = mathGrade;
        this.scienceGrade = scienceGrade;
        this.historyGrade = historyGrade;
        this.phyGeo = phyGeo;
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

    public int getPhyGeo() {
        return phyGeo;
    }
}
