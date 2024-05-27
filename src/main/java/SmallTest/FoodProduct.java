package SmallTest;

public class FoodProduct {
    String type;
    float ves;
    int count;
    int kaloris;
    int price;


    public FoodProduct(String type, float ves, int count, int kaloris, int price) {
        this.type = type;
        this.ves = ves;
        this.count = count;
        this.kaloris = kaloris;
        this.price = price;
    }

    public int totalprice () {
        return price * count;
    }

    public  int priceforhungred () {
        return price / 100;
    }


    public int totallkaloris () {
        return kaloris * count;
    }

    public void foodType () {
        System.out.println("Что за еда: " + type + "\n" +
                "А что по весу в килограмах: " + ves + "\n" +
                "Сколько порцияй: " + count + "\n" +
                "Что по каллориям: " + kaloris + "\n" +
                "Сколько за все порции: " + totalprice());
        System.out.println("Цена за сто грамм: " + priceforhungred());
        System.out.println("Сумма каллорий во всех порциях: " + totallkaloris());

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
