import java.io.*;

public abstract class Saloon
{
   private String name;
   private String date;
   private boolean member;
   private String memberID;
   private String contactNo;
   private String icNo;
   
   public Saloon() //default constructor
   {
      name = " ";
      date = " ";
      member = true;
      memberID = " ";
      contactNo = " ";
      icNo = " ";
   }
   
   public Saloon(String n, String d, boolean m, String id, String no, String ic) //normal constructor
   {
      name = n;
      date = d;
      member = m;
      memberID = id;
      contactNo = no;
      icNo = ic;
   }
   
   public void setSaloon(String n, String d, boolean m, String id, String no, String ic) //setter
   {
      name = n;
      date = d;
      member = m;
      memberID = id;
      contactNo = no;
      icNo = ic;
   }

   public String getName() {return name;} //getter
   public String getDate() {return date;}
   public boolean getMember() {return member;}
   public String getMemberID() {return memberID;}
   public String getContactNo() {return contactNo;}
   public String getIcNo() {return icNo;}
   
   public abstract double calPrice(); //Abstract method //Processor
   
   public String toString()
   {
    return 
    "Customer Name: " + name +
    "\nDate: " + date + 
    "\nMember ID: " + memberID +
    "\nContact Number: " + contactNo +
    "\nIC Number: " + icNo;
   }
}
