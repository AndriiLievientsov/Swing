package gui3;

import java.awt.*;

public class Designer {
    static String nameOfDesigner = "Дом моды для чайников";
    static Color color;
    static int price;

    static int shirts = 475;
    static int pants = 11;
    static int jackets = 5555;
    static int coats = 17;
    static int ties = 489314;
    static int shoes = 99;

    public static String getNameOfDesigner() {
        return nameOfDesigner;
    }

    public static void setNameOfDesigner(String nameOfDesigner) {
        Designer.nameOfDesigner = nameOfDesigner;
    }

    public static Color getColor() {
        return color;
    }

    public static void setColor(Color color) {
        Designer.color = color;
    }

    public static int getPrice() {
        return price;
    }

    public static void setPrice(int price) {
        Designer.price = price;
    }

    public static int totalPrice() {
        return shirts + pants + jackets + coats + ties + shoes;
    }

    public static String getColorName() {
        if (color.equals(Color.RED)) {
            return "Красный";
        } else if (color.equals(Color.BLUE)) {
            return "Синий";
        } else if (color.equals(Color.GREEN)) {
            return "Зеленый";
        } else if (color.equals(Color.BLACK)) {
            return "Черный";
        } else if (color.equals(Color.YELLOW)) {
            return "Желтый";
        } else {
            return "Неизвестный цвет";
        }
    }
}


