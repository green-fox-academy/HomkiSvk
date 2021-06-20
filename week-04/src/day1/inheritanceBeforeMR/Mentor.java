package day1.inheritanceBeforeMR;

public class Mentor {

    private String name;
    private int age;
    private String gender;
    private Levels level;

    public Mentor(String name, int age, String gender, Levels level) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.level = level;
    }

    public Mentor() {
        this("Jane Doe", 30, "female", Levels.INTERMEDIATE);
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", " + age + " year old " + gender + " " + level + " mentor.");
    }

    public void getGoal() {
        System.out.println("My goal is: Educate brilliant junior software developers.");
    }
}
