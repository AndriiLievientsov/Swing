package Swimg.test;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.net.MalformedURLException;
import java.net.URL;

public class Test_01 {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        jFrame.add(new MyComponent());
        //        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
//        for (String s: fonts) {
//            System.out.println(s);
//        } - как узнать какие Шрифты доступны

    }


    static class  MyComponent extends  JComponent{
        @Override
        protected  void paintComponent(Graphics g){
            Font font = new Font("Times New Roman",Font.BOLD,20);
            Graphics2D g2 = (Graphics2D) g;
            g2.setFont(font);
            g2.drawString("Hello world", 20,20);
            Point2D p1 = new Point2D.Double(70,70);
            Point2D p2 = new Point2D.Double(170,170);
            Line2D l2 = new Line2D.Double(p1,p2);
            g2.draw(l2);
            Ellipse2D el = new Ellipse2D.Double(70,70,170,170);
            g2.setPaint(Color.red);
            g2.draw(el);
//            g2.fill(el);
            Rectangle2D r2 = new  Rectangle2D.Double (70,70,170,170);
            g2.draw(r2);
            try {
                URL url = new URL("https://upload.wikimedia.org/wikipedia/uk/thumb/8/85/Логотип_Java.png/250px-Логотип_Java.png");
                Image image = new ImageIcon(url).getImage();
                g2.drawImage(image, 220,50, null);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }


        }
    }


    static JFrame getFrame(){
        JFrame jFrame = new JFrame() {};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2 - 250,dimension.height/2 - 150,500,300);
        return jFrame;
    }
}
