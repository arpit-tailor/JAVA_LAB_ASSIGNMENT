/*
Problem 5: Employee Salary Management System
Problem Statement
Write a Java program that accepts details of N employees (using arrays):
 Employee ID
 Employee Name
 Basic Salary
Calculate:
 DA = 40% of Basic Salary
 HRA = 20% of Basic Salary
 PF = 12% of Basic Salary
 Gross Salary = Basic + DA + HRA
 Net Salary = Gross Salary − PF
Display all employee details in a tabular format and also display:
 Highest Paid Employee
 Lowest Paid Employee
 Average Salary of all employees
Concepts Covered
 Arrays
 Loops
 BufferedReader
 Arithmetic Operations
 String Handling
 Methods
*/


import java.io.*;
public class Ques5 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of employee's:");
        int N = Integer.parseInt(br.readLine());
        int [] id = new int[N];
        String[] name = new String[N];
        int [] salary = new int[N];
        int [] salary2 = new int[N];
        int [] salary3 = new int[N];
        System.out.println("Enter the details of employees:");
        for(int i = 0; i < N; i++){
            System.out.println("Enter ID:");
            id[i] = Integer.parseInt(br.readLine());
            System.out.println("Enter Name:");
            name[i] = br.readLine();
            System.out.println("Enter Salary:");
            salary[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Displaying the details of all Employees:-\n");

        float avg = 0;
        for(int k = 0 ; k < N ; k++){
            System.out.println("Employee ID: " + id[k]);
            System.out.println("Employee Name: " + name[k]);
            System.out.println("Employee Salary: " + salary[k]);
            float DA = 0.4f*salary[k];
            System.out.println("Employee DA: " + DA);
            float HRA = 0.2f*salary[k];
            System.out.println("Employee HRA: " + HRA);
            float PF = 0.12f*salary[k];
            System.out.println("Employee PF: " + PF);
            float gross = DA + HRA + salary[k];
            System.out.println("Employee Gross Salary: " + gross);
            float net = gross - PF;
            System.out.println("Employee Net Salary: " + net);
            avg = avg + net;
            System.out.println("\n\n");
        }

        System.out.println("\n\n\n");
        int max = salary[0];
        String max_name = name[0];
        for(int j = 1 ; j < N ; j++ ){
            if(max < salary[j]){
                max = salary[j];
                max_name = name[j];
            }
        }
        System.out.println("Highest Paid Employee is "+max_name+"\n");

        int min = salary[0];
        String min_name = name[0];
        for(int j = 1 ; j < N ; j++){
            if(min > salary[j]){
                min = salary[j];
                min_name = name[j];
            }
        }
        System.out.println("Lowest Paid Employee is "+min_name+"\n");

        System.out.println("The average Net Salary of all Employees is: "+avg/N);
    }
}

