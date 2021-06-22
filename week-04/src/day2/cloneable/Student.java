package day2.cloneable;

public class Student extends Person {

    private String previousOrganization;
    private int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public Student() {
        this("Jane Doe", 30, "female", "The School of Life");
        this.skippedDays = 0;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + name + ", " + age + " year old " + gender + " from " + previousOrganization
                + " who skipped " + skippedDays + " days from the course already.");
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: Be a junior software developer.");
    }

    public void skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
    }

    @Override
    protected Student clone()  {
        return new Student(this.name, this.age, this.gender, this.previousOrganization);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", previousOrganization='" + previousOrganization + '\'' +
                ", skippedDays=" + skippedDays +
                '}';
    }
}

