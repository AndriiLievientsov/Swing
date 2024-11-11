package CollectionsStreams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        ArrayList<String> animal = new ArrayList<>();
        animal.add("Зебра");
        animal.add("Кошка");
        animal.add("Лошадь");
        animal.add("Собака");

        Collections.sort(animal); //сортировка по алфавиту

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово");
        String newWord = scanner.nextLine();

        animal.add(newWord);
        Collections.sort(animal);

        System.out.println("Список животных: " +  animal);

        scanner.close();


    }
}

/*
Создайте коллекцию ArrayList, включающую значения типа
String (в алфавитном порядке).
Как только пользователь введет новое слово с помощью клавиатуры, программа должна вставить
его в коллекцию так, чтобы не нарушить сортировку в алфавитном
порядке

Например, предположим, что список начинается со слов
"зебра';
"кошка·;
"лошадь" и
 "собака" (в таком порядке).

 После того как пользователь вводит с помощью клавиатуры слово "рыба" (и нажимает
<Enter>), список будет включать слова
"зебра';
"кошка';
"лошадь';
"рыба";
"собака"
(в указанном порядке).

Чтобы написать такую программу, понадобятся метод compareToIgnoreCase из класса String
 и метод size из класса ArrayList.
 */
