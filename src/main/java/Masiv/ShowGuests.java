package Masiv;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ShowGuests {
    public static void main(String[] args) throws IOException {
        int[] quests = new int[10];
        Scanner diskScanner = new Scanner(new File("src/main/java/Masiv/GuestList.txt"));

        for (int roomNum = 0; roomNum < 10; roomNum++) {
            quests[roomNum] = diskScanner.nextInt();
        }

        System.out.println("Комната\t  Количество постояльцев");
        for (int roomNum = 0; roomNum < 10; roomNum++) {
            System.out.println(roomNum + "\t         " + quests[roomNum]);
        }
        diskScanner.close();
    }
}
