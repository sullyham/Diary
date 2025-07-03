import java.util.Calendar;
import java.util.Locale;

public class Entry {
   private String title;
    private String data;
    private Calendar calendar = Calendar.getInstance();
    private String month;
    private String timestamp;
    public void setTitle(String title){
        this.title = title;
    }
    public void setTimestamp(){
        month = calendar.getDisplayName(Calendar.MONTH,Calendar.LONG, Locale.getDefault());
        timestamp = month + " " + calendar.get(Calendar.DAY_OF_MONTH) + ", " + (calendar.get(Calendar.YEAR));
    }
    public void setData(String text){
        data = data + text;
    }
    public String getData(){
        return data;
    }
    public String getTitle(){
        return title;
    }
}
