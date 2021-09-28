/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dave Edouard
 */

package ex24;

import java.util.Scanner;
import java.util.Arrays;

public class exercise24 {
    public static boolean isAnagram(String first, String second){
        boolean anagram = true;

        if(first.length() != second.length()){
            anagram = false;
        }
        else if(first.length() == second.length()){
            char[] firstArray = first.toCharArray();
            char[] secondArray = second.toCharArray();

            Arrays.sort(firstArray);
            Arrays.sort(secondArray);

            anagram = Arrays.equals(firstArray, secondArray);
        }

        return anagram;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two strings and I'll tell you if they are anagrams:\nEnter the first string: ");
        String first = input.nextLine();
        System.out.print("Enter the second string: ");
        String second = input.nextLine();

        if(isAnagram(first, second)){
            System.out.print(first+" and "+second+" are anagrams");
        }
        else{
            System.out.print(first+" and "+second+" are not anagrams");
        }
    }
}
