package payrolldemo;

import java.util.Scanner;

/**
   This program demonstrates a solution to the
   Payroll Class programming challenge.
*/

public class PayrollDemo
{
   public static void main(String[] args)
   {
       
      System.out.println("Correct infomation:");
      createWorker("jolly mugy","12345678 ",14,25);
      
      System.out.println("-----------------");
      
      System.out.println("Invalid Name: ");
      createWorker(" ","12345678",1,6.30);
      
      System.out.println("-----------------");
      
      System.out.println("Invalid Id: ");
      createWorker("jolly mugy "," ",1,6.30);
      
      System.out.println("-----------------");
      
      System.out.println("Invalid HoursWorked");
      createWorker("jolly mugy","12345678",-2,6.30);
      
      System.out.println("-----------------");
      
      System.out.println("Invalid Payrate:");
      createWorker("jolly mugy","12345678 ",1,33.00);
       
       
    
   }
   
   public static void createWorker(String n,String id,int hw,double pr)
   {
       
       Payroll proll;
       
       try
       {
         proll = new Payroll(n,id,pr,hw);
           
         System.out.println(proll);
           
       }
       catch(InvalidNameException e)
       {
           System.out.println(e.getMessage());
       }
       catch(InvalidHoursException e)
       {
           System.out.println(e.getMessage());
       }
       catch(InvalidIDException e)
       {
           System.out.println(e.getMessage());
       }
       catch(InvalidHourlyRateException e)
       {
           System.out.println(e.getMessage());
       }
             
       
   }
   
      
}
      
      
      
      
      
      
      
      
      
        
      



