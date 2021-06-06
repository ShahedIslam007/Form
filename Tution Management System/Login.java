
package javaproject;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame
{
    private JLabel userLabel,passLabel;
    private JTextField tf;
    private JPasswordField pf;
    private JButton loginButton,clearButton;
    private Container c;
    private Font f;
    private Cursor cu1,cu2;
    
    Login()
    {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500,100,600,500);
        setTitle("Login");
        setResizable(true);
        ChangeIcon();
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLUE);
        
        f = new Font("Arial",Font.BOLD,18);
        
        userLabel = new JLabel("UserName: ");
        userLabel.setBounds(50,50,150,50);
        userLabel.setFont(f);
        c.add(userLabel);
        userLabel.setForeground(Color.yellow);
        
        tf = new JTextField();
        tf.setFont(f);
        tf.setBounds(170,50,200,50);
        c.add(tf);
        tf.setForeground(Color.BLACK);
        
        passLabel = new JLabel("Password: ");
        passLabel.setBounds(50,120,150,50);
        passLabel.setFont(f);
        c.add(passLabel);
        passLabel.setForeground(Color.yellow);
        
        pf = new JPasswordField();
        pf.setFont(f);
        pf.setBounds(170,120,200,50);
        pf.setEchoChar('*');
        c.add(pf);
        pf.setForeground(Color.BLACK);
        
        loginButton = new JButton("Login");
        loginButton.setFont(f);
        loginButton.setBounds(170,190,90,50);
        cu1 = new Cursor(Cursor.HAND_CURSOR);
        loginButton.setCursor(cu1);
        c.add(loginButton);
        loginButton.setForeground(Color.BLACK);
        
        clearButton = new JButton("Clear");
        clearButton.setFont(f);
        clearButton.setBounds(280,190,90,50);
        cu2 = new Cursor(Cursor.HAND_CURSOR);
        clearButton.setCursor(cu2);
        c.add(clearButton);
        clearButton.setForeground(Color.BLACK);
        
        clearButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                tf.setText(null);
                pf.setText(null);
            }
        });
        
        loginButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
               String userName = tf.getText();
               String password = pf.getText();
               
               if(userName.equals("student") && password.equals("1234"))
               {
                   JOptionPane.showMessageDialog(null,"You are Successfully Login");
                   dispose();
                   Information frame1 = new Information();
               }
               else
               {
                    JOptionPane.showMessageDialog(null,"Invalid Username or Password");
               }
            }
        });
    }
    
    public final void ChangeIcon()
    {
        ImageIcon icon = new ImageIcon(getClass().getResource("image.png"));
        this.setIconImage(icon.getImage());
    }  
    
    public static void main(String[] args)
    {
        Login log = new Login();
    }
}
