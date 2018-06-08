package Models;

import java.util.Date;

public class DueDate {
    boolean isDone;
    Date dueDate;

    public DueDate(boolean isDone, Date dueDate) {
        this.isDone = isDone;
        this.dueDate = dueDate;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
