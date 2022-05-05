package topicos;

/**
 *
 * @author pzx64
 */
import java.awt.*;
import javax.swing.*;

public class FirstProgram extends JApplet{
    
    @Override
    public void paint (Graphics g){
        super.paint(g);
        g.drawString("Hello Worlding", 0, 0);
        g.drawString("Java rocks", 0, 50);
        g.drawString("Skiing", 50, 50);
        g.drawString("To be, or not 2 B", 50, 65);
    }
}
