package ru.piaksheva.universityapp.entity;

import ru.piaksheva.universityapp.service.Examinable;
import ru.piaksheva.universityapp.service.Visitor;

public class Student implements Visitor, Examinable {
    public String name;
    double diligence;
    public Teacher teacher;
    public University university;

    public Student(String name, double diligence, Teacher teacher, University university) {
        this.name = name;
        this.diligence = diligence;
        this.teacher = teacher;
        this.university = university;
    }

    @Override
    public boolean visitUniversity() {
        double probability;
        probability = Math.random() * 100;
        probability = probability + (diligence * 7); //если студент прилежный, то порог посещения у него все равно больше 70%
        return probability > 70;
    }

    @Override
    public boolean takeExam(double attendance) {
        return attendance > 0.5 && diligence > 3;
    }
}
