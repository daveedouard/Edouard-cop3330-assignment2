/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dave Edouard
 */

package ex28;

import java.util.Scanner;

public class exercise28 {
    public static void main(String[] args) {
        int number;
        int i;
        int total=0;
        Scanner input = new Scanner(System.in);

        for (i=0; i < 5; i++) {
            System.out.print("Enter a number: ");
            number = input.nextInt();

            total += number;
        }
        System.out.print("The total is "+total+".");

    }
}