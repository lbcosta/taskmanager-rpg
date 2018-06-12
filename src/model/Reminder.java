package model;

import java.util.Date;

public class Reminder {
    private int id;
    private Date remind;
    private int todoId;

    public Reminder(int id, Date remind, int todoId) {
        this.id = id;
        this.remind = remind;
        this.todoId = todoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getRemind() {
        return remind;
    }

    public void setRemind(Date remind) {
        this.remind = remind;
    }

    public int getTodoId() {
        return todoId;
    }

    public void setTodoId(int todoId) {
        this.todoId = todoId;
    }
}
