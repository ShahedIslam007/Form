
package javaproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class DataBankRead 
{
    DataBankRead()
    {
        try
        {
            File file = new File("E:/JavaProject/src/javaproject/Teacher.txt");
            Scanner scanner = new Scanner(file);
        
            while(scanner.hasNextLine())
             {
                System.out.println(scanner.nextLine());
             }
        }
        
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws FileNotFoundException 
    {
        DataBankRead frame = new DataBankRead();
    }
}
