package FrameHW;
import java.awt.*;

public class Drawing {
    public int x = 20, y = 10, width = 40, height = 40;

    public  void paint (Graphics g) {
        g.drawOval (x,y, width,height);
        g.setColor(Color.GREEN);
        g.fillOval(x,y,width,height);
    }


}
