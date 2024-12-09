package FrameHW.circle2;

import FrameHW.Drawing;

import java.awt.*;

public class DrawingYW extends Drawing {
    public int x = 70, y = 10, width = 40, height = 40;

    public  void paint (Graphics g) {
        g.drawOval (x,y, width,height);
        g.setColor(Color.YELLOW);
        g.fillOval(x,y,width,height);
    }
}
//Делал дз чтоб отобразить во фрейме типа светофора
