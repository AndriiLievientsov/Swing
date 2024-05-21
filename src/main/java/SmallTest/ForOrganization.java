package SmallTest;

public class ForOrganization {
    public static void main(String[] args) {
        Organization orgA = new Organization("АТБ", 10, "Dollars", true);
        Organization orgB = new Organization("Silpo", 12324, "Грывень", false);

        orgA.display();
        System.out.println();
        orgB.display();
    }
}
