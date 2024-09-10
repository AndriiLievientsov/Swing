package Masiv;

public class ShowGuests4 {
    public static void main(String[] args) {
        double[] num = {9.36, 10.22, 125.1, 4.7, 5.5}; // Заменил 5,5 на 5.5
        double x = 0;

        // Цикл для нахождения суммы всех элементов массива
        for (double numNum : num) {
            x = x + numNum;
        }

        // Находим среднее значение
        double average = x / num.length;

        System.out.println("Среднее значение: " + average);
    }
}

