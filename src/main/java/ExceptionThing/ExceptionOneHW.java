package ExceptionThing;

import java.util.Scanner;

public class ExceptionOneHW {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String[] words = new String[5];

        try {

            int i = 0;
            do {
                words[i] = keyboard.next();
            }while (!words[i++].equals("Выход"));

            for (int j = 0; j < 5; j++) {
                System.out.println(words[j].length());
            }
        }catch (Exception e) {
            System.out.println("Введено больше 5 слов");
        }


        keyboard.close();

    }
}
