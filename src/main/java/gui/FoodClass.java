package gui;

public class FoodClass {
     String type;
     int price;
     float ves;
     int count;
     int kaloris;

    public FoodClass(String type, int price, float ves, int count, int kaloris) {
        this.type = type;
        this.price = price;
        this.ves = ves;
        this.count = count;
        this.kaloris = kaloris;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public float getVes() {
        return ves;
    }

    public void setVes(float ves) {
        this.ves = ves;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getKaloris() {
        return kaloris;
    }

    public void setKaloris(int kaloris) {
        this.kaloris = kaloris;
    }

    public  int calculate () {
        return price / 100;
    }




}
