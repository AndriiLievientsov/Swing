package NewTry24;

import com.sun.source.tree.IfTree;

import javax.swing.*;
import java.io.File;
import java.util.Scanner;
import java.util.Random;
//import static java.lang.System.out;


public class Test {
    public static void main(String[] args) {
//        Scanner wow = new Scanner(System.in);
//
//        int weightOfAPerson;
//        int elevatorWeightLimit;
//        int numberOfPeople;
//        System.out.print("Введи ограничение Лифта: ");
//        int trueNumberOfPersonInelevator = wow.nextInt();
//
//        weightOfAPerson = 68;
//        elevatorWeightLimit = 635;
//        numberOfPeople = elevatorWeightLimit/weightOfAPerson;
//        System.out.println(numberOfPeople);
//        if (numberOfPeople <= trueNumberOfPersonInelevator) {
//            System.out.println("Все члены семейсва Смитов влезли в лифт");
//        }else {
//            System.out.println("Сорян Голяк");
//        }
//---------------------------------------------------------------
//        System.out.println("Введите пароль: ");
//
//        Scanner keyboard = new Scanner(System.in);
//        String password = keyboard.next();
//
//        System.out.println("Вы ввули >>" + password + "<<");
//        System.out.println();
//
//        if (password == "swordfish") {
//            System.out.println("Введенный пароль ");
//            System.out.println("совпадает с хранящимся ");
//            System.out.println("паролем. Поздравляем, ");
//            System.out.println("вы хаке. ");
//        }else {
//            System.out.println("Введенный пароль ");
//            System.out.println("несовпадает с ");
//            System.out.println("хранящимся паролем.");
//            System.out.println("Вам просто не повезло.");
//        }
//        System.out.println();
//
//        if (password.equals("swordfish")) {//вот так СРАВНИВАТЬ СТРОКИ,правильней чем-  ==
//            System.out.println("Введенный пароль ");
//            System.out.println("правильный! ");
//            System.out.println("Можете войти ");
//            System.out.println("в систему.");
//        }else {
//            System.out.println("Введенный пароль ");
//            System.out.println("неправильный! ");
//            System.out.println("Попытайся ");
//            System.out.println("еще раз.. ");
//        }
//        keyboard.close();
//---------------------------------------------------------------
//        String username = JOptionPane.showInputDialog("Имя пользователя");
//        String password = JOptionPane.showInputDialog("Пароль: ");
////        int numberOfCows = Integer.parseInt(JOptionPane.showInputDialog("Че почем??"));
////        double fractionOfHolsteins = Double.parseDouble(JOptionPane.showInputDialog("Голшит: "));
//
//        if(username != null && password != null &&
//                (
//                (username.equals ("ЬЬurd") && password.equals ("swordfish")) ||
//                (username.equals ( "hritter" ) && password.equals ("preakston"))
//                )
//        )
//        {
//            JOptionPane.showMessageDialog(null, "Вы допушены в систему.");
//        }else {
//            JOptionPane.showMessageDialog(null, "Попытайтесь еще раз..");
//        }
//---------------------------------------------------------------
//        Scanner keyboard = new Scanner(System.in);
//        System.out.println("Имя пользователя");
//        String username = keyboard.next();
//
//        if (username.equals("bburd")) {
//            System.out.println("Пароль: ");
//            String password = keyboard.next();
//
//            if (password.equals("swordfish")){
//                System.out.println("Вы в системе");
//            }else {
//                System.out.println("Неправельный пароль");
//            }
//        }else {
//            System.out.println("Неверный Пользователей");
//        }
//        keyboard.close();
//-----------------------------------------------------------------
//        String username = JOptionPane.showInputDialog("Имя пользователя: ");
//
//        if (username == null) {
//            JOptionPane.showMessageDialog(null, "Хей мало инфы!");
//            JOptionPane.showMessageDialog(null, "НЕТ ПАРОЛЯ хули дальше");
//        }else {
//           JOptionPane.showMessageDialog(null, "Кулл теперь давай пароль");
//            String password = JOptionPane.showInputDialog("Введите пароль");
//            if (password == null) {
//                JOptionPane.showMessageDialog(null, "Та блни, пароля нет!");
//            }else {
//                JOptionPane.showMessageDialog(null, "Ну вот так бы и сразу");
//            }
//        }
//-------------------------------------------------------------------
//        Scanner keyboard = new Scanner(System.in);
//        System.out.println("Почему Эл стоит под дождем? Введите номер: ");
//        int verse = keyboard.nextInt();
//
//        switch (verse) {
//            case 1:
//                System.out.println("Потому что дождь идет очень долго");
//                break;
//            case 2:
//                System.out.println("Потому что он очень расстроен.");
//                break;
//            case 3:
//                System.out.println("Потмоу что он все равно уже мокрый");
//                break;
//            default:
//                System.out.println("Такой причины нет. Попытайтесь еще раз.");
//                break;
//        }
//        System.out.println("OOooooo....");
//        keyboard.close();
//--------------------------------------------------------------------
//        Scanner keyboard = new Scanner(System.in);
//        System.out.print("Почему Эл плачет? " + "\n");
//        String verse = keyboard.next();
//        switch (verse) {
//            case "a":
//                System.out.println("Потому что");
//                break;
//            case "b":
//                System.out.println("ШО?!");
//                break;
//            case "c":
//                System.out.println("Uuuuuu");
//                break;
//            default:
//                System.out.println("Default");
//                break;
//        }
//        keyboard.close();

//        Scanner keyboard = new Scanner(System.in);
//
//        System.out.print("Погнали. Какой месяц?:");
//        String verse = keyboard.next();
//
//        switch (verse){
//            case "Январь":
//                System.out.println("Январь31 дней");
//                break;
//            case "Февраль":
//                System.out.print("Месяц был высокосный?: ");
//                Scanner keyboard2 = new Scanner(System.in);
//                String verse2 = keyboard2.next();
//                if (verse2.equals("да")){
//                    System.out.println("Высокосны год 28");
//                }else {
//                    System.out.println("Месяц был нормальный 31 день Февраля");
//                }
//                break;
//            case "Март":
//                System.out.println("Март 31 дней");
//                break;
//            case "Апрель":
//                System.out.println("Апрель 31 дней");
//                break;
//            case "Май":
//                System.out.println("Май 31 дней");
//                break;
//            case "Июнь":
//                System.out.println("Июнь 31 дней");
//                break;
//            case "Июль":
//                System.out.println("Июль 31 дней");
//                break;
//            case "Авгус":
//                System.out.println("Авгус 31 дней");
//                break;
//            case "Сентабрь":
//                System.out.println("Сентабрь 31 дней");
//
//                break;
//            case "Октябрь":
//                System.out.println("Октябрь 31 дней");
//                break;
//            case "Ноябрь":
//                System.out.println("Ноябрь 31 дней");
//                break;
//            case "Декабрь":
//                System.out.println("Декабрь 31 дней + Новый год");
//                break;
//            default:
//                System.out.println("Не хочешь как хочешь");
//        }
//        keyboard.close();
// -----------------------------------------------------
//        Scanner keyboard = new Scanner(System.in);
//
//        int numberGuesses = 0;
//        int randomNumber = new Random().nextInt(100) + 1;
//        System.out.println(randomNumber);
//
//        System.out.println("*************");
//        System.out.println("Добро пожаловать в игру!");
//        System.out.println("*************");
//        System.out.println();
//
//        System.out.println("Введите число от 1 до 10: ");
//        int inputNumber = keyboard.nextInt();
//        numberGuesses++;
//
//
//        while (inputNumber != randomNumber) {
//            System.out.println();
//            if (inputNumber >= randomNumber) {
//                System.out.println("Введите Меньше число");
//            }else {
//                System.out.println("Введите Больше число ");
//            }
//
//            System.out.println("Попытайтесь еще раз...");
//            System.out.print("Введите число от 1 до 10: ");
//            inputNumber = keyboard.nextInt();
//            numberGuesses++;
//        }
//
//            System.out.print("Вы угадали после ");
//            System.out.println(numberGuesses + " попыток");
//-----------------------------------------------------------------
//        Scanner scanner = new Scanner(System.in);
//
//        int max = 0;
//        int number;
//        System.out.println("Введите число: ");
//        number = scanner.nextInt();
//
//        // Цикл продолжается, пока пользователь не введет не
//        // положительное число
//        while (number > 0) {
//            number = scanner.nextInt();
//            if (number > max) { // фиксируем максимальное числи и передаем в number
//                max = number;
//            }
//        }
//
//        // Выводим максимальное число
//        System.out.println("Наибольшее число: " + max);
//        -----------------------------------------------------------------

//        for (int count = 1; count <= 10; count++) {
//            System.out.print("Значение счетчика равно ");
//            System.out.print(count);
//            System.out.print("." + "\n");
//        }
//        System.out.println("Достаточно");

//        int count = 0;
//        System.out.println("Погнали");
//        while (count <= 10){
//            System.out.println("Эта херня равна " + count);
//            count++;
//        }
//        int total = 0;
//        for (int i = 0; i < 10 ; i++) {
//            total += i;
//        }
//        System.out.println(total);
//----------------------------------------------------------------
//        Scanner keyboard = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int n = keyboard.nextInt();
//        keyboard.close();
//        int factorial = 1;
//        for (int i = 1; i < n; i++) {
//            factorial *= i; // factorial = factorial * i;
//        }
//        System.out.println("Клятый факториал от числа " + n + " равен " + factorial);
//----------------------------------------------------------------
//        for (int row = 0; row < 5; row++) {
//            for (int colum = 0; colum < 5; colum++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//------------------------------------------------------------------
//        for (int i = 0; i < 3; i++) {
//            for (int row = 0; row < 5; row++) {
//                for (int colum = 0; colum <= row; colum++) {
//                    System.out.print(" * ");
//                }
//                System.out.println();
//            }
//            System.out.println("-----------------");
//        }
//------------------------------------------------------------------
//        for (int verse = 0; verse <=3; verse++) {
//            System.out.println("*******************");
//
//            System.out.print("Эл весь мокрый. ");
//            System.out.println("Почему Эл мокрый? ");
//            System.out.println("Потому что он стоит под дождем. ");
//            System.out.println("Почему Эл стоит под дождем? ");
//            System.out.println("Потому что он очень несчастлив. ");
//
//            System.out.println("------------------");
//            switch (verse) {
//                case 1:
//                    System.out.println("Потмоу что дождь идет очень долго.");
//                    break;
//                case 2:
//                    System.out.println("Потому что он оченб несчастлив.");
//                    break;
//                case 3:
//                    System.out.println("Потому что он все равно уже мокрый");
//                    break;
//            }
//
//            switch (verse) {
//                case 3:
//                    System.out.println("Очень долго, очень долго...");
//                case 2:
//                    System.out.println("Оченьб очень несчатслив.");
//                case 1:
//                    System.out.println("Все равно, все равно уже мокрый.");
//            }
//
//            System.out.println("Под дождемб под дождем.");
//            System.out.println("О-ооооооооо");
//            System.out.println();
//        }
//        System.out.print("Эл весь мокрый.");
//        System.out.println("Почему Эл весь мокрый?");
//        System.out.print("Потому что он стоит под дождем. ");
//        System.out.println("Под дождемб под дождем.");
//--------------------------------------------------------------------------------
//        Scanner keyboard = new Scanner(System.in);
//        while (true){
//            System.out.println("Введите значение типа int: ");
//            int i = keyboard.nextInt();
//            if (i == 0) {
//                break;
//            }
//            System.out.println(i);
//        }
//        System.out.println("Готово!");
//        keyboard.close();
//-------------------------------------------------------------------------------
//        Scanner keyboard = new Scanner (System.in);
//        while (true) {
//            System.out.println("Введите значение типа int: ");
//            int i = keyboard.nextInt();
//            if (i > 10) {
//                continue;
//            }
//            if (i == 0) {
//                break;
//            }
//            System.out.println(i);
//        }
//        System.out.println("Готово!");
//        keyboard.close();
//----------------------------------------------------------------------------------------
//        File evidence = new File ("cookedBooks.txt");
////        try {
////            out.println("Поиск " + evidence.getCanonicalPath());
////        }catch (java.io.IOException e) {
////            e.printStackTrace();
////        }
//
//        Scanner keyboard = new Scanner ( System . in ) ;
//        char reply;
//
//        do {
//            out.print ("Удалить файл? (y/n) ");
//            reply = keyboard.findWithinHorizon(".", 0).charAt(0);
//        } while (reply != 'y' && reply != 'Y' && reply != 'n' && reply != 'N');
//
//        if (reply == 'y' || reply == 'Y') {
//            out.println ( "Лaднo , удаляю." );
//            evidence.delete () ;
//            out.println ("Файл удален.") ;
//            } else {
//                out.println ("Ладно , не удаляю." );
//            }
//            keyboard.close () ;
//-----------------------------------------------------------------------------------------

//        Scanner keyboard = new Scanner(System.in);
//        int numberGuesses = 0;
//        int randomNumber = new Random().nextInt(10) + 1;
//        System.out.println(randomNumber);
//        System.out.println("Введите число от 1 до 10: ");
//        int inputNumber = keyboard.nextInt();
//        numberGuesses++;
//
//        do {
//            System.out.println();
//            System.out.println("Попытайтесь еще раз...");
//            System.out.print("Введите целое число от 1 до 10: ");
//            inputNumber = keyboard.nextInt();
//            numberGuesses++;
//        }while (inputNumber != randomNumber);
//        System.out.println("Вы выиграли после ");
//        System.out.println(numberGuesses + " попыток.");
// -----------------------------------------------------------

//        MegaTest a = new MegaTest();
//        GigaTest b = new GigaTest();
//
//        a.name = "AAAAAA";
//        a.balance = 4.55;
//        a.address = "sssss";
//
//        System.out.println(a.name + "\n" + a.address + "\n" + a.balance + "\n" + "---------");
//        System.out.println(b.balance);

        MegaTest megaTest = new MegaTest();
        GigaTest gigaTest = new GigaTest();

        megaTest.name = "A_Name";
        megaTest.address = "A_address";
        megaTest.balance = 55.63;

        gigaTest.name = "B_name";
        gigaTest.address = "B_address";
        gigaTest.balance = 24.02;

        System.out.print(megaTest.name);
        System.out.print(" (");
        System.out.print(megaTest.address);
        System.out.print(") иммеет на счету $");
        System.out.print(megaTest.balance + "\n");

        System.out.println();
        System.out.print(gigaTest.name);
        System.out.print(" (");
        System.out.print(gigaTest.address);
        System.out.print(") имеет на счету $");

        System.out.print(gigaTest.balance);
//        System.out.print(gigaTest.balance);
        //коментарий для проверки гита



    }
}

