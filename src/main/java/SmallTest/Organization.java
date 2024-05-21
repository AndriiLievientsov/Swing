package SmallTest;

public class Organization {
    String namecompany;
    double money;
    String valuta;
    boolean isCommercial;

    public Organization(String namecompany, double money, String valuta, boolean isCommercial) {
        this.namecompany = namecompany;
        this.money = money;
        this.valuta = valuta;
        this.isCommercial = isCommercial;
    }

    public void display () {

        System.out.println("Имя " + namecompany);
        System.out.println("Количество денег " + money);
        System.out.println("Типа валюты " + valuta);
        System.out.println("Коммерческая: " + (isCommercial ? "Да" : "Нет"));
    }
}
