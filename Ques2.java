/*
Problem 2: Electricity Bill Generator
Problem Statement
Write a Java program that calculates the electricity bill based on the following slab rates:
Units Rate (₹/Unit)
First 100 units ₹3
Next 100 units ₹5
Next 300 units ₹7

Above 500 units ₹10
Accept:
 Consumer Name
 Consumer Number
 Units Consumed
Display:
 Consumer Details
 Total Bill Amount
If the bill exceeds ₹5000, apply a 5% surcharge.
Concepts Covered
 Nested if-else
 Arithmetic Operators
 BufferedReader
 Variables
*/


import java.io.*;

class Ques2{
      public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      String name = br.readLine();
      int number = Integer.parseInt(br.readLine());
      int units = Integer.parseInt(br.readLine());  
      
      double amount;  
 
      if(units >= 0 && units<=100){
      amount = units*3;
      }
      
      else if(units>100 && units <= 200){
      amount = 100*3 + (units - 100)*5;
      }     

      else if(units>200 && units<=500){
     amount = 300+500+(units - 200)*7;
      }

      else{
      amount = 300 + 500 + 2100 + (units - 500)*10;
      }

      if(amount>5000){
      amount = amount + (amount*0.05);
      }

      System.out.println("Name of consumer is: "+name);
      System.out.println("Consumer number is: "+number);
      System.out.println("Total bill of consumer is: Rs."+amount);
     }
}
