package TeachersAndStudents;

public class Main {

    public static void main(String[] args) {
        Teacher mrsKnowItAll = new Teacher();
        Student givesMeHeadache = new Student();

        givesMeHeadache.question(mrsKnowItAll);

        mrsKnowItAll.teach(givesMeHeadache);

    }
}
