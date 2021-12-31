/* 3. Write a program to make a digital tasbih where the program counts each time user press enter until press 0 */

package com.Batch2.javaAssignment2;
import java.util.Scanner;

public class digitalTasbih {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Press 'Enter' to count 'Tasbih'..\nPress '0' and 'Enter' to exit..");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!(input.equals("0"))) {
            if (input.isEmpty()) {
                count++;
                System.out.println(count);
            }
            else {
                System.out.println("Wrong Input");
            }
            if (scanner.hasNextLine()) {
                input = scanner.nextLine();
            }
        }
        System.out.print("Total Tasbih count: " + count);
    }
}