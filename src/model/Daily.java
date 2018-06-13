package model;

import javafx.beans.property.*;

public class Daily {

    IntegerProperty id;
    StringProperty name;
    StringProperty difficulty;
    StringProperty description;
    BooleanProperty dailyDone;
    IntegerProperty avatarId;

    public Daily() {
    }

    public Daily(String name, String difficulty, String description, boolean dailyDone, int avatarId) {
        this.name = new SimpleStringProperty(name);
        this.difficulty = new SimpleStringProperty(difficulty);
        this.description = new SimpleStringProperty(description);
        this.dailyDone = new SimpleBooleanProperty(dailyDone);
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

    public boolean isDailyDone() {
        return dailyDone.get();
    }

    public BooleanProperty dailyDoneProperty() {
        return dailyDone;
    }

    public void setDailyDone(boolean dailyDone) {
        this.dailyDone.set(dailyDone);
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
