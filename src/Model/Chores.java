package Model;

import java.util.*;

public class Chores extends Task {
    private ArrayList<ChecklistItem> checklist;
    private ChecklistItem dueDate;
    private ArrayList<String> reminders;
    private boolean dailyDone;
    private Frequency frequency;


    public Chores(int id, String name, byte difficulty, ArrayList<String> tags, ArrayList<String> comments, ArrayList<ChecklistItem> checklist, ChecklistItem dueDate, ArrayList<String> reminders, boolean dailyDone, Frequency frequency) {
        super(id, name, difficulty, tags, comments);
        this.checklist = checklist;
        this.dueDate = dueDate;
        this.reminders = reminders;
        this.dailyDone = dailyDone;
        this.frequency = frequency;
    }

    public ArrayList<ChecklistItem> getChecklist() {
        return checklist;
    }

    public void setChecklist(ArrayList<ChecklistItem> checklist) {
        this.checklist = checklist;
    }

    public ChecklistItem getDueDate() {
        return dueDate;
    }

    public void setDueDate(ChecklistItem dueDate) {
        this.dueDate = dueDate;
    }

    public ArrayList<String> getReminders() {
        return reminders;
    }

    public void setReminders(ArrayList<String> reminders) {
        this.reminders = reminders;
    }

    public boolean isDailyDone() {
        return dailyDone;
    }

    public void setDailyDone(boolean dailyDone) {
        this.dailyDone = dailyDone;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }
}
