package model;

public class CheckListItem {
    private int id;
    private boolean done;
    private String name;
    private int dailyId;

    public CheckListItem() {
    }

    public CheckListItem(int id, boolean done, String name, int dailyId) {
        this.id = id;
        this.done = done;
        this.name = name;
        this.dailyId = dailyId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDailyId() {
        return dailyId;
    }

    public void setDailyId(int dailyId) {
        this.dailyId = dailyId;
    }
}
