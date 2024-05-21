package SmallTest;

public class FoodProduct {
    String type;
    float ves;
    int count;
    int kaloris;

    public FoodProduct(String type, float ves, int count, int kaloris) {
        this.type = type;
        this.ves = ves;
        this.count = count;
        this.kaloris = kaloris;
    }

    public void foodType () {
        System.out.println("Что за еда: " + type + "\n" +
                "А что по весу в граммах: " + ves + "\n" +
                "Сколько порцияй: " + count + "\n" +
                "Что по каллориям: " + kaloris);
        System.out.println();


    }
}
