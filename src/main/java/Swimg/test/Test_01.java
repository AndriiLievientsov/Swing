package Swimg.test;

import javax.swing.*;
import java.awt.*;

public class Test_01 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame() {};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(500,300);
        jFrame.setLocation(900,500);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2 - 250,dimension.height/2 - 150,500,300);
        jFrame.setTitle("This is my App + ");



    }
}
