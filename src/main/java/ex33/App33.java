package ex33;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App33 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        Random r = new Random();
        System.out.print("What is your question?");
        System.out.println("> ");
        String question = n.nextLine();
        String[] random ={"Yes.","No.","Maybe.","Ask again later."};
        int randomNum = r.nextInt(random.length);
        System.out.println(random[randomNum]);

    }
}
