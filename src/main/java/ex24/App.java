package ex24;
import java.util.Scanner;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        App example24 = new App();
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the two strings and I'll tell you if they are anagrams." );
        System.out.println("Enter the first string: " );
        String s1 = s.nextLine();
        System.out.println("Enter the second string: " );
        String s2 = s.nextLine();


        boolean result = example24.isAnagram(s1,s2);
        if(result == true){
            System.out.println(s1 + " and " + s2 + " are anagrams.");
        }else
            System.out.println(s1 + " and " + s2 + " are not anagrams.");

    }
    public boolean isAnagram(String one, String two){
        HashMap<Character,Integer> anagram = new HashMap <Character,Integer>();
        if(one.length() != two.length()){
            return false;
        }
        for(int i = 0;i < one.length(); i++ ){
            Character letter = one.charAt(i);
            if(anagram.containsKey(letter)) {
                int count = anagram.get(letter);
                anagram.put(letter, count + 1);
            }else
                anagram.put(letter,1);

        }
        for(int i = 0;i < two.length();i++){
            Character letter = two.charAt(i);
            if(anagram.containsKey(letter)) {
                int count = anagram.get(letter);
                anagram.put(letter, count - 1);


            }else
                return false;

        }
        return true;
    }
}
