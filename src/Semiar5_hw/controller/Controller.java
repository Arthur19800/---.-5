package Semiar5_hw.controller;

import Semiar5_hw.model.Student;
import Semiar5_hw.model.StudentGroup;
import Semiar5_hw.model.Teacher;
import Semiar5_hw.model.User;
import Semiar5_hw.service.GroupService;
import Semiar5_hw.service.UserService;
import Semiar5_hw.view.StudentView;

import java.util.List;

public class Controller {
    private UserService userService;
    private GroupService groupService;
    private StudentView studentView;

    public Controller() {
        this.userService = new UserService();
        this.groupService = new GroupService();
        this.studentView = new StudentView();
    }

    public Student createStudent(Student student) {
        return (Student) userService.create(student);
    }

    public Teacher createTeacher(Teacher teacher) {
        return (Teacher) userService.create(teacher);
    }

    public StudentGroup createGroup(Integer num, Teacher teacher, Student... students) {
        return groupService.CreateGroup(num, teacher, students);
    }

    public void printStudents(Student student) {
        studentView.printStudent(student);
    }

    public List<User> returnStudents() {
        return userService.read();
    }
}
