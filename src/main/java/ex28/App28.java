package ex28;

import java.util.Scanner;

public class App28 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int Read = 0;
        int sum = 0;

        while (true) {
            if (Read == 5) {
                break;
            }

            System.out.println("Enter a number: ");
            sum = sum + Integer.valueOf(s.nextLine());
            Read = Read + 1;
        }

        System.out.println("The total is " + sum +".");

    }




}
}
