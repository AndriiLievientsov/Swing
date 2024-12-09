package FrameHW.circle3;

import FrameHW.Drawing;


import java.awt.*;

public class DrawingRED extends Drawing {
    public int x = 120, y = 10, width = 40, height = 40;

    public  void paint (Graphics g) {
        g.drawOval (x,y, width,height);
        g.setColor(Color.RED);
        g.fillOval(x,y,width,height);
    }
}
