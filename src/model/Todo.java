package model;

import javafx.beans.property.*;

import java.util.Date;

public class Todo {

    IntegerProperty id;
    StringProperty name;
    StringProperty difficulty;
    StringProperty description;
    BooleanProperty todoDone;
    Property<Date> dueDate;
    IntegerProperty avatarId;

    public Todo() {
    }

    public Todo(String name, String difficulty, String description, boolean todoDone, Date dueDate, int avatarId) {
        this.name = new SimpleStringProperty(name);
        this.difficulty = new SimpleStringProperty(difficulty);
        this.description = new SimpleStringProperty(description);
        this.todoDone = new SimpleBooleanProperty(todoDone);
        this.dueDate = new SimpleObjectProperty<>(dueDate);
        this.avatarId = new SimpleIntegerProperty(avatarId);
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

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getDifficulty() {
        return difficulty.get();
    }

    public StringProperty difficultyProperty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty.set(difficulty);
    }

    public String getDescription() {
        return description.get();
    }

    public StringProperty descriptionProperty() {
        return description;
    }

    public void setDescription(String description) {
        this.description.set(description);
    }

    public boolean isTodoDone() {
        return todoDone.get();
    }

    public BooleanProperty todoDoneProperty() {
        return todoDone;
    }

    public void setTodoDone(boolean todoDone) {
        this.todoDone.set(todoDone);
    }

    public Date getDueDate() {
        return dueDate.getValue();
    }

    public Property<Date> dueDateProperty() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate.setValue(dueDate);
    }

    public int getAvatarId() {
        return avatarId.get();
    }

    public IntegerProperty avatarIdProperty() {
        return avatarId;
    }

    public void setAvatarId(int avatarId) {
        this.avatarId.set(avatarId);
    }
}
