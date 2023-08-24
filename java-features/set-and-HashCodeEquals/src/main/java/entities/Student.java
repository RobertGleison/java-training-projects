package entities;

public class Student {
    private String name;
    private int studentCode;
    private Course course;

    public Student(String name, int number) {
        this.name = name;
        this.studentCode = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return studentCode;
    }
}
