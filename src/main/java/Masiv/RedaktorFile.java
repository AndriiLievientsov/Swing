package Masiv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RedaktorFile {
    public static void main(String[] args) throws IOException {
        // Создаем объект для ввода данных с клавиатуры
        Scanner scanner = new Scanner(System.in);
        // Определяем путь к файлу
        String fileName = "C:\\Users\\Apafios\\IdeaProjects\\Swing-HeadFirst\\src\\main\\java\\Masiv\\Test.txt";

        // Открываем FileWriter в режиме добавления (append)
        FileWriter writer = new FileWriter(fileName, true);  // 'true' для добавления текста в конец файла
        System.out.println("Введите текст для добавления в файл. Введите 'exit', чтобы завершить.");

        // Бесконечный цикл для ввода данных
        while (true) {
            // Считываем строку от пользователя
            System.out.print("Введите строку: ");
            String input = scanner.nextLine();

            // Проверяем на команду "exit" для завершения программы
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Программа завершена.");
                break;
            }

            // Записываем строку в файл
            writer.write(input + System.lineSeparator()); // Добавляем строку с переносом на новую строку
            writer.flush();  // Очищаем буфер и сразу записываем данные в файл

            // После записи строки считываем содержимое файла и выводим его
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            System.out.println("--------------");
//            System.out.println("Текущие строки в файле:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();  // Закрываем BufferedReader после чтения
        }

        // Закрываем ресурсы после окончания записи
        writer.close();
        scanner.close();
    }
}
