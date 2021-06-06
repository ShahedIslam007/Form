
package javaproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;


public class DataBank 
{
    public static void main(String[] args) 
    {
        try
        {
            Formatter formatter = new Formatter("E:/JavaProject/src/javaproject/Teacher.txt");
            formatter.format("%s\r\n","Male Teachers:- ");
            formatter.format("\r\n");
            TeacherInformation t1 = new TeacherInformation();
            
            formatter.format("%s\r\n","Teacher Name: "+t1.MaleTeacher4());
            formatter.format("%s\r\n","Teacher Age: 28");
            formatter.format("%s\r\n","Teacher Qualification: Hons. in Bangla");
            formatter.format("%s\r\n","Teacher Number: 018965723784");
            formatter.format("\r\n");
            
            formatter.format("%s\r\n","Teacher Name: "+t1.MaleTeacher2());
            formatter.format("%s\r\n","Teacher Age: 42");
            formatter.format("%s\r\n","Teacher Qualification: BCom in English");
            formatter.format("%s\r\n","Teacher Number: 01796257418");
            formatter.format("\r\n");
            
            formatter.format("%s\r\n","Teacher Name: "+t1.MaleTeacher3());
            formatter.format("%s\r\n","Teacher Age: 32");
            formatter.format("%s\r\n","Teacher Qualification: Masters in Math");
            formatter.format("%s\r\n","Teacher Number: 01987532148");
            formatter.format("\r\n");
            
            formatter.format("%s\r\n","Teacher Name: "+t1.MaleTeacher5());
            formatter.format("%s\r\n","Teacher Age: 35");
            formatter.format("%s\r\n","Teacher Qualification: Hons in Physics");
            formatter.format("%s\r\n","Teacher Number: 01672493657");
            formatter.format("\r\n");
            
            formatter.format("%s\r\n","Teacher Name: "+t1.MaleTeacher6());
            formatter.format("%s\r\n","Teacher Age: 37");
            formatter.format("%s\r\n","Teacher Qualification: Hons in Chemistry");
            formatter.format("%s\r\n","Teacher Number: 01387994751");
            formatter.format("\r\n");
            
            formatter.format("%s\r\n","Teacher Name: "+t1.MaleTeacher7());
            formatter.format("%s\r\n","Teacher Age: 35");
            formatter.format("%s\r\n","Teacher Qualification: Hons in Biology");
            formatter.format("%s\r\n","Teacher Number: 01788694237");
            formatter.format("\r\n");
            
            formatter.format("%s\r\n","Teacher Name: "+t1.MaleTeacher1());
            formatter.format("%s\r\n","Teacher Age: 23");
            formatter.format("%s\r\n","Teacher Qualification: BSc CSE");
            formatter.format("%s\r\n","Teacher Number: 01821800405");
            formatter.format("\r\n");
            
            formatter.format("%s\r\n","Female Teachers:- ");
            formatter.format("\r\n");
            
            formatter.format("%s\r\n","Teacher Name: "+t1.FemaleTeacher3());
            formatter.format("%s\r\n","Teacher Age: 28");
            formatter.format("%s\r\n","Teacher Qualification: Hons in Bangla");
            formatter.format("%s\r\n","Teacher Number: 01988657103");
            formatter.format("\r\n");
            
            formatter.format("%s\r\n","Teacher Name: "+t1.FemaleTeacher1());
            formatter.format("%s\r\n","Teacher Age: 42");
            formatter.format("%s\r\n","Teacher Qualification: BCom in English");
            formatter.format("%s\r\n","Teacher Number: 0169978417");
            formatter.format("\r\n");
            
            formatter.format("%s\r\n","Teacher Name: "+t1.FemaleTeacher2());
            formatter.format("%s\r\n","Teacher Age: 32");
            formatter.format("%s\r\n","Teacher Qualification: Masters in Math");
            formatter.format("%s\r\n","Teacher Number: 01716957188");
            formatter.format("\r\n");
            
            formatter.format("%s\r\n","Teacher Name: "+t1.FemaleTeacher4());
            formatter.format("%s\r\n","Teacher Age:35");
            formatter.format("%s\r\n","Teacher Qualification: Hons in Physics");
            formatter.format("%s\r\n","Teacher Number: 01836790043");
            formatter.format("\r\n");
            
            formatter.format("%s\r\n","Teacher Name: "+t1.FemaleTeacher5());
            formatter.format("%s\r\n","Teacher Age: 37");
            formatter.format("%s\r\n","Teacher Qualification:Hons in Chemistry");
            formatter.format("%s\r\n","Teacher Number: 01736984244");
            formatter.format("\r\n");
            
            formatter.format("%s\r\n","Teacher Name: "+t1.FemaleTeacher6());
            formatter.format("%s\r\n","Teacher Age: 35");
            formatter.format("%s\r\n","Teacher Qualification: Hons in Biology");
            formatter.format("%s\r\n","Teacher Number: 01961504399");
            formatter.format("\r\n");
            
            formatter.format("%s\r\n","Teacher Name: "+t1.FemaleTeacher7());
            formatter.format("%s\r\n","Teacher Age: 24");
            formatter.format("%s\r\n","Teacher Qualification: BSc in CSE");
            formatter.format("%s\r\n","Teacher Number: 01703804988");
            formatter.format("\r\n");
            
            formatter.close();
            
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        
        
    }
}
