package FrameHW.newone;

import FrameHW.Drawing;

import java.awt.*;

public class DrawingWideBB extends Drawing {
    int width = 100, height = 30;

    public void paint (Graphics g) {
        g.drawOval(x,y,width,height);
    }
}
