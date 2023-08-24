package entities;

import java.util.List;

public class Instructor {
    private String name;
    private int instructorCode;

    private List<Course> courses;

    public Instructor(String name, int instructorCode) {
        this.name = name;
        this.instructorCode = instructorCode;
    }

    public String getName() {
        return name;
    }

    public int getInstructorCode() {
        return instructorCode;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addCourses(Course course){
        courses.add(course);
    }
}
