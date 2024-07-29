package GeorgeTestFild;

public class George3 {
    static String name = "Джордж";

    public static void main(String[] args) {
        String name = "Барри";
        new OtherClass();
    }
}

    class OtherClass {
        OtherClass() {
            String name = "Леонард";
            System.out.println(name);
            System.out.println(George3.name);
        }
    }


