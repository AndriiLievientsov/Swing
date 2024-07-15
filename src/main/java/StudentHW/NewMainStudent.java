package StudentHW;

public class NewMainStudent {
    public static void main(String[] args) {
        NewStudent student = new NewStudent("Anna", 11, 40.0,Pro.LITERATURE);
        NewStudent student1 = new NewStudent("Kolya",17,17.14,Pro.PHYSICS);

        System.out.println(student.getString());
        System.out.println(student1.getString());
    }
}
