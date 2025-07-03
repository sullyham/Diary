import java.util.ArrayList;
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
        Entry entry = entries.get(number + 1);
        entry.getData();
    }
    public void closeEntry(){

    }
    public void save(){

    }

}
