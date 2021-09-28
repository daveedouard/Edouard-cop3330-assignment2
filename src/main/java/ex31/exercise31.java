/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dave Edouard
 */

package ex31;

import java.util.Scanner;

public class exercise31 {
    public static Scanner input = new Scanner(System.in);
    public static int TargetHeartRate, age, restingHR, intensity=55;

    public static int heartRate(){
        System.out.println("Intensity\t| Rate");
        System.out.println("-----------------------");

        while(intensity <= 95){
            TargetHeartRate=(((220-age)-restingHR)*intensity/100)+restingHR;
            System.out.println(intensity+"%\t\t\t| "+TargetHeartRate+" bpm");
            intensity += 5;
        }
        return 0;
    }

    public static void main(String[] args){
        System.out.print("Resting pulse: ");
        restingHR = input.nextInt();

        System.out.print("Age: ");
        age = input.nextInt();

        heartRate();
    }
}
