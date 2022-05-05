/*
 * los tipos de fuente se diferencian ya que es el esitlo que tendra la letra
 * a diferencia de las fuentes de texto, que son negrita, cursiva, plano
 */
package topicos;

/**
 *
 * @author pzx64
 */

import java.awt.*;
import javax.swing.*;

public class FontTypes extends JApplet{
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Font serf = new Font("Serif", Font.PLAIN, 14);
        g.setFont(serf);
        g.drawString("Serif", 10, 15);
        //para evitar hacer tantas lineas de codigo, podemos incorporarlo en una sola linea
        g.setFont(new Font("SansSerif", Font.PLAIN, 14));
        g.drawString("Sans-serif", 10, 30);
        g.setFont(new Font("Dialog", Font.PLAIN, 14));
        g.drawString("Dialog", 10, 45);
        g.setFont(new Font("Monospaced", Font.PLAIN, 14));
        g.drawString("Monospaced", 10, 60);
    }
}
