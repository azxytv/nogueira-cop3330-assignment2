package ex29;

import java.util.Scanner;

public class App29 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        double rate;
        while(true)
        {
            try
            {
                System.out.print("What is the rate of return? ");
                String str = s.next();
                rate = Double.parseDouble(str);
                if(rate == 0)
                    throw new Exception();
                break;
            }
            catch(Exception e)
            {
                System.out.println("Sorry. That's not a valid input.");
            }
        }
        int years = (int)(72/rate);
        System.out.println("It will take "+years+" years to double your initial investment.");
    }
}

