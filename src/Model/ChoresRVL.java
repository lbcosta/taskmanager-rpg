package Model;

import java.util.*;

public class ChoresRVL extends TaskRVL{
    private ArrayList<ChecklistItem> checklist;
    private ChecklistItem dueDate;
    private ArrayList<String> reminders;
    private boolean dailyFeito;

    public ChoresRVL(int id, String nome, byte dificuldade, ArrayList<String> tags, ArrayList<ChecklistItem> checklist, ChecklistItem dueDate, ArrayList<String> reminders, boolean dailyFeito) {
        super(id, nome, dificuldade, tags);
        this.checklist = checklist;
        this.dueDate = dueDate;
        this.reminders = reminders;
        this.dailyFeito = dailyFeito;
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

    public boolean isDailyFeito() {
        return dailyFeito;
    }

    public void setDailyFeito(boolean dailyFeito) {
        this.dailyFeito = dailyFeito;
    }
}
