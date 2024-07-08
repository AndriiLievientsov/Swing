package StudentHW;

public class MakeStudents {
    public static void main(String[] args) {
        Student s1 = new Student(10);
        Student s2 = new Student(00.11);
        Student s3 = new Student("Anna", 10, 14.1);
        Student s4 = new Student(44.14,44);
        Student s5 = new Student("Kolya", 71.11);

        s1.setPro(Pro.COMPUTER_SCIENCES);
        s2.setPro(Pro.HISTORY);
        s3.setPro(Pro.LITERATURE);
        s4.setPro(Pro.MATHEMATICS);
        s5.setPro(Pro.PHYSICS);

        s1.printNameId();
        s2.printGPA();
        s3.printAll();
        s4.printGPA();
        s5.printAll();
    }
}
