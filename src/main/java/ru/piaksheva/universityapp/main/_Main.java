package ru.piaksheva.universityapp.main;

import ru.piaksheva.universityapp.entity.Student;
import ru.piaksheva.universityapp.entity.Teacher;
import ru.piaksheva.universityapp.entity.University;
import ru.piaksheva.universityapp.service.StudentService;
import ru.piaksheva.universityapp.service.TeeacherService;

public class _Main {
    public static void main(String[] args) {
        University university = new University("Иркутский драмматический");
        Teacher teacher = new Teacher("Пупкин", university, 61);
        Student student = new Student("Афанасий", 5, teacher, university);
        StudentService studentService = new StudentService();
        TeeacherService teeacherService = new TeeacherService();
        studentService.studySemester(student);
        teeacherService.workSemester(teacher);
    }
}
