package com.example.android.rebortcard;

import java.util.List;

/**
 * Created by haya1 on 8/4/2017 AD.
 */

public class ReportCard {

    String name;
    int id;
    String Subject;
    int grade;

    public ReportCard(String name, int id, String Subject, int grade) {
        this.name = name;
        this.id = id;
        this.Subject = Subject;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getSubject() {
        return Subject;
    }

    public int getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "StudentName=" + name + "\nidnumber=" + id + "\nSubject=" + Subject + "\ngrade=" + grade;
    }
}