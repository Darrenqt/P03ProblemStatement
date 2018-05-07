package com.example.a16022809.p03_problemstatement;

public class DailyGrade {
    private String week;
    private String grade;
    

    public DailyGrade(String week, String grade) {
        this.week = week;
        this.grade = grade;
    }

    public String getWeek() {
        return week;
    }


    public String getGrade() {
        return grade;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
