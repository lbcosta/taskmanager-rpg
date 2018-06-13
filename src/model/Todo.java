package model;

import java.util.Date;

public class Todo {

    int id;
    String name;
    String difficulty;
    String description;
    boolean todoDone;
    Date dueDate;
    int avatarId;

    public Todo() {
    }

    public Todo(String name, String difficulty, String description, boolean todoDone, Date dueDate, int avatarId) {
        this.name = name;
        this.difficulty = difficulty;
        this.description = description;
        this.todoDone = todoDone;
        this.dueDate = dueDate;
        this.avatarId = avatarId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
