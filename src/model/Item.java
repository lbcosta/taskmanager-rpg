package model;

public class Item {
    private String name;
    private String description;
    private int price;
    private int strengthBonus;
    private int intelligenceBonus;
    private int agilityBonus;
    private int constitutionBonus;

    public Item(String name, String description, int price, int strengthBonus, int intelligenceBonus, int agilityBonus, int constitutionBonus) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.strengthBonus = strengthBonus;
        this.intelligenceBonus = intelligenceBonus;
        this.agilityBonus = agilityBonus;
        this.constitutionBonus = constitutionBonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStrengthBonus() {
        return strengthBonus;
    }

    public void setStrengthBonus(int strengthBonus) {
        this.strengthBonus = strengthBonus;
    }

    public int getIntelligenceBonus() {
        return intelligenceBonus;
    }

    public void setIntelligenceBonus(int intelligenceBonus) {
        this.intelligenceBonus = intelligenceBonus;
    }

    public int getAgilityBonus() {
        return agilityBonus;
    }

    public void setAgilityBonus(int agilityBonus) {
        this.agilityBonus = agilityBonus;
    }

    public int getConstitutionBonus() {
        return constitutionBonus;
    }

    public void setConstitutionBonus(int constitutionBonus) {
        this.constitutionBonus = constitutionBonus;
    }
}
