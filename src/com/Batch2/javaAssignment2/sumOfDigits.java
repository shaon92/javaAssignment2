/* 1. Write a program to sum of digits of a number by taking from user input */

package com.Batch2.javaAssignment2;
import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        int number, digit, sum = 0;
        System.out.println("Enter a number:");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        while (number!=0){
            digit = number % 10;
            sum += digit;
            number/=10;
        }
        System.out.println("Sum of the digits of the given number is: "+sum);
    }
}
