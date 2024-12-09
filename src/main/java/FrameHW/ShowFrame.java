package FrameHW;

import FrameHW.circle2.DrawingYW;
import FrameHW.circle3.DrawingRED;

import java.awt.*;

public class ShowFrame {
    public static void main(String[] args) {
        Frame artFrame = new Frame();

        artFrame.setSize(200, 100);
        artFrame.setLocation(300, 700);
        artFrame.setVisible(true);

        // Добавляем обработчик закрытия окна
        artFrame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });


        // Добавляем круг, переопределяя метод paint()
        artFrame.add(new Canvas() {
            @Override
            public void paint(Graphics g) {
                // Создаем объект Drawing а после меняем его на DrawingWide/DrawingWideBB
                Drawing circle = new Drawing();
                DrawingYW circle2 = new DrawingYW();
                DrawingRED circle3 = new DrawingRED();
                // Используем метод paint() из класса Drawing
                circle.paint(g);
                circle2.paint(g);
                circle3.paint(g);

             }
            }
        );

    }
}
