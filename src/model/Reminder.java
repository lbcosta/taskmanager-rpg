package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.Property;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;

import java.util.Date;

public class Reminder {
    IntegerProperty id;
    Property<Date> remind;
    IntegerProperty todoId;

    public Reminder(Date remind, int todoId) {
        this.remind = new SimpleObjectProperty<>(remind);
        this.todoId = new SimpleIntegerProperty(todoId);
    }

    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public Date getRemind() {
        return remind.getValue();
    }

    public Property<Date> remindProperty() {
        return remind;
    }

    public void setRemind(Date remind) {
        this.remind.setValue(remind);
    }

    public int getTodoId() {
        return todoId.get();
    }

    public IntegerProperty todoIdProperty() {
        return todoId;
    }

    public void setTodoId(int todoId) {
        this.todoId.set(todoId);
    }
}
