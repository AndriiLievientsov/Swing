package gui;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ScannerTry {
    public static void main(String[] args) throws IOException { //это исключения для Scanner
        File file = new File("C:\\Users\\Apafios\\IdeaProjects\\Swing-HeadFirst\\src\\main\\java\\gui\\TestFile.txt");
        Scanner diskScanner = new Scanner(file).useLocale(Locale.GERMANY); // это сделано чтоб данные в файле с запятой (e.g 456,78 номрмально считывались

        diskScanner.nextInt();
        diskScanner.nextDouble();
        diskScanner.next();
        diskScanner.nextLine();

        diskScanner.close();


        File newfile = new File("TestFile.txt");
        System.out.println("Поиск: " + newfile.getAbsolutePath()); // эти строчки для поиска пути к файлу.

    }
}
