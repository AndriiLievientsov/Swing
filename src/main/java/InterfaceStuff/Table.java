package InterfaceStuff;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class Table implements  Displayable, Summarizable, Deletable{
    Scanner diskFile;
    ArrayList<String> lines = new ArrayList<>();

    public Table (String fileName) {
        try {
            diskFile = new Scanner(new File(fileName));
        }catch ( FileNotFoundException e) {
            e.printStackTrace();
        }
        while (diskFile.hasNextLine()) {
            lines.add(diskFile.nextLine());
        }
    }

    @Override
    public void display() {
        for (String line :  lines) {
            System.out.println(lines);
        }
    }

    @Override
    public String summarize () {
        return lines.get(0);
    }

    @Override
    public String deletable() {
       return lines.remove(1);
    }

}
