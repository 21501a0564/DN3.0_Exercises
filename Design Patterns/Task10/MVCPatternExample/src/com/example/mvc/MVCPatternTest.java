package com.example.mvc;

public class MVCPatternTest {
    public static void main(String[] args) {
        Student student = new Student("Rukmini", 564, "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);
        controller.updateView();
        controller.setStudentName("Niharika");
        controller.setStudentId(52);
        controller.setStudentGrade("B");
        controller.updateView();
    }
}
