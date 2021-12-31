/* 5.  Create a math quiz program.
* 2 numbers will generate randomly and prompt user to input the summation of 2 numbers.
* If user inputs the correct summation, print "Answer is correct" and user will get 1 point. if user inputs wrong
* summation,  then user will get 0 point. Finally, after 5 iteration, total score will be shown. */

package com.Batch2.javaAssignment2;
import java.util.Random;
import java.util.Scanner;

public class mathQuiz {
    public static void main(String[] args) {
        int iterator, userInput, count=0, randomOne, randomTwo;
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        for(iterator = 1;iterator<=5;iterator++) {
            randomOne = random.nextInt(1000);
            randomTwo = random.nextInt(1000);
            System.out.print("Q."+iterator+" Input the result, "+randomOne+" + "+randomTwo+" = ");
            userInput = input.nextInt();

            if (userInput == (randomOne + randomTwo)){
                count++;
                System.out.println("Answer is correct");
            }
            else {
                System.out.println("Wrong answer");
            }
        }
        System.out.println("\nTotal score obtained: "+count);
    }
}
