package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Status {
    IntegerProperty id;
    IntegerProperty strength;
    IntegerProperty intelligence;
    IntegerProperty constitution;
    IntegerProperty agility;
    IntegerProperty avatarId;

    public Status() {
    }

    public Status(int id, int strength, int intelligence, int constitution, int agility, int avatarId) {
        this.id = new SimpleIntegerProperty(id);
        this.strength = new SimpleIntegerProperty(strength);
        this.intelligence = new SimpleIntegerProperty(intelligence);
        this.constitution = new SimpleIntegerProperty(constitution);
        this.agility = new SimpleIntegerProperty(agility);
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

    public int getStrength() {
        return strength.get();
    }

    public IntegerProperty strengthProperty() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength.set(strength);
    }

    public int getIntelligence() {
        return intelligence.get();
    }

    public IntegerProperty intelligenceProperty() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence.set(intelligence);
    }

    public int getConstitution() {
        return constitution.get();
    }

    public IntegerProperty constitutionProperty() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution.set(constitution);
    }

    public int getAgility() {
        return agility.get();
    }

    public IntegerProperty agilityProperty() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility.set(agility);
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
