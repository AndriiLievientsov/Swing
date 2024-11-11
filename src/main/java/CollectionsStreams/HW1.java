package CollectionsStreams;

import java.util.ArrayList;
import java.util.Collections;

public class HW1 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(85);
        list.add(19);
        list.add(0);
        list.add(103);
        list.add(13);

        int maxNumber = Collections.max (list);
        System.out.println(maxNumber);
    }

}

//Создайте коллекцию ArrayList, включающую целочисленные значения.
// Затем обойдите значения в списке, чтобы найти наибольшее
//из них. Например, если список содержит числа 85, 19, О, 103 и 13,
//отобразите число 103.

/*Альтернатива перебора и поискап Большего значения

   Переменная для хранения максимального значения
    int maxNumber = Integer.MIN_VALUE;

    Проход по всем элементам списка
        for (int number : numbers) {
        if (number > maxNumber) {
        maxNumber = number;
    }
}

 */