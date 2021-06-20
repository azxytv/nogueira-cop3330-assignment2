package ex34;
import java.util.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Adam Nogueira
 */
public class App34 {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<String>(Arrays.asList("John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"));
        printEmployees(employees);

        Scanner scn = new Scanner(System.in);

        System.out.println();
        System.out.println("Enter an employee name to remove: ");
        String nameToRemove = scn.nextLine();

        employees.remove(nameToRemove);

        System.out.println();
        printEmployees(employees);
    }


    public static void printEmployees(ArrayList<String> employees) {
        System.out.println("There are "+employees.size()+" employees: ");
        for(String emp:employees) {
            System.out.println(emp);
        }
    }
}