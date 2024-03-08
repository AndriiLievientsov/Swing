package NewTry24;

import com.sun.source.tree.IfTree;

import javax.swing.*;
import java.util.Scanner;
import java.util.Random;


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



    }
}
