
package javaproject;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Welcome extends JFrame
{
    private Container c;
    private JLabel label;
    private Font fo;
    private JButton bt;
    private Cursor cu;
    Welcome()
    {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400,50,600,600);
        setTitle("Welcome");
        ChangeColor();
        ChangeIcon();
        Components();
        label();
        button();
    }
    
     public final void ChangeColor()
    {
        c = this.getContentPane();
        c.setBackground(Color.BLUE);
    }
    
     public void Components()
    {
        ImageIcon icon = new ImageIcon(getClass().getResource("image2.jpeg"));
        label = new JLabel(icon);
        label.setBounds(170,200,icon.getIconWidth(),icon.getIconHeight());
        c.add(label);
        label.setForeground(Color.PINK);
    }
     
    public void label()
    {
        fo = new Font("Oswald",Font.BOLD,60);
        label = new JLabel("Welcome!!!");
        label.setBounds(120,55,500,100);
        label.setFont(fo);
        c.add(label);
        label.setForeground(Color.GREEN);
    }
    
    public final void ChangeIcon()
    {
        ImageIcon icon = new ImageIcon(getClass().getResource("image.png"));
        this.setIconImage(icon.getImage());
    }
    
    public void button()
    {
        bt = new JButton("Next");
        bt.setBounds(450,480,80,30);
        c.add(bt);
        bt.setForeground(Color.BLACK);
        cu = new Cursor(Cursor.HAND_CURSOR);
        bt.setCursor(cu);
        
        Handler hand1 = new Handler();
        bt.addActionListener(hand1);
    }
    
    class Handler implements ActionListener
    {
        
        @Override
        public void actionPerformed(ActionEvent ae) 
        {
            dispose();
            Login fa = new Login();
        }
    }
    
    public static void main(String[] args) 
    {
        Welcome LI = new Welcome();
    }
}
