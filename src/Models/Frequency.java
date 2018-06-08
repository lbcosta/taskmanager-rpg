package Models;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Frequency {
    private Date startDate;
    private int repeats;
    private ArrayList<Date> reminders;

    public Frequency(Date startDate, int repeats, ArrayList<Date> reminders) {
        this.startDate = startDate;
        this.repeats = repeats;
        this.reminders = reminders;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public int getRepeats() {
        return repeats;
    }

    public void setRepeats(int repeats) {
        this.repeats = repeats;
    }

    public ArrayList<Date> getReminders() {
        return reminders;
    }

    public void setReminders(ArrayList<Date> reminders) {
        this.reminders = reminders;
    }

    public void addReminder(Date reminderAdd){
        reminders.add(reminderAdd);
    }
    public void removeReminder(Date reminderRemoved){
        reminders.remove(reminderRemoved);
    }
}
