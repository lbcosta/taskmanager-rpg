package model;

public class Status {
    private int id;
    private int strength;
    private int intelligence;
    private int constitution;
    private int agility;

    public Status() {
    }

    public Status(int id, int strength, int intelligence, int constitution, int agility) {
        this.id = id;
        this.strength = strength;
        this.intelligence = intelligence;
        this.constitution = constitution;
        this.agility = agility;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setAgility(int agilidade) {
        this.agility = agilidade;
    }
}
