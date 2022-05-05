package topicos;

/**
 *
 * @author pzx64
 */
import java.awt.*;
import javax.swing.*;

public class TextFonts extends JApplet{
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.drawString("Hello world", 0, 10);
        Font small = new Font("Serif", Font.PLAIN, 8);
        g.setFont(small);
        g.drawString("Java rocks", 0, 50);
        g.drawString("Hiya", 60, 15);
        //fonts permanece igual hasta que se vuelva a llamar a este metodo
        Font big = new Font("SansSerif", Font.BOLD + Font.ITALIC, 36);
        g.setFont(big);
        g.drawString("Skiing is fun", 50, 50);
    }
}
