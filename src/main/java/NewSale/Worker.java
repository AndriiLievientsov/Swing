package NewSale;

public class Worker {
    String name;
    int effect;
    int bonus;

    public Worker(String name, int effect) {
        this.name = name;
        this.effect = effect;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEffect() {
        return effect;
    }

    public void setEffect(int effect) {
        this.effect = effect;
    }
}
