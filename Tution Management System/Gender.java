
package javaproject;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;


public class Gender extends JFrame
{
    private Container c;
    private JLabel label;
    private JRadioButton rb1,rb2;
    private Font l,l2,l3,f;
    private Cursor cu,cu2;
    private ButtonGroup grp;
    private JTextArea ta;
    Gender()
    {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(700,100,600,500);
        setTitle("Student Gender");
        setResizable(true);
        ChangeIcon();
        Button();
        Cursor();
        TextArea();
    }
    
    public void Button()
    {
        c = this.getContentPane();
        c.setBackground(Color.BLUE);
        c.setLayout(null);
        
        f = new Font("Oswald",Font.BOLD,18);
        label = new JLabel("Please Enter Your Gender");
        label.setBounds(90,90,300,100);
        label.setFont(f);
        c.add(label);
        label.setForeground(Color.GREEN);
        
        grp = new ButtonGroup();
        
        rb1 = new JRadioButton("Male");
        rb1.setBounds(90,150,100,70);
        l = new Font("Oswald",Font.BOLD,18);
        rb1.setFont(l);
        c.add(rb1);
        rb1.setBackground(Color.BLUE);
        rb1.setForeground(Color.RED);
        
        
        rb2 = new JRadioButton("Femaale");
        rb2.setBounds(170,150,100,70);
        l2 = new Font("Oswald",Font.BOLD,18);
        rb2.setFont(l2);
        c.add(rb2);
        rb2.setBackground(Color.BLUE);
        rb2.setForeground(Color.RED);
        
        grp.add(rb1);
        grp.add(rb2); 
        
    }
    
    public void TextArea()
    {
        ta = new JTextArea();
        ta.setBounds(90,250,300,100);
        c.add(ta);
        ta.setBackground(Color.yellow);
        l3 = new Font("Oswald",Font.BOLD,18);
        ta.setFont(l3);
        
        Handler hand = new Handler();
        rb1.addActionListener(hand);
        rb2.addActionListener(hand);
    }
    
    class Handler implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) 
        {
               if(ae.getSource()==rb1)
            {
               ta.setText("You Have Selected Male \n\n Thank You For Selecting!!");
               ComboBox cb = new ComboBox();
            }
            else
            {
                ta.setText("You Have Selected Female \n\n Thank You For Selecting!!");
                ComboBox2 cb = new ComboBox2();
            }
          
        }
        
    }
    public void Cursor()
   {
    cu = new Cursor(Cursor.HAND_CURSOR);
    rb1.setCursor(cu);
    cu2 = new Cursor(Cursor.HAND_CURSOR);
    rb2.setCursor(cu2);
   }
    
    public final void ChangeIcon()
    {
        ImageIcon icon = new ImageIcon(getClass().getResource("image.png"));
        this.setIconImage(icon.getImage());
    }
    
    public static void main(String[] args) 
    {
        Gender frame2 = new Gender(); 
    }
}
