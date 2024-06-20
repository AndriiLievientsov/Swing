package Organization_2;

public class Organization_2 {
    String namecompany;
    double money;
    boolean isCommercial;
    double profit;

//    public Organization_2(String namecompany, double money, boolean isCommercial, double profit) {
//        this.namecompany = namecompany;
//        this.money = money;
//        this.isCommercial = isCommercial;
//        this.profit = profit;
//    }


    public String getNamecompany() {
        return namecompany;
    }

    public void setNamecompany(String namecompany) {
        this.namecompany = namecompany;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public boolean isCommercial() {
        return isCommercial;
    }

    public void setCommercial(boolean commercial) {
        isCommercial = commercial;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public double calculate(){
        if (isCommercial) {
            return profit * 0.10; // высчитываем налоги 10 или 2 процента от суммы
        }else {
            return profit * 0.02;
        }
    }


    public void display () {
        System.out.println("Имя " + namecompany);
        System.out.println("Количество денег " + money);

        System.out.println("Коммерческая: " + (isCommercial ? "Да" : "Нет"));
        System.out.println("Сумма налога: $" + calculate());
    }
}
