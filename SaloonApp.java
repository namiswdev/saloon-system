import java.io.*;
import java.util.*;

public class SaloonApp
{
   public static void main(String[] args)
   {
      try
      {
         FileReader fr = new FileReader("HairCutDisp.txt");
         BufferedReader br = new BufferedReader(fr);
         FileReader fr2 = new FileReader("WashDisp.txt");
         BufferedReader br2 = new BufferedReader(fr2);
         FileReader fr3 = new FileReader("RebondingDisp.txt");
         BufferedReader br3 = new BufferedReader(fr3);
         FileReader fr4 = new FileReader("TreatmentDisp.txt");
         BufferedReader br4 = new BufferedReader(fr4);
         FileWriter fw = new FileWriter("Receipt.txt");
         BufferedWriter bw = new BufferedWriter(fw);
         PrintWriter outStream = new PrintWriter(bw);
  
         Scanner scan = new Scanner(System.in);
       
         System.out.println("Enter Total Data: ");
         int data = scan.nextInt();
       
         int counter = 0, selection = 0,result=0; 
         double totalPrice = 0.0, priceA = 0.0;
         double total1 = 0.0, total2 = 0.0, total3 = 0.0, total4 = 0.0;
       
         Saloon[] s = new Saloon[data];
         
         String memberID=" ";

         outStream.println("        WELCOME TO BAD LAB SALOON!          ");
         outStream.println("          BAD LAB SALOON SDN BHD            ");
         outStream.println("         NO 31 JALAN BUNGA RAYA 9           ");
         outStream.println("         PUSAT BANDAR BUNGA JAYA            ");
         outStream.println("            31700 PERLIS ARAU               ");
         outStream.println("                 MALAYSIA                   ");
         outStream.println("      TEL: 04-5382245 / 012-2345678         ");  

         outStream.println("---------------------------------------------");
         outStream.println("            BAD LAB SALOON RECEIPT           ");
         outStream.println("---------------------------------------------\n");
         
         System.out.println("                WELCOME!                    ");
         System.out.println("      SERVICES THAT WE OFFERED HERE         ");
         System.out.println("CUT HAIR / WASH HAIR / REBONDING / TREATMENT");
         System.out.println("--------------------------------------------");
         
         String input=" ",input2=" ",input3=" ",input4=" ";
         String type1=" ",type2=" ";
         double price=0.0;
         while((input=br.readLine()) !=null)
         {
            StringTokenizer st = new StringTokenizer(input,";");
            while(st.hasMoreTokens())
            {
               String w = st.nextToken();
               String cat = st.nextToken();
               price = Double.parseDouble(st.nextToken());
               System.out.println(w+"\t\t"+cat+"\t\t"+price);
            }
         }
         
         while((input2=br2.readLine()) !=null)
         {
            StringTokenizer st = new StringTokenizer(input2,";");
            while(st.hasMoreTokens())
            {
               String w = st.nextToken();
               String cat = st.nextToken();
               String type = st.nextToken();
               price = Double.parseDouble(st.nextToken());
               System.out.println(w+"\t\t"+cat+"\t\t"+type+"\t\t"+price);
            }
         } 
         
         while((input3=br3.readLine()) !=null)
         {
            StringTokenizer st = new StringTokenizer(input3,";");
            while(st.hasMoreTokens())
            {
               String w = st.nextToken();
               String cat = st.nextToken();
               String type = st.nextToken();
               price = Double.parseDouble(st.nextToken());
               System.out.println(w+"\t\t"+cat+"\t\t"+type+"\t\t"+price);
            }
         }            
         
         while((input4=br4.readLine()) !=null)
         {
            StringTokenizer st = new StringTokenizer(input4,";");
            while(st.hasMoreTokens())
            {
               String w = st.nextToken();
               String cat = st.nextToken();
               price = Double.parseDouble(st.nextToken());
               System.out.println(w+"\t\t"+cat+"\t\t"+price);
            }
         }                                            
         
               
         System.out.println("--------------------------------------------");
         
         System.out.println("NAME : ");
         String name = scan.next();
         System.out.println("DATE : ");
         String date = scan.next();
         System.out.println("MEMBER (TRUE/FALSE) *required : ");
         boolean member = scan.nextBoolean();
         if(member==true)
         {
            System.out.println("MEMBER ID : ");
            memberID = scan.next();
         }
         System.out.println("CONTACT NUMBER : ");
         String contactNo = scan.next();
         System.out.println("IC NUMBER : ");
         String icNo = scan.next();
         scan.nextLine();
         
         outStream.println("\nCUSTOMER NAME      :"+name);
         outStream.println("\nDATE               :"+date);
         outStream.println("\nMEMBER TRUE/FALSE  :"+member);
         if(member==true)
         {
            outStream.println("\nMEMBER ID          :"+memberID);
         }
         outStream.println("\nCONTACT NUMBER     :"+contactNo);
         outStream.println("\nIC NUMBER          :"+icNo);

         for(int x=0; x < s.length; x++)
         {

            System.out.println("CUT HAIR (PRESS 1 for YES or 2 for SKIP)");
            selection = scan.nextInt();
   
            if(selection == 1)
            {
               for(int j = 0; j<1; j++)
               {
                  
                  System.out.println("CATEGORY(Male Kids - 1/Female Kids - 2/Male Adult - 3/Female Adult - 4) : ");
                  int category = scan.nextInt();
                  scan.nextLine();
            
                  outStream.println("\nCATEGORY           :"+category);       
               
                  s[j] = new hairCut(name, date, member, memberID, contactNo, icNo, category);                     
               }
               
               for(int j = 0; j<1; j++)
               {
                  if(s[j] instanceof hairCut)
                  {               
                     if(s[j].getMember() == true)
                     {
                        priceA = s[j].calPrice() * 0.8;
                        System.out.println("PRICE OF HAIRCUT : RM "+priceA);
                        outStream.println("PRICE OF HAIRCUT   : RM "+priceA);
                        total1 += priceA;
                     }  
                  
                     else if(s[j].getMember() == false)
                     {
                        priceA = s[j].calPrice();
                        System.out.println("PRICE OF HAIRCUT : RM " + priceA);
                        outStream.println("PRICE OF HAIRCUT   : RM " + priceA);
                        total1 += priceA;
                     }
                  }
               }
            }
            
            System.out.println("WASH HAIR (PRESS 1 for YES or 2 for SKIP)");
            selection = scan.nextInt();

            if(selection == 1)
            {
               
               for(int k = 0; k<1; k++)
               {
                  System.out.println("GENDER (Male - M/Female - F) *required : ");
                  String genderWash = scan.next();
                  System.out.println("HAIR TYPE (Short - S/Medium - ME/Long - L) *required : ");
                  String hairWashType = scan.next();      
                  scan.nextLine();
                     
                  outStream.println("\nGENDER             :"+genderWash);
                  outStream.println("\nHAIR TYPE          :"+hairWashType);
                  s[k] = new WashHair(name, date, member, memberID, contactNo, icNo, genderWash, hairWashType);            
                     
               }       
                        
                  
               for(int k = 0; k<1; k++)
               {
                  if(s[k] instanceof WashHair)
                  {
                     if(s[k].getMember() == true)
                     {
                        priceA = s[k].calPrice()*0.8;
                        System.out.println("PRICE OF WASH HAIR : RM "+priceA);
                        outStream.println("PRICE OF WASH HAIR : RM "+priceA);
                        total2 += priceA;
                     }
                  
                     else if(s[k].getMember() == false)
                     {
                        priceA = s[k].calPrice();
                        System.out.println("PRICE OF WASH HAIR : RM "+priceA);
                        outStream.println("PRICE OF WASH HAIR : RM "+priceA);
                        total2 += priceA;
                     }     
                  }
               }
            }
            
            System.out.println("REBONDING (PRESS 1 for YES or 2 for SKIP)");
            selection = scan.nextInt();

            if(selection == 1)
            {
               
               for(int l = 0; l<1; l++)
               {     
                  System.out.println("GENDER (Male - M/Female - F) *required : ");
                  String genderRebonding = scan.next();
                  System.out.println("HAIR TYPE (Short - S/Medium - ME/Long - L) *required : ");
                  String hairRebondingType = scan.next();
                  scan.nextLine();
                  
                  outStream.println("\nGENDER             :"+genderRebonding);
                  outStream.println("\nHAIR TYPE          :"+hairRebondingType);
                     
                  s[l] = new hairRebonding(name, date, member, memberID, contactNo, icNo, genderRebonding, hairRebondingType);
               }
                  
               for(int l = 0; l<1; l++)
               {
                  if(s[l] instanceof hairRebonding)
                  {
                     if(s[l].getMember() == true)
                     {
                        priceA = s[l].calPrice()*0.8;
                        System.out.println("PRICE OF REBONDING : RM "+priceA);
                        outStream.println("PRICE OF REBONDING : RM "+priceA);
                        total3 += priceA;
                     }
                              
                     else if (s[l].getMember() == false)
                     {
                        priceA = s[l].calPrice();
                        System.out.println("PRICE OF REBONDING : RM "+priceA);
                        outStream.println("PRICE OF REBONDING : RM "+priceA);
                        total3 += priceA;
                     }
                  }
               }
            }

            System.out.println("TREATMENT (PRESS 1 for YES or 2 for SKIP)");
            selection = scan.nextInt();
            
            if(selection == 1)
            {
               
               for(int m = 0; m<1; m++)
               {
                                          
                  System.out.print("TREATMENT(Scalp - SC/HairLoss - H/Dandruff - D) : ");
                  String treatment = scan.next();
                  scan.nextLine();
                  
                  outStream.println("\nTREATMENT          :"+treatment);
                     
                  s[m] = new hairTreatment(name, date, member, memberID, contactNo, icNo, treatment);
               }
                  
               for(int m = 0; m<1; m++)
               {
                  if(s[m] instanceof hairTreatment)
                  {
                     if(s[m].getMember())
                     {
                        priceA = s[m].calPrice()*0.8;
                        System.out.println("PRICE OF TREATMENT : RM "+priceA);
                        outStream.println("PRICE OF TREATMENT : RM "+priceA);
                        total4 += priceA;
                     }
                        
                     else
                     {
                        priceA = s[m].calPrice();
                        System.out.println("PRICE OF TREATMENT : RM "+priceA);
                        outStream.println("PRICE OF TREATMENT : RM "+priceA);
                        total4 += priceA; 
                     }
                  }
               }
            }
            
            totalPrice = (total1 + total2 + total3 + total4);
            System.out.println("THE TOTAL PRICE: RM "+totalPrice);
           
         }

         System.out.println("\n");
         outStream.println("THE TOTAL PRICE: RM "+totalPrice);
         outStream.println("---------------------------------------------");
         outStream.println("THANK YOU FOR CHOOSING US! PLEASE COME AGAIN");
         outStream.println("              FOLLOW US ON :-                 ");
         outStream.println("FB: BADLAB SALOON || IG: BDSALOON");
         outStream.println("\n");
         br.close();
         br2.close();
         br3.close();
         br4.close();
         outStream.close();
      }

      catch(FileNotFoundException fnf)
      {  
         System.out.println(fnf.getMessage());
      }
      catch(EOFException eof)
      {
         System.out.println(eof.getMessage());
      }
      catch(IOException io)
      {
         System.out.println(io.getMessage());
      }
   }
} 
   
               
