package Semiar5_hw.service;

import Semiar5_hw.model.Student;
import Semiar5_hw.model.StudentGroup;
import Semiar5_hw.model.Teacher;

import java.util.ArrayList;

public class GroupService {
    public StudentGroup CreateGroup(Integer num, Teacher teacher, Student... students){
        ArrayList<Student> listStudent = new ArrayList<>();
        for (Student student: students){
            listStudent.add(student);
        }
        return new StudentGroup(num, teacher, listStudent);
    }
}
