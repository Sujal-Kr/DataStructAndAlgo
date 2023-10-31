package Vit.Java;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class HouseDrawing extends JFrame  {
    HouseDrawing() {
        setTitle("Home Sweet Home");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        addMouseMotionListener(new MouseAdapter() {
            public void mouseMoved(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                setTitle("cursor is at "+x+ " "+y);
            }
        });
        
    }
    
    
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.PINK);
        g.fillRect(250, 400, 300, 250);
        int x_cord[]={250,400,550};
        int y_cord[]={400,250,400};
        g.setColor(Color.DARK_GRAY);
        g.fillPolygon(x_cord, y_cord, 3);
        g.setColor(Color.gray);
        g.fillRect(350,500,100 ,150);
        g.setColor(Color.RED);
        g.fillRect(280, 480 , 30, 30);
        g.setColor(Color.GREEN);
        g.fillRect(310, 480 , 30, 30);
        g.setColor(Color.BLUE);
        g.fillRect(280, 510 , 30, 30);
        g.setColor(Color.YELLOW);
        g.fillRect(310, 510 , 30, 30);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Pyrus", Font.PLAIN, 30));
        g.drawString("Daddy's Home",50 ,200);
    }
    
    public static void main(String[] args) {
        new HouseDrawing();
    }
}
