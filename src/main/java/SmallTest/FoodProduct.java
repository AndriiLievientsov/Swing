package SmallTest;

public class FoodProduct {
    private String type;
    private float ves;
    private int count;
    private int kaloris;
    private int price;


    public FoodProduct(String type, float ves, int count, int kaloris, int price) {
        this.type = type;
        this.ves = ves;
        this.count = count;
        this.kaloris = kaloris; // если есть Гетер/Сетер то в этом коде он не нужен
        this.price = price;
    }

    public String getType() {
        if (!type.equals("")) { // простая защита от ввода путого значения в поле name
            this.type = type;
        }
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getVes() {
        if (ves <= 0) {
            this.ves = ves;
        }
        return ves;
    }

    public void setVes(float ves) {
        this.ves = ves;
    }

    public int getCount() {
        if (count <= 0) {
            this.count = count;
        }
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getKaloris() {
        if (kaloris <= 0) {
            this.kaloris = kaloris;
        }
        return kaloris;
    }

    public void setKaloris(int kaloris) {
        this.kaloris = kaloris;
    }

    public int getPrice() {
        if (price <= 0) {
            this.price = price;
        }
        return price;
    }

    public void setPrice(int price) {
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
