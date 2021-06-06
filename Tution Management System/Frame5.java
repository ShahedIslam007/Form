
package javaproject;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame5 extends JFrame
{
    private Container c;
    private JLabel label;
    private Font fo;
    
    Frame5()
    {
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(500,100,500,400);
        setTitle("Java Frame");
        setResizable(false);
        ChangeIcon();
        ChangeColor();
        Text();
    }
    
     public final void ChangeIcon()
    {
        ImageIcon icon = new ImageIcon(getClass().getResource("image.png"));
        this.setIconImage(icon.getImage());
    }
    
    public final void ChangeColor()
    {
        c = this.getContentPane();
        c.setBackground(Color.BLUE);
    }
    
    public void Text()
    {
        fo = new Font("Oswald",Font.BOLD,18);
        TeacherInformation t1 = new TeacherInformation();
        label = new JLabel("Teacher Name: "+ t1.MaleTeacher6());
        label.setBounds(20,50,500,100);
        label.setFont(fo);
        c.add(label);
        label.setForeground(Color.GREEN);
        
        fo = new Font("Oswald",Font.BOLD,18);
        label = new JLabel("Teacher Age: 37");
        label.setBounds(20,80,500,100);
        label.setFont(fo);
        c.add(label);
        label.setForeground(Color.GREEN);
        
        fo = new Font("Oswald",Font.BOLD,18);
        label = new JLabel("Teacher Qualification: Hons in Chemistry");
        label.setBounds(20,110,500,100);
        label.setFont(fo);
        c.add(label);
        label.setForeground(Color.GREEN);
    }
    
    public static void main(String[] args) 
    {
        Frame5 frame = new Frame5();   
    }
}
