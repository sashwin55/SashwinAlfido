package StudentDatabase;

import java.util.HashMap;
import java.util.Map;

class StudentManagementSystem {
    private Map<String, Student> students;

    public StudentManagementSystem() 
    {
        this.students = new HashMap<>();
    }

    public void addStudent(String studentId, String name) 
    {
        if (!students.containsKey(studentId)) 
        {
            students.put(studentId, new Student(studentId, name));
            System.out.println("Student added successfully.");
        } else {
            System.out.println("Student with ID " + studentId + " already exists.");
        }
    }

    public void addCourseToStudent(String studentId, String course) {
        if (students.containsKey(studentId)) {
            students.get(studentId).addCourse(course);
            System.out.println("Course added to student successfully.");
        } else {
            System.out.println("Student with ID " + studentId + " not found.");
        }
    }

    public void displayStudentInfo(String studentId) 
    {
        if (students.containsKey(studentId)) 
        {
            Student student = students.get(studentId);
            System.out.println("Student ID: " + student.getStudentId());
            System.out.println("Name: " + student.getName());
            System.out.println("Courses: " + student.getCourses());
        } else {
            System.out.println("Student with ID " + studentId + " not found.");
        }
    }
}