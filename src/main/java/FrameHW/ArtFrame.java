package FrameHW;
import  java.awt.Graphics;
import java.io.Serial;
import  javax.swing.JFrame;


public class ArtFrame extends JFrame {
    @Serial
    private static final long serialVersionUID = 1L;
    Drawing drawing;

    public ArtFrame (Drawing drawing) {
        this.drawing = drawing;
        setTitle("Произведение абстрактного искусства");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint (Graphics g) {
        drawing.paint(g);
    }

}
