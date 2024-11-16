package ExceptionThing;

import java.text.NumberFormat;
import java.util.Scanner;



/*
* В листинге 1 3 .6 цена каждой коробки и максимально допустимое
количество коробок представлены фиксированными значениями.
Внесите улучшения в код, обеспечивающие пользователю возможность ввода этих значений.
* Помните о том, что некоторые из значений лишены смысла.
* Например, отрицательное количество ящиков
никогда не будет слишком большим. Используйте блок trycat ch
для обработки некорректных данных, вводимых пользователем.
* */

public class InventoryD {
    public static void main(String[] args)  {

        Scanner keyboard = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        System.out.print("Сколько коробок вы посчитали? ");
        String numBoxesIn = keyboard.next();
        System.out.print("А какая цена за коробку? ");
        String boxPriceIn = keyboard.next();


            try {

                int numBoxes = Integer.parseInt(numBoxesIn);

                double boxPrice = Double.parseDouble(boxPriceIn);

                if (numBoxes < 0) {
                    throw new OutOfRangeException();
                }

                if (numBoxes > 1000) {
                    throw new NumberToolLargeException();
                }

                System.out.print("Общая стоимость равна: ");
                System.out.println(currency.format(numBoxes * boxPrice));
            } catch (NumberFormatException e) {
                System.out.println("это не число.");
            } catch (OutOfRangeException e) {
                System.out.print(numBoxesIn);
                System.out.println("? Это невозможно!");
            } catch (Exception e) {
                System.out.print("");
                System.out.print("");
                System.out.println("Тип исключения неизвестен");
            }


            System.out.println("Вышел из блока try-catch");

    }
}

@SuppressWarnings("serial")
 class NumberToolLargeException extends  OutOfRangeException{

}
@SuppressWarnings("serial")
 class OutOfRangeException extends  Exception{
}
