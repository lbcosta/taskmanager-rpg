package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Avatar {
    IntegerProperty id;
    StringProperty name;
    IntegerProperty experience;
    IntegerProperty level;
    IntegerProperty health;
    IntegerProperty coins;
    IntegerProperty points;

    public Avatar() {

    }

    public Avatar(int id, String name, int experience, int level, int health, int coins, int points) {
        this.id = new SimpleIntegerProperty(id);
        this.name = new SimpleStringProperty(name);
        this.experience = new SimpleIntegerProperty(experience);
        this.level = new SimpleIntegerProperty(level);
        this.health = new SimpleIntegerProperty(health);
        this.coins = new SimpleIntegerProperty(coins);
        this.points = new SimpleIntegerProperty(points);
    }

    public void buff() {
        if (this.experience.get() + 10 >= 100) {
            this.level.set(this.level.get() + 1);
            this.points.set(10);
            this.experience.set(0);
            this.coins.set(this.coins.get() + 10);
        } else {
            this.experience.set(this.experience.get() + 10);
            this.coins.set(this.coins.get() + 10);
        }
    }

    public void debuff() {
        if (this.health.get() - 10 <= 0) {
            if (this.coins.get() - 10 <= 0) {
                this.health.set(0);
                this.coins.set(0);
            } else {
                this.health.set(0);
                this.coins.set(this.coins.get() - 10);
            }
        } else {
            this.health.set(this.health.get() - 10);
            this.coins.set(this.coins.get() - 10);
        }
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

    public int getExperience() {
        return experience.get();
    }

    public IntegerProperty experienceProperty() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience.set(experience);
    }

    public int getLevel() {
        return level.get();
    }

    public IntegerProperty levelProperty() {
        return level;
    }

    public void setLevel(int level) {
        this.level.set(level);
    }

    public int getHealth() {
        return health.get();
    }

    public IntegerProperty healthProperty() {
        return health;
    }

    public void setHealth(int health) {
        this.health.set(health);
    }

    public int getCoins() {
        return coins.get();
    }

    public IntegerProperty coinsProperty() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins.set(coins);
    }

    public int getPoints() {
        return points.get();
    }

    public IntegerProperty pointsProperty() {
        return points;
    }

    public void setPoints(int points) {
        this.points.set(points);
    }
}
