import java.util.ArrayList;
public class Diary{
    ArrayList<Entry> entries = new ArrayList<>();
    public boolean IsEmpty(){
        if(entries.isEmpty()){
            return true;
        }
        return false;
    }
    public void addEntry(){

    }
    public void removeEntry(){

    }
    public void listEntrys(){
        for(Entry entry: entries){
            System.out.println(entry.getTitle());
        }
    }
    public void OpenEntry(){

    }
    public void closeEntry(){

    }
    public void save(){

    }

}
