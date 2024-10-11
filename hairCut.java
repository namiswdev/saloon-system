import java.io.*;

public class hairCut extends Saloon
{
   private int category;
   double price;

   public hairCut(String n, String d, boolean m, String id, String no, String ic, int cat) //Normal constructor
   {
      super(n, d, m, id, no, ic);
      category = cat;
   }
   
   public void setHairCut(int cat) //Setter
   { 
      category = cat; 
   }
   
   public int getCategory() {return category;} //Getter
   
   public double calPrice() //Processor
   {
      if(category == 1)
      {
         price = 8.00;
      }
      
      else if(category == 2)
      {
         price = 10.00;
      }
      
      else if(category == 3)
      {
         price = 15.00;
      }
      
      else if(category == 4)
      {
         price = 25.00;
      }
      return price;
   }
   
   public String toString() //Printer
   {
      return 
      super.toString() + 
      "\nCategory (Hair Cut): " + category;
   }
}
