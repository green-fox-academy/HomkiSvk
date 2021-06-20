package day1.inheritanceBeforeMR;

public class Student {

    private String name;
    private int age;
    private String gender;
    private String previousOrganization;
    private int skippedDays;


    public Student(String name, int age, String gender, String previousOrganization) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public Student() {
        this("Jane Doe", 30, "female", "The School of Life");
        this.skippedDays = 0;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", " + age + " year old " + gender + " from " + previousOrganization
                + " who skipped " + skippedDays + " days from the course already.");
    }

    public void getGoal() {
        System.out.println("My goal is: Be a junior software developer.");
    }

    public void skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
    }
}
