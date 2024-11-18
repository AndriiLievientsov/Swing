package ExceptionThing;

import java.io.*;

import java.io.*;

public class ExceptionThreeHW {
    public static void main(String[] args) throws IOException {
        File fileIn = new File("C:\\Users\\Apafios\\IdeaProjects\\Swing-HeadFirst\\src\\main\\java\\ExceptionThing\\input.txt");
        FileInputStream fileInStrm = new FileInputStream(fileIn);
        DataInputStream dataInputStr = new DataInputStream(fileInStrm);

        File fileOut = new File("C:\\Users\\Apafios\\IdeaProjects\\Swing-HeadFirst\\src\\main\\java\\ExceptionThing\\output.txt"); // Укажите расширение для выходного файла
        FileOutputStream fileOutputStr = new FileOutputStream(fileOut);
        DataOutputStream dataOutputStr = new DataOutputStream(fileOutputStr);

        int numFilesCopied = 0;

        try {
            while (true) {
                dataOutputStr.writeByte(dataInputStr.readByte());
            }
        } catch (EOFException e) {
            numFilesCopied = 1;
        } finally {
            // Закрытие потоков
            dataInputStr.close();
            dataOutputStr.close();
        }

        System.out.println("Файл успешно создан и записан.");
    }
}
