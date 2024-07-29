package GeorgeTestFild;

public class George4 {

    String name = "Джордж";

    public static void main(String[] args) {
        new George4();
    }

    George4 () {
        String name = "Барри";
        new YetAnotherClass(this);
    }

}

class YetAnotherClass {
    YetAnotherClass(George4 whoCreatedMe) {
        String name = "Леонард";
        System.out.println(name);
        System.out.println(whoCreatedMe.name);
    }
}
