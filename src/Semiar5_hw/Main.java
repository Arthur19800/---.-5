package Semiar5_hw;

import Semiar5_hw.controller.Controller;
import Semiar5_hw.model.Student;
import Semiar5_hw.model.StudentGroup;
import Semiar5_hw.model.Teacher;

public class Main {

    public static void main(String[] args) {

        Controller controller =  new Controller();

        Student student1_group1 = controller.createStudent(new Student("Иван", "Иванов", 15, 1));
        Student student2_group1 = controller.createStudent(new Student("Ольга", "Петрова", 16, 2));
        Student student3_group1 = controller.createStudent(new Student("Алексей", "Сидоров", 14, 3));


        Teacher teacher_group1 = controller.createTeacher(new Teacher("Наталья", "Иванова", 35, 1));


        StudentGroup group1 = controller.createGroup(1, teacher_group1, student1_group1, student2_group1, student3_group1);


        Student student1_group2 = controller.createStudent(new Student("Екатерина", "Михайлова", 16, 4));
        Student student2_group2 = controller.createStudent(new Student("Павел", "Николаев", 17, 5));
        Student student3_group2 = controller.createStudent(new Student("Мария", "Сергеева", 15, 6));


        Teacher teacher_group2 = controller.createTeacher(new Teacher("Андрей", "Петров", 40, 2));


        StudentGroup group2 = controller.createGroup(2, teacher_group2, student1_group2, student2_group2, student3_group2);


        System.out.println(group1.toString());
        System.out.println(group2.toString());
    }
}
