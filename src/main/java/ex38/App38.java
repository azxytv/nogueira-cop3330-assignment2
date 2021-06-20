package ex38;
import java.util.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Adam Nogueira
 */
public class App38 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a list of numbers, separated by spaces: ");
        String data = scn.nextLine();
        String list[] = data.split(" ");
        Integer evenList[] = filterEvenNumbers(list);

        System.out.print("The even numbers are ");
        for(int i=0; i<evenList.length; i++){
            if(i < evenList.length-1){
                System.out.print(evenList[i] + " ");
            }
            else
            {
                System.out.print(evenList[i] + ".");
            }
        }
    }
    public static Integer[] filterEvenNumbers(String list[]) {
        ArrayList<Integer> newList = new ArrayList<>();
        for(int i=0; i<list.length; i++){
            int num = Integer.parseInt(list[i]);
            if(num % 2 == 0){
                newList.add(num);
            }
        }
        Integer[] arr = new Integer[newList.size()];
        arr = newList.toArray(arr);
        return arr;
    }
}

