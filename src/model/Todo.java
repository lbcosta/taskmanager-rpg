package model;

import java.time.LocalDate;
import java.util.*;

public class Todo extends Task {
    private boolean todoDone;
    private LocalDate dueDate;
    private ArrayList<LocalDate> reminders;


    public Todo(String name, String difficulty, String description, boolean todoDone,
                LocalDate dueDate, ArrayList<LocalDate> reminders) {
        super(name, difficulty, description);
        this.todoDone = todoDone;
        this.dueDate = dueDate;
        this.reminders = reminders;
    }

    public Todo (){
    }

    public boolean isTodoDone() {
        return todoDone;
    }

    public void setTodoDone(boolean todoDone) {
        this.todoDone = todoDone;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public ArrayList<LocalDate> getReminders() {
        return reminders;
    }

    public void setReminders(ArrayList<LocalDate> reminders) {
        this.reminders = reminders;
    }
}
