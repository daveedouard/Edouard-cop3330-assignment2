/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dave Edouard
 */

package ex29;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exercise29 {
    public static Scanner input = new Scanner(System.in);
    public static int rate, years;

    public static int integerInput(){
        int inputCheck;
        while(true){
            try{
                inputCheck = input.nextInt();
                if(inputCheck==0){
                    System.out.print("Sorry. That's not a valid input.\nWhat is the rate of return? ");
                    continue;
                }
                return inputCheck;
            }
            catch(InputMismatchException ex){
                input.next();
                System.out.print("Sorry. That's not a valid input.\nWhat is the rate of return? ");
                continue;
            }
        }
    }

    public static void main(String[] args){
        System.out.print("What is the rate of return? ");

        rate = integerInput();
        years = 72/rate;

        System.out.print("It will take "+years+" years to double your initial investment.");
    }

}
