/*
Problem 4: Array Statistics
Problem Statement
Write a Java program to read 10 integers into an array and perform the following operations:
 Find Maximum Element
 Find Minimum Element
 Calculate Average
 Count Even Numbers
 Count Odd Numbers
 Search for a given number
 Display the array in reverse order
Concepts Covered
 Arrays
 Loops
 if statement
 Searching
 Variables
*/


import java.io.*;

public class Ques4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] marks = new int[10];
        System.out.println("Enter the elements of arrays:-");
        for(int i = 0 ; i < 10 ; i++){
            marks[i] = Integer.parseInt(br.readLine());
        }


        int max = marks[0];
        for(int i = 1 ; i < 10 ; i++){
        if(max < marks[i]){
            max = marks[i];
        }
        }
        System.out.println("The maximum element is:"+max);

        int min = marks[0];
        for(int j = 1 ; j <10 ; j++){
            if(min > marks[j]){
                min = marks[j];
            }
        }
        System.out.println("The minimum element is:"+min);

        float avg = 0f;
        for(int k = 0 ; k < 10 ; k++) {
            avg = avg + marks[k];
        }
        System.out.println("The average of all elements is:"+avg/10.0);

        int count = 0;
        for(int k = 0 ; k < 10 ; k++){
            if(marks[k]%2 == 0){
                count = count + 1;
            }
        }
        System.out.println("The total even elements are:"+count);

        int count2 = 0;
        for(int k = 0 ; k < 10 ; k++){
            if(marks[k]%2 != 0) {
                count2 = count2 + 1;
            }
        }
        System.out.println("The total odd elements are:"+count2);

        int myNum = 12;
        for(int k = 0 ; k<10 ; k++){
            if(marks[k] == myNum){
                System.out.println("Your number is on index: "+k);
            }
        }

        System.out.println("Your array in reverse order is: ");
        for(int k = 9 ; k >= 0 ; k--){
            System.out.print(marks[k]+" ");
        }
    }
}