package model;

import javafx.beans.property.*;

public class Habit {
    IntegerProperty id;
    StringProperty name;
    StringProperty difficulty;
    StringProperty description;
    BooleanProperty positiveInfluence;
    BooleanProperty negativeInfluence;
    IntegerProperty positivePoints;
    IntegerProperty negativePoints;
    IntegerProperty avatarId;


    public Habit(){

    }

    public Habit(String name, String difficulty, String description, boolean positiveInfluence,
                 boolean negativeInfluence, int positivePoints, int negativePoints, int avatarId) {
        this.name = new SimpleStringProperty(name);
        this.difficulty = new SimpleStringProperty(difficulty);
        this.description = new SimpleStringProperty(description);
        this.positiveInfluence = new SimpleBooleanProperty(positiveInfluence);
        this.negativeInfluence = new SimpleBooleanProperty(negativeInfluence);
        this.positivePoints = new SimpleIntegerProperty(positivePoints);
        this.negativePoints = new SimpleIntegerProperty(negativePoints);
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

    public boolean isPositiveInfluence() {
        return positiveInfluence.get();
    }

    public BooleanProperty positiveInfluenceProperty() {
        return positiveInfluence;
    }

    public void setPositiveInfluence(boolean positiveInfluence) {
        this.positiveInfluence.set(positiveInfluence);
    }

    public boolean isNegativeInfluence() {
        return negativeInfluence.get();
    }

    public BooleanProperty negativeInfluenceProperty() {
        return negativeInfluence;
    }

    public void setNegativeInfluence(boolean negativeInfluence) {
        this.negativeInfluence.set(negativeInfluence);
    }

    public int getPositivePoints() {
        return positivePoints.get();
    }

    public IntegerProperty positivePointsProperty() {
        return positivePoints;
    }

    public void setPositivePoints(int positivePoints) {
        this.positivePoints.set(positivePoints);
    }

    public int getNegativePoints() {
        return negativePoints.get();
    }

    public IntegerProperty negativePointsProperty() {
        return negativePoints;
    }

    public void setNegativePoints(int negativePoints) {
        this.negativePoints.set(negativePoints);
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
