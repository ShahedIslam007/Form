
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
import javax.swing.JTextField;

public class Information extends JFrame
{
    private JLabel userLabel,passLabel,label;
    private JTextField tf;
    private JButton loginButton,clearButton;
    private Container c;
    private Font f;
    private Cursor cu1,cu2;
    private JButton bt;
    private Cursor cu;
    
    Information()
    {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500,100,600,500);
        setTitle("Student data Entry");
        setResizable(true);
        ChangeIcon();
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLUE);
        
        f = new Font("Arial",Font.BOLD,18);
        
        userLabel = new JLabel("YourName: ");
        userLabel.setBounds(50,50,150,50);
        userLabel.setFont(f);
        c.add(userLabel);
        userLabel.setForeground(Color.yellow);
        
        tf = new JTextField();
        tf.setFont(f);
        tf.setBounds(170,50,200,50);
        c.add(tf);
        tf.setForeground(Color.BLACK);
        
        passLabel = new JLabel("YourClass: ");
        passLabel.setBounds(50,150,150,50);
        passLabel.setFont(f);
        c.add(passLabel);
        passLabel.setForeground(Color.yellow);
        
        tf = new JTextField();
        tf.setFont(f);
        tf.setBounds(170,150,200,50);
        c.add(tf);
        tf.setForeground(Color.BLACK);
        
        label = new JLabel("School/College: ");
        label.setBounds(10,250,150,50);
        label.setFont(f);
        c.add(label);
        label.setForeground(Color.yellow);
        
        tf = new JTextField();
        tf.setFont(f);
        tf.setBounds(170,250,200,50);
        c.add(tf);
        tf.setForeground(Color.BLACK);
        
        bt = new JButton("Submit");
        bt.setBounds(220,330,80,50);
        c.add(bt);
        bt.setForeground(Color.BLACK);
        cu = new Cursor(Cursor.HAND_CURSOR);
        bt.setCursor(cu);
        
        Handler hand = new Handler();
        bt.addActionListener(hand);
    }
    
     class Handler implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) 
        {
            dispose();
            Gender frame2 = new Gender(); 
            dispose();
        }
    }
     
    public final void ChangeIcon()
    {
        ImageIcon icon = new ImageIcon(getClass().getResource("image.png"));
        this.setIconImage(icon.getImage());
    }
    
    public static void main(String[] args)
    {
        Information f = new Information();
    }
}
