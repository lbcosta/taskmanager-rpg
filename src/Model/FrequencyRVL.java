package Model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class FrequencyRVL {
    private String startDate;
    private int repeats;
    private ArrayList<String> reminders;

    public FrequencyRVL(String startDate, int repeats, ArrayList<String> reminders) {
        this.startDate = startDate;
        this.repeats = repeats;
        this.reminders = reminders;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getRepeats() {
        return repeats;
    }

    public void setRepeats(int repeats) {
        this.repeats = repeats;
    }

    public ArrayList<String> getReminders() {
        return reminders;
    }

    public void setReminders(ArrayList<String> reminders) {
        this.reminders = reminders;
    }
}
