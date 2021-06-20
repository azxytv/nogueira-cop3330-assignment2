package ex26;
import ex24.App;

import java.util.*;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Adam Nogueira
 */
public class App26 {
    public static void main(String[] args) {
        App26 example25 = new App26();

        Scanner in = new Scanner(System.in);
        System.out.print("What is your balance? ");
        double balance = Double.parseDouble(in.next());
        System.out.println("What is the APR on the card (as a percent)? ");
        double dailyRate = Double.parseDouble(in.next()) / 36500;
        System.out.println("What is the monthly payment you can make? ");
        double MP = Double.parseDouble(in.next());
        double totalMonths = App26.PaymentCalculator.calculateMonthsUntilPaidOff(balance, dailyRate, MP);

        System.out.println("It will take you " + Math.round(totalMonths) + " months to pay off this card.");
    }

    public static class PaymentCalculator {
        public static double calculateMonthsUntilPaidOff(double bal, double dr, double months) {
            double j = dr;
            double temp = bal/months;
            double temp1 = Math.pow((1+j),30);
            double temp2 = Math.log(1+j);
            double temp3 = Math.log(1 + temp *(1 - temp1));

            int totalMonths = (int)Math.ceil((-1 * temp3) / (temp2*30));
            return totalMonths;
        }

    }
}



