package gui2;

import javax.swing.*;
import java.awt.*;

//@SuppressWarnings("serial") - типа чтоб небыло предупреждений из за serialVersionUID. но их и так нет
public class SimpleFrame extends JFrame {
    public SimpleFrame () {
        setTitle("Не тыцяй кнопку!");
        setLayout(new FlowLayout());
//        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new JButton("Тыцни меня!"));
        setSize(300, 100);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
