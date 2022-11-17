
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class Customer {
    private String CustName;
    private String CustMail;
    private String CustContact;
    private String CustPassword;
    private String CustAddress;
    public Customer(String A, String B, String C, String D, String E)
    {CustName = A; CustMail = B; CustContact = C; CustPassword = D; CustAddress = E;}
    
    
    public void Writefile()
    {//Add the coding to write to a file - UserData 
        File fh = new File("CarRentalCust.txt");
        try{
        FileWriter fw = new FileWriter(fh,true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        String CustInfo = CustName + ";" + CustMail + ";" + CustContact + ";" + CustPassword + ";" + CustAddress + "\n";
        pw.write(CustInfo);
        pw.close();
        }
        catch(IOException Ex)
        {
            
        }
}

}
