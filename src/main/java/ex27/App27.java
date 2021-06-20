package ex27;
import java.util.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Adam Nogueira
 */
public class App27 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String fn = scn.nextLine();
        System.out.print("Enter the last name: ");
        String ln = scn.nextLine();
        System.out.print("Enter the ZIP code: ");
        String zip = scn.nextLine();
        System.out.print("Enter the employee ID: ");
        String eid = scn.nextLine();

        validateInput(fn,ln,eid,zip);

    }

    public static void validateInput(String fName,String lName, String eid,String zip) {
        Boolean flag = true;
        if(!checkFirstNameLength(fName)){
            flag = false;
        }
        if(!checkLastNameLength(lName)){
            flag = false;
        }
        if(!checkEmployeeId(eid)){
            flag = false;
        }
        if(!checkZipCode(zip)){
            flag = false;
        }
        if(flag){
            System.out.println("There were no errors found.");
        }
    }

    public static boolean checkFirstNameLength(String n) {
        Boolean flag = true;
        if (n.length() == 0) {
            System.out.println("The first name must be filled in. ");
            flag = false;
        }

        if (n.length() < 2) {
            System.out.println("The first name must be at least 2 characters long.");
            flag = false;
        }
        return flag;
    }

    public static boolean checkLastNameLength(String n) {
        Boolean flag = true;

        if (n.length() < 2) {
            System.out.println("The last name must be at least 2 characters long.");
            flag = false;
        }
        if (n.length() == 0) {
            System.out.println("The last name must be filled in. ");
            flag = false;
        }
        return flag;
    }

    public static boolean checkEmployeeId(String n) {
        Boolean flag = true;
        if (n.length() != 7) {
            flag = false;
        }else if (n.charAt(0) > 90 && n.charAt(0) < 65) {
            flag = false;
        }
        else if (n.charAt(1) > 90 && n.charAt(1) < 65) {
            flag = false;
        } else if (n.charAt(2) != '-') {
            flag = false;
        } else if (!Character.isDigit(n.charAt(3))) {
            flag = false;
        } else if (!Character.isDigit(n.charAt(4))) {
            flag = false;
        } else if (!Character.isDigit(n.charAt(5))) {
            flag = false;
        } else if (!Character.isDigit(n.charAt(6))) {
            flag = false;
        }
        if(flag)
            return true;
        else {
            System.out.println("The employee ID must be in the format of AA-1234.");
            return false;
        }

    }
    public static boolean checkZipCode(String zip){
        Boolean flag = true;
        if(!Character.isDigit(zip.charAt(0))){
            flag = false;
        } if(!Character.isDigit(zip.charAt(1))) {
            flag = false;
        } if(!Character.isDigit(zip.charAt(2))) {
            flag = false;
        } if(!Character.isDigit(zip.charAt(3))) {
            flag = false;
        } if(!Character.isDigit(zip.charAt(4))) {
            flag = false;
        }
        if(!flag){
            System.out.print("The zip code must be a 5 digit number.");
        }

        return true;
    }
}