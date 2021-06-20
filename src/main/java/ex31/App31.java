package ex31;
import java.util.*;

public class App31 {
    public static void main (String[] args) throws java.lang.Exception
    {
        int restingHR,age;
        Scanner sc=new Scanner(System.in);
        restingHR = sc.nextInt();
        age = sc.nextInt();

        System.out.println("Resting Pulse: " + restingHR + " Age: " + age);

        int intensity = 55;

        System.out.println("Intensity | Rate ");
        System.out.println("------------------------");

        while(intensity<96){
            int Target = (((220 - age) - restingHR) * intensity/100) + restingHR;
            System.out.println(intensity+"% | "+ Target +"bpm");
            intensity+=5;
        }
    }
}

