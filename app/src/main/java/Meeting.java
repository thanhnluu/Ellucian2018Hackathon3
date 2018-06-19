import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Meeting {
    private ArrayList<Student> members;
    private String name;
    private Date date;
    private Time time;
    private int maxSeats;

    public Meeting(ArrayList<Student> s, String n, Date d, Time t, int m){
        members = s;
        name = n;
        date = d;
        time = t;
        maxSeats = m;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Time getTime() {
        return time;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }

    public ArrayList<Student> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Student> members) {
        this.members = members;
    }
}
