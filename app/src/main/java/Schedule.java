import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Schedule {
    ArrayList<Date> dates;
    ArrayList<Time> time;

    public Schedule(ArrayList<Date> d, ArrayList<Time> t){
        dates = d;
        time = t;
    }

    public ArrayList<Date> getDates() {
        return dates;
    }

    public ArrayList<Time> getTime() {
        return time;
    }

    public void setDates(ArrayList<Date> dates) {
        this.dates = dates;
    }

    public void setTime(ArrayList<Time> time) {
        this.time = time;
    }
}
