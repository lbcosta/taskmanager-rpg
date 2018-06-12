package model;

public class Avatar {
    private int id;
    private String name;
    private int statusId;
    private int experience;
    private int level;
    private int health;
    private int coins;
    private int points;

    public Avatar() {

    }

    public Avatar(int id, String name, int statusId, int experience, int level, int health, int coins, int points) {
        this.id = id;
        this.name = name;
        this.statusId = statusId;
        this.experience = experience;
        this.level = level;
        this.health = health;
        this.coins = coins;
        this.points = points;
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

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
