package ru.piaksheva.universityapp.entity;

import ru.piaksheva.universityapp.service.Research;
import ru.piaksheva.universityapp.service.Visitor;

public class Teacher implements Visitor, Research {
    public String name;
    public University university;
    int age;

    public Teacher(String name, University university, int age) {
        this.name = name;
        this.university = university;
        this.age = age;
    }

    @Override
    public boolean visitUniversity() {
        double probability;
        double randome;
        probability = 100; // базово предполагаем, что препод ходит в университет какждый день, потому что это его работа
        probability = probability - Math.max(0, age - 60); //если если преподаватель старше 60 лет, то вероятны пропуски работы из-за здоровья
        randome = Math.random() * 100;
        return randome <= probability;
    }

    @Override
    public void makeResearch(int timeForResearch) {
        if (timeForResearch > 15) {
            System.out.println("Преподаватель " + this.name + " провел все запланированные лекции и у него осталось время на научную работу");
        } else if (timeForResearch <= 15 && timeForResearch > 7) {
            System.out.println("Преподаватель " + this.name + " провел все запланированные лекции и у него очень сжатые сроки на научную работу");
        } else if (timeForResearch <= 7 && timeForResearch > 0) {
            System.out.println("Преподаватель " + this.name + " провел только все запланированные лекции, а потом ушел на больничный");
        } else if (timeForResearch < 0) {
            System.out.println("Преподаватель " + this.name + " тяжело заболел, требуется замена");
        }
    }


}
