/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dave Edouard
 */

package ex34;

import java.util.ArrayList;
import java.util.Scanner;

public class exercise34 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        ArrayList<String> employees = new ArrayList<>();
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");

        System.out.println("There are "+employees.size()+" employees:\n"+employees.get(0)+"\n"+employees.get(1)+"\n"+employees.get(2)+"\n"+employees.get(3)+"\n"+employees.get(4));
        System.out.print("Enter an employee name to remove: ");
        String nameToRemove = input.nextLine();

        removeName(employees, nameToRemove);

        if employees

    }

    public static ArrayList<String> removeName(ArrayList<String> employed, String name){

        if(employed.contains(name)){
            employed.remove(name);
        }

        return employed;
    }
}
