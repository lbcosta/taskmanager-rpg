package model;

import java.util.Date;

public class Reminder {
    int id;
    Date remind;
    int todoId;

    public Reminder(Date remind, int todoId) {
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
