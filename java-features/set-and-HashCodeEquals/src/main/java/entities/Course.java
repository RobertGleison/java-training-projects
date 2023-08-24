package entities;

import java.util.List;

public class Course {
    private String name;
    private String courseCode;
    private Instructor instructor;

    private List<Student> students;

    public Course(String name, String courseCode) {
        this.name = name;
        this.courseCode = courseCode;
    }

    public String getName() {
        return name;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public List<Student> getStudents() {
        return students;
    }

}
