package NewSale;

import java.text.NumberFormat;
import java.util.ArrayList;

public class TallySales {
    public static void main(String[] args) {
        ArrayList <Sale> sales = new ArrayList<Sale>();
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        fillTheList(sales);

        double total = 0;

        for (Sale sale : sales) {
            // Проверяем, является ли item "DVD"
            if (sale.getItem().equals("DVD")) {
                total = total + sale.getPrice();
            }
        }

        System.out.println(currency.format(total));

    }

    static void fillTheList (ArrayList<Sale> sales) {
        sales.add(new Sale("DVD", 15.00));
        sales.add(new Sale("Книга", 12.00));
        sales.add(new Sale("DVD", 21.00));
        sales.add(new Sale("CD", 5.25));
    }


}
