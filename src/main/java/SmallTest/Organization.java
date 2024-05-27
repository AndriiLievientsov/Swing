package SmallTest;

public class Organization {
    String namecompany;
    double money;
    String valuta;
    boolean isCommercial;
    double profit;

    public Organization(String namecompany, double money, String valuta, boolean isCommercial, double profit) {
        this.namecompany = namecompany;
        this.money = money;
        this.valuta = valuta;
        this.isCommercial = isCommercial;
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
        System.out.println("Типа валюты " + valuta);
        System.out.println("Коммерческая: " + (isCommercial ? "Да" : "Нет"));
        System.out.println("Сумма налога: $" + calculate());
    }




}
