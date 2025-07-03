import java.util.Calendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Welcome to diary app!");
        Diary diary = new Diary();
        if(diary.IsEmpty()){
            System.out.println("You do not seem to have any entries, would you like to create one?");
        }


    }
}