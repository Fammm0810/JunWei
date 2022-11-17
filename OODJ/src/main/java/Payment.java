
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class Payment extends RentInfo{
    private double TotalPrice;
    public Payment(String CustID, String CustName, String CarID, String CarBrand, String CarModel, String FromDate, String ToDate, long days, int Price) 
    {
        super(CustID, CustName, CarID, CarBrand, CarModel, FromDate, ToDate, days, Price);

    }
    
    
   
    
    public void totaPrice(long days, int Price){
        TotalPrice = days * Price;
    }

    public void setTotalPrice(double TotalPrice) {
        this.TotalPrice = TotalPrice;
    }

    public double getTotalPrice() {
        return TotalPrice;
    }
    

   
    
    public void WriteIntoFile(String CustID, String CustName,String CarID, String CarBrand, String CarModel, String FromDate, String ToDate, long days, int Price,
                                double TotalPrice){
        File fh = new File("Payment.txt");
        try{
        FileWriter fw = new FileWriter(fh,true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        String CustPayment = CustID + " " + CustName + " " + CarID + " " + CarBrand + " " + CarModel + " " + FromDate + " " + ToDate + " " 
                    + days + " " + Price +" " + TotalPrice + "\n";
        pw.write(CustPayment);
        pw.close();
        }
        catch(IOException Ex)
        {
            
        }
    }
    
}
