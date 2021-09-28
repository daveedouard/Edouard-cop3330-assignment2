/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dave Edouard
 */

package ex26;

import java.util.Scanner;
import static java.lang.Math.log;

public class exercise26 {
    public static double monthsPaidOff(double bal, double apr, double monthlyPay){

        double months = (-(1/30)*log(1+bal/monthlyPay*(1-Math.pow(1+apr/36500,30)))/log(1+apr/36500));

        return months;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("What is your balance? ");
        double bal = input.nextDouble();
        System.out.print("What is the APR on the card (as a percent)? ");
        double apr = input.nextDouble();
        System.out.print("What is the monthly payment you can make? ");
        double monthlyPay = input.nextDouble();

        double months = monthsPaidOff(bal, apr, monthlyPay);
        System.out.print("It will take you "+months+" months to pay off his card.");
    }
}
