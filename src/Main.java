import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();
        System.out.println("Welcome to diary app!");
        Diary diary = new Diary();
        Boolean exit = false;
        while (!exit) {
            if (diary.IsEmpty()) {
                System.out.println("You do not seem to have any entries, would you like to create one?");
                char response = scnr.next().charAt(0);
                scnr.nextLine();
                if (response == 'n') {
                    System.out.println("Have a nice day!");
                } else {
                    System.out.println("What would you like the title of your entry to be?");
                    String title = scnr.nextLine();
                    diary.addEntry(title);

                }
            }

                diary.listEntrys();
                System.out.println("Enter exit to leave and new to create a new entry");
                System.out.println("Which entry would you like to access?");
                String responsee = scnr.next();
                scnr.nextLine();
                if(responsee.equals("exit")){
                    break;
                } else if (responsee.equals("new")) {
                    System.out.println("What would you like the title of your entry to be?");
                    String title = scnr.nextLine();
                    diary.addEntry(title);
                } else {
                    diary.OpenEntry(Integer.valueOf(responsee));
                }



        }
        System.out.println("Have a nice day!");
    }
}