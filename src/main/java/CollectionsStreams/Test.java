package CollectionsStreams;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        ArrayList <String> people = new ArrayList<>();
        Scanner diskScanner = new Scanner(new File("C:\\Users\\Apafios\\IdeaProjects\\Swing-HeadFirst\\src\\main\\java\\CollectionsStreams\\names.txt"));

        while (diskScanner.hasNext()) {
            people.add(diskScanner.nextLine());
        }

        people.remove(0);
        people.add(2, "Jim Newton");

        for (String name: people) {
            System.out.println(name);
        }
        diskScanner.close();


    }
}
