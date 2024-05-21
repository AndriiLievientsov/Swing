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
/*
Товар, который продается в продуктовом магазине, имеет несколь­
ко характеристик: тип еды (кусочки персика), вес (500 грамм), коли­
чество порций (4), число калорий в одной порции (70).
Объявите класс FoodProduct. Объявите другой класс, который соз­
дает экземпляры класса FoodProduct и отображает сведения об
этих экземплярах.
 */
