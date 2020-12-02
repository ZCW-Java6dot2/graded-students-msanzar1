package io.zipcoder;

import java.util.Arrays;

public class Classroom {

    private Student[] students;

    public Classroom(int maxNumOfStudent) {
        this.students = new Student[maxNumOfStudent];
    }
    public Classroom(Student[] collectStudent){
        this.students = collectStudent;
    }
    public Classroom()
            this(

}
public Double getAverageExamScore(){
    double classAvg = 0.0;
    for (int i = 0; i <= students.length; i++){
        classAvg += students[i].getAverageExamScore();
    }
    return classAvg / students.length;
}
public void addStudent(Student student){
    for (int j = 0; j < students.length; j++){
        if (students[j] == null){
            students[j] = student;
            break;
        }
        else {
            System.out.println("Get Out!!!");
        }
    }
}

public void removeStudent(String firstName, String lastName){
    for (int k = 0; k < students.length; k++){
        if (students[k].getFirstName() == firstName && students[k].getLastName() == lastName){
            students[k] = null;
        }
    }else   {
        System.out.println("Student got sick");
    }
    Arrays.sort(students);

}