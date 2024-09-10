package Masiv;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.System.out;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FindVacancy {
    public static void main(String[] args) {
        int[] guests = new int[10];
        int roomNum;

        try {
            // Чтение данных из файла
            Scanner diskScanner = new Scanner(new File("src/main/java/Masiv/GuestList.txt"));
            for (roomNum = 0; roomNum < 10; roomNum++) {
                // Проверяем, есть ли следующее целое число в файле
                if (diskScanner.hasNextInt()) {
                    guests[roomNum] = diskScanner.nextInt();
                } else {
                    System.out.println("Ошибка: недостаточно данных в файле. Убедитесь, что в файле 10 чисел.");
                    return; // Прерываем выполнение программы, если данных недостаточно
                }
            }
            diskScanner.close(); // Закрытие файла
            roomNum = 0;

            // Поиск свободной комнаты (где количество гостей = 0)
            while (roomNum < 10 && guests[roomNum] != 0) {
                roomNum++;
            }

            // Если все комнаты заняты
            if (roomNum == 10) {
                System.out.println("Извините, свободных мест нет.");
            } else {
                // Если нашлась свободная комната
                System.out.print("Сколько человек поселятся в комнате " + roomNum + "? ");

                // Получаем ввод от пользователя
                Scanner keyboard = new Scanner(System.in);
                int guestsToAdd = keyboard.nextInt(); // Получаем количество новых гостей от пользователя
                keyboard.close(); // Теперь можно закрыть Scanner

                // Сохраняем новое количество гостей в массив
                guests[roomNum] = guestsToAdd;

                // Записываем обновленные данные в файл
                PrintStream listOut = new PrintStream("src/main/java/Masiv/GuestList.txt");
                for (roomNum = 0; roomNum < 10; roomNum++) {
                    listOut.print(guests[roomNum] + " ");
                }

                listOut.close(); // Закрываем поток вывода
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: неверный формат данных в файле. Ожидалось целое число.");
        } catch (NoSuchElementException e) {
            System.out.println("Ошибка: недостаточно данных в файле.");
        }
    }
}





