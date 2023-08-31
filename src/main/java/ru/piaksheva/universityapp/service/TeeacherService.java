package ru.piaksheva.universityapp.service;

import ru.piaksheva.universityapp.entity.Teacher;

public class TeeacherService {
    public void workSemester(Teacher teacher) {
        int numberOfVisits = 80;
        int numberOfWorkDay = 0;
        while (numberOfVisits > 0) {
            boolean visit = teacher.visitUniversity();
            if (visit) {
                numberOfWorkDay = numberOfWorkDay + 1;
            }
            numberOfVisits = numberOfVisits - 1;
        }
        System.out.println("Преподаватель " + teacher.name + " отработал " + "в университете " + teacher.university.name + " " + numberOfWorkDay + " дня(ей)");
        int timeForResearch = numberOfWorkDay - 60;
        teacher.makeResearch(timeForResearch);
    }


}
