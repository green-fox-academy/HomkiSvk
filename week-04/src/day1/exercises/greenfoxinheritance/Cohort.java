package day1.exercises.greenfoxinheritance;

import java.util.ArrayList;
import java.util.List;

public class Cohort {

    private String name;
    private List<Student> studentsList;
    private List<Mentor> mentorsList;

    public Cohort(String name) {
        this.name = name;
        studentsList = new ArrayList<>();
        mentorsList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentsList.add(student);
    }

    public void addMentor(Mentor mentor) {
        mentorsList.add(mentor);
    }

    public void info() {
        System.out.println("The " + this.name + " cohort has " + studentsList.size() + " students and "
                + mentorsList.size() + " mentors.");
    }
}
