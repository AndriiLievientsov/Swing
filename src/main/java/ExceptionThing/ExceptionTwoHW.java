package ExceptionThing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionTwoHW {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            Scanner diskScanner = new Scanner(new File("numbers.txt"));


        int [] numerators = new int [5];
        int [] denominators = new int [5];

        int i = 0;
        while (diskScanner.hasNextInt()){
            numerators[i] = diskScanner.nextInt();
            denominators[i] = diskScanner.nextInt();
            i++;
        }


        for (int j = 0; j < numerators.length ; j++) {
            System.out.println(numerators[j] / denominators[j]);
        }

             }catch (Exception exception) {
            System.out.println("Ой ёй файла то и нет");
        }



    }
}
/*Следующий код не компилируется, поскольку вызывает необработанное исключение FileNotFoundException
* Добавьте обработку исключения FileNot FoundException, чтобы
получить возможность компиляции кода. Учтите, что в зависимости
от значений в файле numbers.txt во время выполнения программы могут генерироваться некоторые другие исключения.
*  Добавьте один или несколько блоков try catch, чтобы отображать сообщения о появлении подобных исключений и
* избежать аварийного завершения программы.

* */