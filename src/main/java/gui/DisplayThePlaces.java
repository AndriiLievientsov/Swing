package gui;

import java.util.Scanner;

public class DisplayThePlaces {
    public static void main(String[] args) {
        PlaceToLive p1 = new PlaceToLive("Ketuzova",3,76);
        PlaceToLive p2 = new PlaceToLive("NewOrlovskaya", 1, 45);
        PlaceToLive p3 = new PlaceToLive("Titova", 4, 110);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стоимость квадратного метра: ");
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        String c = scanner.nextLine();


        p1.vivodData();
        System.out.println("Цена за квадратный метр всего " + p1.rentbill(Integer.parseInt(a)) + "\n");
        p2.vivodData();
        System.out.println("Цена за квадратный метр всего " + p2.rentbill(Integer.parseInt(b)) + "\n");
        p3.vivodData();
        System.out.println("Цена за квадратный метр всего " + p3.rentbill(Integer.parseInt(c)));
        
    }
}
