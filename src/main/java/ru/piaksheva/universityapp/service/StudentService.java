package ru.piaksheva.universityapp.service;

import ru.piaksheva.universityapp.entity.Student;

public class StudentService {
    public void studySemester(Student student) {

        int numberOfVisits = 60;
        int numberOfLessons = 0;
        while (numberOfVisits > 0) {
            boolean visit = student.visitUniversity();
            if (visit) {
                numberOfLessons = numberOfLessons + 1;
            }
            numberOfVisits = numberOfVisits - 1;
        }
        System.out.println("Студент " + student.name + " посетил лекции преподавателя " + student.teacher.name + " в университете " + " " + student.university.name + " " + numberOfLessons + " " + " раз(а)");
        double attandance = (double) numberOfLessons / 60;
        boolean exam = student.takeExam(attandance);
        if (exam) {
            System.out.println("Студент " + student.name + " сдал экзамен у преподавателя " + student.teacher.name + " и переходит на следующий семестр");
        } else if (!exam) {
            System.out.println("Студент " + student.name + " не сдал экзамен у преподавателя " + student.teacher.name + " и отчислен");
        }
    }
}
