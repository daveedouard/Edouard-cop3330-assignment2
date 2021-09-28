/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dave Edouard
 */

package ex30;

public class exercise30 {
    public static int num, num1;

    public static void multiplicationSet(){
        for(num=1; num<=12; num++){
            for(int num1=1; num1<=12; num1++) {
                System.out.print((num * num1)+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        multiplicationSet();
    }
}
