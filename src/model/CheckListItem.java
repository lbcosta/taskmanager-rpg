package model;

public class CheckListItem {
    private boolean done;
    private String name;

    public CheckListItem(boolean done, String name) {
        this.done = done;
        this.name = name;
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
}