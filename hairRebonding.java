import java.io.*;

public class hairRebonding extends Saloon
{
   private String genderRebonding;
   private String hairRebondingType;
   
   public hairRebonding(String n, String d, boolean m, String id, String no, String ic, String gr, String hrt) //Normal constructor
   {
      super(n, d, m, id, no, ic);
      genderRebonding = gr;
      hairRebondingType = hrt;
   }
   
   public void sethairRebonding(String gr, String hrt) //Setter
   {
      genderRebonding = gr;
      hairRebondingType = hrt;
   }
   
   public String getGenderRebonding() {return genderRebonding;} //Getter
   public String getHairRebondingType() {return hairRebondingType;}
   
   public double calPrice() //Processor
   {
      double price = 0.0;
      
      if(genderRebonding.equals("M"))
      {
           if(hairRebondingType.equalsIgnoreCase("S"))
           {
               price = 50.00;
           }
           
           else if(hairRebondingType.equalsIgnoreCase("Me"))
           {
               price = 70.00;
           }
           
           else if(hairRebondingType.equalsIgnoreCase("L"))
           {
               price = 90.00;
           }
      }
      
      else if(genderRebonding.equalsIgnoreCase("F"))
      {
         if(hairRebondingType.equalsIgnoreCase("S"))
         {
            price = 70.00;
         }
         
         else if(hairRebondingType.equalsIgnoreCase("Me"))
         {
            price = 120.00;
         }
         
         else if(hairRebondingType.equalsIgnoreCase("L"))
         {
            price = 150.00;
         }
      }
      return price;
   }
   
   public String toString() //Printer
   {
      return 
      super.toString() + 
      "\nGender (Hair Rebonding): " + genderRebonding +
      "\nType of Hair (Hair Rebonding): " + hairRebondingType;
   } 
}

