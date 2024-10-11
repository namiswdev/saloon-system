import java.io.*;

public class hairTreatment extends Saloon
{
   private String treatment;

   public hairTreatment(String n, String d, boolean m, String id, String no, String ic, String tr) //Normal constructor
   {
      super(n, d, m, id, no, ic);
      treatment = tr;
   }
   
   public void sethairTreatment(String tr) //Setter
   {
      treatment = tr;
   }
   
   public String getTreatment() {return treatment;} //Getter
   
   public double calPrice() //Processor
   {
      double price = 0.0;
      if(treatment.equalsIgnoreCase("Sc"))
      {
         price = 72.00;
      }
      
      else if(treatment.equalsIgnoreCase("H"))
      {
         price = 55.00;
      }
      
      else if(treatment.equalsIgnoreCase("D"))
      {
         price = 88.00;
      }          
      return price;
   }
   
   public String toString() //Printer
   {
      return 
      super.toString() + 
      "\nType of Treatment: " + treatment;
   }
}
