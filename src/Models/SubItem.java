package Models;

public class SubItem {
    private boolean isDone;
    private String itemName;

    public SubItem(boolean isDone, String itemName) {
        this.isDone = isDone;
        this.itemName = itemName;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
