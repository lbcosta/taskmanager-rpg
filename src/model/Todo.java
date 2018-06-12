package model;

import java.util.Date;

public class Todo extends Task {
    private boolean todoDone;
    private Date dueDate;
    private int avatarId;

    public Todo() {
    }

    public Todo(boolean todoDone, Date dueDate, int avatarId) {
        this.todoDone = todoDone;
        this.dueDate = dueDate;
        this.avatarId = avatarId;
    }

    public Todo(String name, String difficulty, String description, boolean todoDone, Date dueDate, int avatarId) {
        super(name, difficulty, description);
        this.todoDone = todoDone;
        this.dueDate = dueDate;
        this.avatarId = avatarId;
    }

    public boolean isTodoDone() {
        return todoDone;
    }

    public void setTodoDone(boolean todoDone) {
        this.todoDone = todoDone;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public int getAvatarId() {
        return avatarId;
    }

    public void setAvatarId(int avatarId) {
        this.avatarId = avatarId;
    }
}
