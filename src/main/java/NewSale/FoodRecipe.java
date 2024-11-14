package NewSale;

public class FoodRecipe {
    String first;
    String second;
    String main;
    String last;
    double time;

    public FoodRecipe(String first, String second, String main, String last, double time) {
        this.first = first;
        this.second = second;
        this.main = main;
        this.last = last;
        this.time = time;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
}
