package model;

public class Item {

    int id;
    String name;
    int strength;
    int intelligence;
    int constitution;
    int agility;
    int price;

    public Item() {
    }

    public Item(int id, String name, int strength, int intelligence, int constitution, int agility, int price) {
        this.id = id;
        this.name = name;
        this.strength = strength;
        this.intelligence = intelligence;
        this.constitution = constitution;
        this.agility = agility;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}