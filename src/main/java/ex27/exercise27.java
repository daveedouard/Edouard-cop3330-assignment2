/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Dave Edouard
 */

package ex27;

import java.util.Scanner;

public class exercise27 {

    public static String firstName;
    public static String lastName;
    public static String zipCode;
    public static String employeeId;
    public static Scanner input = new Scanner(System.in);

    public static void readInput(){
        System.out.print("Enter the first name: ");
        firstName = input.nextLine();

        System.out.print("Enter the last name: ");
        lastName = input.nextLine();

        System.out.print("Enter the zip code: ");
        zipCode = input.nextLine();

        System.out.print("Enter the employee ID: ");
        employeeId = input.nextLine();

    }

    public static boolean validateFirstName(){
        if(firstName.length()<2){
            System.out.println("The first name must be at least 2 characters long.");
            return false;
        }
        else{
            return true;
        }
    }

    public static boolean validateLastName(){
        if(lastName.length()<2){
            System.out.println("The last name must be at least 2 characters long.");
            return false;
        }
        else{
            return true;
        }
    }

    public static boolean validateZipCode(){
        if((zipCode.length()!=5) || (!zipCode.matches("[0-9]+"))){
            System.out.println("The zip code must be a 5 digit number.");
            return false;
        }
        else{
            return true;
        }
    }

    public static boolean validateEmployeeId(){
        if(!employeeId.matches("[A-Z]{2}-\\d{4}")){
            System.out.println("The employee ID must be in the format of AA-1234.");
            return false;
        }
        else{
            return true;
        }
    }

    public static void main(String[] args){
        readInput();
        validateFirstName();
        validateLastName();
        validateZipCode();
        validateEmployeeId();
        if(validateFirstName()==true && validateLastName()==true && validateZipCode()==true && validateEmployeeId()==true ){
            System.out.print("There were no errors found.");
        }
    }
}
