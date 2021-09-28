/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dave Edouard
 */

package ex35;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class exercise35 {
    public static Scanner input = new Scanner(System.in);

    public static void enterName(ArrayList<String> namesArray){
        String name;

        while(true){
            System.out.print("Enter a name: ");
            name = input.nextLine();

            if(!name.isEmpty()) {
                namesArray.add(name);
            }
            else{
                break;
            }
        }
    }

    public static String winner(ArrayList<String> namesArray){
        Random random = new Random();
        int randomName = random.nextInt(namesArray.size());

        System.out.print("The winner is... "+namesArray.get(randomName)+".");
        return namesArray.get(randomName);
    }

    public static void main(String[] args){
        ArrayList<String>namesArray = new ArrayList<>();
        enterName(namesArray);
        winner(namesArray);
    }

}
