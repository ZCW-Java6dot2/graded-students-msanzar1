package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    String firstName;
    String lastName;
    ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] testScores) {
this.firstName = firstName;
this.lastName = lastName;
examScores = new ArrayList<Double>(Arrays.asList(testScores));
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getExamScores() {
        String examScoresString = "Exam Scores:\n";
        for (int i = 0; i < examScores.size(); i++) {
            examScoresString += String.format("\tExam %d -> %.1f\n", i + 1, examScores.get(i));
        }
        return examScoresString;

        @Override
                public String toString(){
            return String.format(Student Name:)
        }

    }


    }

