
package javaproject;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javaproject.Gender.Handler;
import javax.swing.ComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;


public class ComboBox extends JFrame 
{
    private Container c;
    private JComboBox cb,cb2;
    private String[] subject= {"Bangla","English","Math","ICT","Physics","Chemistry","Biology"};
    private JLabel label;
    private Font fo;
    private JButton bt,bt2;
    private Cursor cu,cu2,cu3;
    private JTextArea ta;
    private JMenuBar menubar;
    private JMenu file;
    private JMenuItem data;
            
    ComboBox()
    {
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(250,100,500,500);
        setTitle("Menu");
        setResizable(true);
        comboBox();
        ChangeIcon();
        Cursor();
        TextArea();
        button();
    }
    
    public void comboBox()
    {
        c = this.getContentPane();
        c.setBackground(Color.BLUE);
        c.setLayout(null);
        
        
        fo = new Font("Oswald",Font.BOLD,18);
        label = new JLabel("Please Select Your Subject that You Want a Tutor");
        label.setBounds(20,50,500,100);
        label.setFont(fo);
        c.add(label);
        label.setForeground(Color.GREEN);
        
        fo = new Font("Oswald",Font.BOLD,18);
        label = new JLabel("Here Your Suggested Teacher details");
        label.setBounds(20,300,500,100);
        label.setFont(fo);
        c.add(label);
        label.setForeground(Color.GREEN);
        
        cb = new JComboBox(subject);
        cb.setBounds(100,120,130,45);
        cb.setSelectedItem("ICT");
       
        c.add(cb);
        cb.setEditable(true);
        cb.setForeground(Color.RED);
        cb.setBackground(Color.WHITE);
        
        bt = new JButton("Show");
        bt.setBounds(100,170,80,30);
        c.add(bt);
        bt.setForeground(Color.BLACK);
        cu = new Cursor(Cursor.HAND_CURSOR);
        bt.setCursor(cu);
        
        System.out.println("Total Subjects= "+cb.getItemCount());
        
        menubar= new JMenuBar();
        this.setJMenuBar(menubar);
        file= new JMenu("File");
        menubar.add(file);
        menubar.setBackground(Color.LIGHT_GRAY);
        data= new JMenuItem("All Informations");
        file.add(data);
        Handler3 hand3 = new Handler3();
        data.addActionListener(hand3);
    }
    
   class Handler3 implements ActionListener
    {
        
        @Override
        public void actionPerformed(ActionEvent ae) 
        {
            if(ae.getSource().equals(data))
            {
                DataBankRead dbr = new DataBankRead();
            }
        }
   }
   
    public void TextArea()
    {
        ta = new JTextArea("Your Suggested Teacher is");
        ta.setBounds(90,230,300,100);
        c.add(ta);
        ta.setBackground(Color.yellow);
        fo = new Font("Oswald",Font.BOLD,18);
        ta.setFont(fo);
        
        Handler hand = new Handler();
        bt.addActionListener(hand);
        
    }
    
       
    class Handler implements ActionListener
    {
        
        @Override
        public void actionPerformed(ActionEvent ae) 
        {
            if(ae.getSource()== bt)
            {
               if(cb.getSelectedItem().equals("Bangla"))
               {
                    TeacherInformation t1 = new TeacherInformation();
                    ta.setText("Teacher Name: "+t1.MaleTeacher4());
               }
               else if(cb.getSelectedItem().equals("English"))
               {
                   TeacherInformation t1 = new TeacherInformation();
                   ta.setText("Teacher Name: "+t1.MaleTeacher2());
               }
               else if(cb.getSelectedItem().equals("Math"))
               {
                   TeacherInformation t1 = new TeacherInformation();
                   ta.setText("Teacher Name: "+t1.MaleTeacher3());
               }
               else if(cb.getSelectedItem().equals("Physics"))
               {
                   TeacherInformation t1 = new TeacherInformation();
                   ta.setText("Teacher Name: "+t1.MaleTeacher5());
               }
               else if(cb.getSelectedItem().equals("Chemistry"))
               {
                   TeacherInformation t1 = new TeacherInformation();
                   ta.setText("Teacher Name: "+t1.MaleTeacher6());
               }
               else if(cb.getSelectedItem().equals("Biology"))
               {
                   TeacherInformation t1 = new TeacherInformation();
                   ta.setText("Teacher Name: "+t1.MaleTeacher7());
               }
               else if(cb.getSelectedItem().equals("ICT"))
               {
                   TeacherInformation t1 = new TeacherInformation();
                   ta.setText("Teacher Name: "+t1.MaleTeacher1());
               }
            }
            
            else
            {
                System.exit(0);
            }
        }
    }
    
    public void button()
    {
        bt2 = new JButton("Detail");
        bt2.setBounds(130,380,80,30);
        c.add(bt2);
        bt2.setForeground(Color.BLACK);
        cu = new Cursor(Cursor.HAND_CURSOR);
        bt2.setCursor(cu);
        
        Handler2 hand1 = new Handler2();
        bt2.addActionListener(hand1);
    }
    
    class Handler2 implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) 
        {
            if(ae.getSource()== bt2)
            {
               if(cb.getSelectedItem().equals("Bangla"))
               {
                    Frame1 f = new Frame1();
               }
                else if(cb.getSelectedItem().equals("English"))
               {
                   Frame2 f = new Frame2();
               }
               else if(cb.getSelectedItem().equals("Math"))
               {
                   Frame3 f = new Frame3();
               }
               else if(cb.getSelectedItem().equals("Physics"))
               {
                   Frame4 f = new Frame4();
               }
               else if(cb.getSelectedItem().equals("Chemistry"))
               {
                   Frame5 f = new Frame5();
               }
               else if(cb.getSelectedItem().equals("Biology"))
               {
                   Frame6 f = new Frame6();
               }
               else if(cb.getSelectedItem().equals("ICT"))
               {
                   Frame7 f = new Frame7();
               }
               
            else
               {
                System.exit(0);
               }
            }
        }
    }
    
    public void Cursor()
   {
    cu = new Cursor(Cursor.HAND_CURSOR);
    bt.setCursor(cu);
    cu2 = new Cursor(Cursor.HAND_CURSOR);
    cb.setCursor(cu2);
    cu3 = new Cursor(Cursor.HAND_CURSOR);
    data.setCursor(cu3);
    file.setCursor(cu3);
   }
     
    public final void ChangeIcon()
    {
        ImageIcon icon = new ImageIcon(getClass().getResource("image.png"));
        this.setIconImage(icon.getImage());
    }
    
    public static void main(String[] args) 
    {
        ComboBox fram = new ComboBox();
    }
}
