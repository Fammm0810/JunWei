
import java.io.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Acer
 */
public class RentInfo {

    protected String CustID;
    protected String CustName;
    protected String CarID;
    protected String CarBrand;
    protected String CarModel;
    protected String FromDate;
    protected String ToDate;
    protected long days;
    protected int Price;

    public RentInfo(
            String CustID, String CustName, String CarID, String CarBrand, String CarModel, String FromDate, String ToDate, long days, int Price) {
        this.CustID = CustID;
        this.CustName = CustName;
        this.CarID = CarID;
        this.CarBrand = CarBrand;
        this.CarModel = CarModel;
        this.FromDate = FromDate;
        this.ToDate = ToDate;
        this.days = days;
        this.Price = Price;
    }

    public void IntoFile() {
        File f = new File("RentInfo.txt");

        try 
        {
            FileWriter fw = new FileWriter(f,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            String RentalInfo = CustID + " " + CustName + " " + CarID + " " + CarBrand + " " + CarModel + " " + FromDate + " " + ToDate + " " 
                    + days + " " + Price +"\n";
            pw.write(RentalInfo);
            pw.close();
            
            
        }catch(IOException ex){
            
        }
    }

}
