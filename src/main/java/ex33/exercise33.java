/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dave Edouard
 */

package ex33;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class exercise33 {
    public static Scanner input = new Scanner(System.in);

    public static String responses(){
        Random rand = new Random();
        String responseArr[];
        int random= rand.nextInt(4);

        responseArr = new String[4];
        responseArr[0]="Yes";
        responseArr[1]="No";
        responseArr[2]="Maybe";
        responseArr[3]="Ask again later.";

        return responseArr[random];
    }

    public static void main(String[] args){
        System.out.print("What is your question? ");
        String question = input.nextLine();

        System.out.print(responses());
    }
}
