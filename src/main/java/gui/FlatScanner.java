package gui;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FlatScanner {
    public static void main(String[] args)  throws IOException {
        File file = new File("C:\\Users\\Apafios\\IdeaProjects\\Swing-HeadFirst\\src\\main\\java\\gui\\Flat.txt");
        Scanner flatscanner = new Scanner(file);

//        flatscanner.nextLine();
//        flatscanner.nextInt();
//        flatscanner.nextInt();

        String line = flatscanner.nextLine();
        String line2 = flatscanner.nextLine();
        String line3 = flatscanner.nextLine();
        System.out.println(line +"\n"+ line2 +"\n"+ line3);

        flatscanner.close();


    }
}
