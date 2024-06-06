package gui;


//import SmallTest.Account;

public class GuessingGame {
//    public static void main(String[] args) {
//        DummiesFrame frame = new DummiesFrame("Арифмомент");
//        frame.addRow("Первое число");
//        frame.addRow("Второе число");
//        frame.setButtonText("Сумма");
//        frame.go();
//    }
//    public static int calculate (int firstNumber, int secondNumber) {
//        return firstNumber + secondNumber;
//    }

    //----------------------------------------
//public static void main(String[] args) {
//    DummiesFrame frame = new DummiesFrame("Игра в угадывание чисел");
//    frame.addRow("Введите число от 1 до 10");
//    frame.setButtonText("Щелкните на этой кнопке ");
//    frame.go();
//}
//public static String calculate (int inputNumber) {
//    Random random = new Random();
//    int randomNumber = random.nextInt(10) + 1;
//    if (inputNumber == randomNumber) {
//        return "Вы выиграли.";
//    } else {
//        return "Вы проиграли, Было загадано случайное число " + randomNumber + ".";
//        }
//    }

    //----------------------------------------------
//    public static void main(String[] args) {
//        DummiesFrame frame = new DummiesFrame("Отображение счета");
//        frame.addRow("Полное имя");
//        frame.addRow("Адрес");
//        frame.addRow("Баланс");
//        frame.setButtonText("Отобразить");
//        frame.go();
//    }
//
//    public static  String calculate (String name, String address, double balance) {
//        Account myAccount = new Account();
//        myAccount.setName(name);
//        myAccount.setAddress(address);
//        myAccount.setBalance(balance);
//        return myAccount.getName() +" (" + myAccount.getAddress() + ") имеет на счету$" + myAccount.getBalance();
//    }
    public static void main(String[] args) {
        DummiesFrame frame = new DummiesFrame("Первое задание");
        frame.addRow("Название организации");
        frame.addRow("Годовая выручка");
        frame.addRow("Статус комерческая/некомерческая");
        frame.setButtonText("ЖМЁМ!");
        frame.go();
    }

    public static String calculate(String name, double profit, boolean isCommercial) {
        Account myAccount = new Account(name, profit, isCommercial);
        double tax = myAccount.calculate(); // Вычисляем налог

        return "Название фирмы " + myAccount.getName() + " В год $ " + myAccount.getProfit() + " Налоги $" + tax;
    }

}
