package br.edu.eteczl;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
/**
 * Hello world!
 *
 */
public class App extends JFrame 
{
    public static void main( String[] args )
    {
        new App();
    }
    
    public App() {
        setSize (500,500);
        setVisible(true);
    }
    
    public void paint (Graphics g) {
        g.drawRect(50,50,100,25);
        
        g.setColor(Color.red);
        g.drawOval(200,50,50,50);
        
        g.setColor(Color.green);
        g.fillRect(50, 200, 100, 25);
        
        g.setColor(Color.black);
        g.drawString("My String broooooooooo", 200,200);
    }
}
