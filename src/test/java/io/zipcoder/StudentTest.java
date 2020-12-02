package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    @Test
    public void studentTest() {
        String expectedFirstName = "Munir";
        String expectedLastName = "Sanzar";
        Double[] expectedExamScores = {100.0, 95.0};
        String expectedExamScoresAsString = "Exam Scores:\n\tExam 1 -> 100.0\n\tExam 2 -> 95.0\n";
        //When
        Student student = new Student(expectedFirstName, expectedLastName, expectedExamScores);

        //Actual
        String actualFirstName = student.getFirstName();
        String actualLastName = student.getLastName();
        String actualExamScores = student.getExamScores();

        //AssertEquals
        Assert.assertEquals(expectedFirstName, actualFirstName);
        Assert.assertEquals(expectedLastName, actualLastName);
        Assert.assertEquals(expectedExamScoresAsString, actualExamScores);


    }

    @Test
    public void setFirstName() {
        String expectedFirstName = "Munir";

        Student newStudent = new Student(expectedFirstName, "", new Double[0]);
        String actualFirstName = newStudent.getFirstName();

        Assert.assertEquals(expectedFirstName, actualFirstName);
    }

    @Test
    public void setLastName() {
        String expectedLastName = "Sanzar";

        Student newStudent = new Student("", expectedLastName, new Double[0]);
        String actualLastName = newStudent.getLastName();

        Assert.assertEquals(expectedLastName, actualLastName);
    }

    @Test
    public void getExamScores(){
        String expected = "Exam Scores:\n\tExam 1 -> 100.0\n" + "\tExam 2 -> 95.0\n";
        Student newStudent = new Student("","", new Double[]{100.0, 95.0});
        String actualExamScores = newStudent.getExamScores();

        Assert.assertEquals(expected, actualExamScores);
    }
}