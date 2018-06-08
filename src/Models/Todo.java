package Models;

import java.util.ArrayList;
import java.util.Date;

public class Todo extends Task{
    private ArrayList<SubItem> todoChecklist;
    private DueDate dueDate;
    private ArrayList<Date> reminders;
    private boolean isTodoDone;
    private Frequency frequency;

    public Todo(int id, String name, Difficulty difficulty, ArrayList<String> tags, String description, ArrayList<SubItem> todoChecklist, DueDate dueDate, ArrayList<Date> reminders, boolean isTodoDone, Frequency frequency) {
        super(id, name, difficulty, tags, description);
        this.todoChecklist = todoChecklist;
        this.dueDate = dueDate;
        this.reminders = reminders;
        this.isTodoDone = isTodoDone;
        this.frequency = frequency;
    }

    public ArrayList<SubItem> getTodoChecklist() {
        return todoChecklist;
    }

    public void setTodoChecklist(ArrayList<SubItem> todoChecklist) {
        this.todoChecklist = todoChecklist;
    }

    public DueDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(DueDate dueDate) {
        this.dueDate = dueDate;
    }

    public ArrayList<Date> getReminders() {
        return reminders;
    }

    public void setReminders(ArrayList<Date> reminders) {
        this.reminders = reminders;
    }

    public boolean isTodoDone() {
        return isTodoDone;
    }

    public void setTodoDone(boolean todoDone) {
        isTodoDone = todoDone;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    public void addSubItem(SubItem subItem){
        todoChecklist.add(subItem);
    }
    public void addSubItem(boolean isItemDone, String itemName){
        SubItem subItem = new SubItem(isItemDone, itemName);
        todoChecklist.add(subItem);
    }

    public SubItem getSubItem(SubItem itemRetornado){
        for (SubItem i: todoChecklist) {
            if (i.equals(itemRetornado)){
                return i;
            }
        }
        return null;
    }
    public SubItem getSubItem(boolean isItemDone, String itemName){
        for (SubItem i: todoChecklist) {
            if (i.getItemName().equals(itemName) && i.isDone() == isItemDone){
                return i;
            }
        }
        return null;
    }

    public void removeSubItem(SubItem subItem){
        todoChecklist.remove(subItem);
    }
    public boolean removeSubItem(boolean isItemDone, String itemName){
        for (SubItem i: todoChecklist) {
            if (i.getItemName().equals(itemName) && i.isDone() == isItemDone){
                todoChecklist.remove(i);
                return true;
            }
        }
        return false;
    }
}
