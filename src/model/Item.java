package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Item {

    IntegerProperty id;
    StringProperty name;
    IntegerProperty strength;
    IntegerProperty intelligence;
    IntegerProperty constitution;
    IntegerProperty agility;
    IntegerProperty price;

    public Item() {
    }

    public Item(String name, int strength, int intelligence, int constitution, int agility, int price) {
        this.name = new SimpleStringProperty(name);
        this.strength = new SimpleIntegerProperty(strength);
        this.intelligence = new SimpleIntegerProperty(intelligence);
        this.constitution = new SimpleIntegerProperty(constitution);
        this.agility = new SimpleIntegerProperty(agility);
        this.price = new SimpleIntegerProperty(price);
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

    public int getPrice() {
        return price.get();
    }

    public IntegerProperty priceProperty() {
        return price;
    }

    public void setPrice(int price) {
        this.price.set(price);
    }
}