package Model;

public class ChecklistItem {
    private boolean done;
    private String name;

    public ChecklistItem(boolean done, String name) {
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
