import java.io.*;

public class WashHair extends Saloon
{
   private String genderWash;
   private String hairWashType;

   public WashHair(String n, String d, boolean m, String id, String no, String ic, String gw, String hwt) //Normal constructor
   {
      super(n, d, m, id, no, ic);
      genderWash = gw;
      hairWashType = hwt;
   }
   
   public void setWashHair(String gw, String hwt) //Setter
   { 
      genderWash = gw; 
      hairWashType = hwt; 
   }
   
   public String getGenderWash() {return genderWash;} //Getter
   public String getHairWashType() {return hairWashType;}
   
   public double calPrice() //processor
   {
      double price = 0.0;
      if(genderWash.equalsIgnoreCase("M"))
      { 
         if(hairWashType.equalsIgnoreCase("S"))
         {
            price = 10.00;
         }
         else if(hairWashType.equalsIgnoreCase("Me"))
         {
           price = 15.00;
         }
         else if(hairWashType.equalsIgnoreCase("L"))
         {
           price = 20.00;
         }
       }
       
       else if(genderWash.equalsIgnoreCase("F"))
       {
         if(hairWashType.equalsIgnoreCase("S"))
         {
            price = 15.00;
         }
         
         else if(hairWashType.equalsIgnoreCase("Me"))
         {
            price = 20.00;
         }
         
         else if(hairWashType.equalsIgnoreCase("L"))
         {
           price = 25.00;
         }
       }
       return price;
   }

   public String toString() //Printer
   {
      return 
      super.toString() +
      "Gender (Hair Wash): " + genderWash +
      "\nType of Hair (Hair Wash): " + hairWashType;
   }
}
