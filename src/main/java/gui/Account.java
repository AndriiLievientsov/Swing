package gui;

public class Account {
    private String name;
    private double profit;
    private boolean isCommercial;

    public Account(String name, double profit, boolean isCommercial) {
        this.name = name;
        this.profit = profit;
        this.isCommercial = isCommercial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public boolean isCommercial() {
        return isCommercial;
    }

    public void setCommercial(boolean isCommercial) {
        this.isCommercial = isCommercial;
    }

    // Метод для вычисления налога
    public double calculate() {
        if (isCommercial) {
            return profit * 0.10; // Высчитываем налоги 10% от суммы
        } else {
            return profit * 0.02; // Высчитываем налоги 2% от суммы
        }
    }
}
