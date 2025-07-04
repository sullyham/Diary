import java.util.ArrayList;
import java.util.Scanner;

public class Diary{
    ArrayList<Entry> entries = new ArrayList<>();
    public boolean IsEmpty(){
        if(entries.isEmpty()){
            return true;
        }
        return false;
    }
    public void addEntry(String title){
         Entry entry = new Entry();
         entry.setTitle(title);
         entry.setTimestamp();
         entries.add(entry);

    }
    public void removeEntry(){

    }
    public void listEntrys(){
        System.out.println("These are your current entries");
        int i = 0;
        for(Entry entry: entries){
            System.out.println(++i + ") " + entry.getTitle());
        }
    }
    public void OpenEntry(int number){
        //So we need it to loop until the user stops writing
        Scanner scnr = new Scanner(System.in);
        Boolean exit = false;
        Entry entry = entries.get(number -1);
        System.out.print(entry.getData());
        String text = "";
        text = scnr.nextLine();
        entry.setData(text);
    }
    public void closeEntry(){

    }
    public void save(){

    }

}
