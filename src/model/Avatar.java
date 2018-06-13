package model;

public class Avatar {
    int id;
    String name;
    int experience;
    int level;
    int health;
    int coins;
    int points;

    public Avatar() {

    }

    public Avatar(int id, String name, int experience, int level, int health, int coins, int points) {
        this.id = id;
        this.name = name;
        this.experience = experience;
        this.level = level;
        this.health = health;
        this.coins = coins;
        this.points = points;
    }

    public void buff() {
        if (this.experience + 10 >= 100) {
            this.level++;
            this.points = 10;
            this.experience = 0;
            this.coins += 10;
        } else {
            this.experience += 10;
            this.coins += 10;
        }
    }

    public void debuff() {
        if (this.health - 10 <= 0) {
            if (this.coins - 10 <= 0) {
                this.health = 0;
                this.coins = 0;
            } else {
                this.health = 0;
                this.coins -= 10;
            }
        } else {
            this.health -= 10;
            this.coins -= 10;
        }
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
