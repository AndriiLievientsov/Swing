package gui;

import java.util.Scanner;

public class PlaysToLiveGui {
    public static void main(String[] args) {
        DummiesFrame frame = new DummiesFrame("Третье ДЗ");
        frame.addRow("Адрес проживания");
        frame.addRow("Количество комнат");
        frame.addRow("Размер кубатуры");
        frame.setButtonText("Ух ЩА будет");
        frame.go();
    }

    public static String calculate (String address, int rooms, int size) {
        PlaceToLive placeToLive = new PlaceToLive(address,rooms,size);
        double x = placeToLive.newRentBill();
        return "Стоимость квадратного метрап " + x;
    }

}
