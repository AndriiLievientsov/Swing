package GeorgeTestFild;

public class George2 {
    String name = "Джордж";

    public static void main(String[] args) {
        new George2();
    }

    George2 () {
        System.out.println(name);

        String name = "Барри";
        System.out.println(name);

        System.out.println(this.name);
    }

}
