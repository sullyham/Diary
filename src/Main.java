import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();
        System.out.println("Welcome to diary app!");
        Diary diary = new Diary();
        if (diary.IsEmpty()) {
            System.out.println("You do not seem to have any entries, would you like to create one?");
            char response = scnr.next().charAt(0);
            if (response == 'n') {
                System.out.println("Have a nice day!");
            } else {
                System.out.println("What would you like the title of your entry to be?");
                String title = scnr.next();
                diary.addEntry(title);

            }
        }
        diary.listEntrys();
        System.out.println("Which would you like to access?");

    }
}