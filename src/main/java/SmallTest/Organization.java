package SmallTest;

public class Organization {
    String namecompany;
    double money;
    String valuta;
    boolean isCommercial;
    double snalogamy;

    public Organization(String namecompany, double money, String valuta, boolean isCommercial, double snalogamy) {
        this.namecompany = namecompany;
        this.money = money;
        this.valuta = valuta;
        this.isCommercial = isCommercial;
        this.snalogamy = snalogamy;
    }

    public double calculate(){
        if (isCommercial) {
            return snalogamy * 0.10; // высчитываем налоги 10 или 2 процента от суммы
        }else {
            return snalogamy * 0.02;
        }
    }

    public void display () {
        System.out.println("Имя " + namecompany);
        System.out.println("Количество денег " + money);
        System.out.println("Типа валюты " + valuta);
        System.out.println("Коммерческая: " + (isCommercial ? "Да" : "Нет"));
        System.out.println("Размер налогов составляет " + calculate());
    }




}
