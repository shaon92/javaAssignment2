/* 2. Write a program to show range of prime numbers from 2 to n using while loop [n is the number by user input] */

package com.Batch2.javaAssignment2;
import java.util.Scanner;

public class primeNumbersFrom2toN {
    public static void main(String[] args) {
        int iterator, count, lastNumber, number = 2;
        System.out.print("Input last number of the range: ");
        Scanner input = new Scanner(System.in);
        lastNumber = input.nextInt();
        System.out.println("List of prime numbers from 2 to "+lastNumber+" are: ");
        while (number <= lastNumber)
        {
            count = 0;
            iterator = 2;
            while (iterator <= (number/2))
            {
                if(number%iterator == 0)
                {
                    count++;
                    break;
                }
                iterator++;
            }
            if(count == 0 && number != 1 )
            {
                System.out.print(number+" ");
            }
            number++;
        }
        System.out.print("\b");
    }
}
