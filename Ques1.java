/*
Problem 1: Student Grade Calculator
Problem Statement
Write a Java program to accept the marks of five subjects (out of 100 each) using BufferedReader.
Calculate:
 Total Marks
 Percentage
 Grade according to the following criteria:
Percentage Grade
≥ 90 A+
80–89 A
70–79 B
60–69 C
50–59 D
< 50 Fail
Also display whether the student has passed or failed.
Concepts Covered
 Variables
 Data Types
 Arithmetic Operators
 if-else ladder
 BufferedReader
 Type Casting
*/

import java.io.*;

public class Ques1{
      public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      System.out.println("Enter the marks of 5 subjects:-");   

      int marks1 = Integer.parseInt(br.readLine());
      int marks2 = Integer.parseInt(br.readLine());
      int marks3 = Integer.parseInt(br.readLine());
      int marks4 = Integer.parseInt(br.readLine());
      int marks5 = Integer.parseInt(br.readLine());

      int total = marks1 +  marks2 +  marks3 +  marks4 +  marks5;
      System.out.println("The total marks are :- " + total);
    
      float percent = (total/500.0f) * 100;
      System.out.println("The percentage is : "+percent+"%");
      
      String grade = "A+";
      if(percent>=90){
      grade = "A+";
      }
      else if(percent>=80){
      grade = "A";
      }
      else if(percent>=70){
      grade = "B";
      }
      else if(percent>=60){
      grade = "C";
      }
      else if(percent>=50){
      grade = "D";
      }
      else if(percent<50){
      grade = "F";
      }

      if(grade == "F"){
      System.out.println("You have failed.");
      }

      else{
      System.out.println("You have passed your grade is:"+grade);
      }

      }
}
