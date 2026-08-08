/*
Problem 3: Number Analysis Tool
Problem Statement
Write a menu-driven Java program that accepts an integer and performs the following operations:
1. Check whether the number is Prime
2. Check whether it is Palindrome
3. Check whether it is Armstrong
4. Find the Sum of Digits
5. Reverse the Number
6. Exit
The program should continue until the user selects Exit.
Concepts Covered
 switch-case
 while loop
 do-while loop
 Methods
 Modulus Operator
*/


import java.io.*;

class Ques3{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i = 0;
        System.out.println("Enter the number:");
        int num = Integer.parseInt(br.readLine());

        while(i != 6){
            System.out.println("Select an operation:-");
            System.out.println("1. Check whether the number is Prime.");
            System.out.println("2. Check whether it is Palindrome.");
            System.out.println("3. Check whether it is Armstrong.");
            System.out.println("4. Find the sum of digits.");
            System.out.println("5. Reverse the number.");
            System.out.println("6. Exit");

            int op = Integer.parseInt(br.readLine());

            i = op;
            switch(i){

                case 1:{
                    int count1 = 0;
                    for(int j = 2 ; j < num ; j++){
                        if(num%j == 0){
                            count1 = count1 + 1;
                        }
                    }

                    if(count1 > 0){
                        System.out.println("Not Prime");
                    }
                    else{
                        System.out.println("Prime");
                    }

                    break;
                }


                case 2:{
                    int rev = 0 ;
                    int temp = num;
                    while(temp != 0){
                        int digit = temp%10;
                        rev = rev*10 + digit;

                        temp = temp/10;
                    }

                    if(rev == num){
                        System.out.println("Palindrome");
                    }
                    else{
                        System.out.println("Not Palindrome");
                    }

                    break;
                }


                case 3:{
                    int ans = 0;
                    int count2 = 0;
                    int num2 = num;
                    int num3 = num;
                    while(num2 != 0){
                        num2 = num2/10;
                        count2 = count2 + 1;
                    }

                    while(num3 != 0){
                        int digit = num3%10;
                        int value = digit;
                        for(int j = 1 ; j < count2 ; j++){
                            value = value*digit;
                        }
                        ans = ans + value;
                        num3 = num3/10;
                    }

                    if(ans == num){
                        System.out.println("Armstrong Number");
                    }
                    else{
                        System.out.println("Not Armstrong Number");
                    }

                    break;
                }

                case 4:{
                    int ans2 = 0;
                    int temp2 = num;
                    while(temp2 != 0){
                        int digit = temp2%10;
                        ans2 = ans2 + digit;
                        temp2 = temp2/10;
                    }
                    System.out.println("The sum of digits is: "+ans2);

                    break;
                }

                case 5:{
                    int rev2 = 0;
                    int temp3 = num;
                    while(temp3 != 0){
                        int digit = temp3%10;
                        rev2 = rev2*10 + digit;
                        temp3 = temp3/10;
                    }
                    System.out.println("The reverse of the number is: "+rev2);

                    break;
                }
            }
        }

        System.out.println("Program exited!");

    }
}