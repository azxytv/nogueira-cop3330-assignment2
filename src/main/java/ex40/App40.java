package ex40;
import java.util.*;

public class App40 {
    public static void main(String[] args) {
        Record[] records = {
                new Record("John", "Johnson", "Manager", new Date(2016, 12, 31)),
                new Record("Tou", "Xiong", "Software Engineer", new Date(2016, 10, 5)),
                new Record("Michaela", "Michaelson", "District Manager", new Date(2015, 12, 19)),
                new Record("Jake", "Jacobson", "Programmer", null),
                new Record("Jacquelyn", "Jockson", "DBA", null),
                new Record("Sally", "Webber", "Web Developer", new Date(2015, 12, 18))
        };
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a search string: ");
        String target = scn.nextLine();
        System.out.println("\nResults:\n");
        System.out.printf("%-20s | %-20s | %-20s\n", "Full Name", "Position", "Separation Date");
        System.out.printf("%-21s|%-22s|%-21s\n", "-".repeat(21), "-".repeat(22), "-".repeat(21));
        for(Record rec : records) {
            String temp;
            if(rec.seperationDate == null) temp = "";
            else  temp = rec.seperationDate.toString();
            if(rec.firstName.contains(target) || rec.lastName.contains(target))
                System.out.printf("%-20s | %-20s | %-20s\n",  rec.firstName + " " +
                        rec.lastName, rec.position, temp);
        }
        scn.close();
    }
}
class Record {
    String firstName;
    String lastName;
    String position;
    Date seperationDate;
    public Record(String firstName, String lastName,
                  String position, Date seperationDate) {


        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.seperationDate = seperationDate;
    }
}






