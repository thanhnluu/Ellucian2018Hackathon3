import java.util.ArrayList;
import java.util.Date;

public class Student {

    private String name;
    private Schedule schedule;

    public Student(String n, Schedule s){
        name = n;
        schedule = s;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Schedule getSchedule() {
        return schedule;
    }
}
