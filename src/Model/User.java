package Model;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable{
    private ArrayList<Item> items;
    private ArrayList<Task> tasks;
    private String name;
    private Status status;
    private double experience;
    private int level;
    private int health;
    private int coins;
    private int id;

    public User(ArrayList<Item> items, ArrayList<Task> tasks, String name, Status status, double experience, int level, int health, int coins, int id) {
        this.items = items;
        this.tasks = tasks;
        this.name = name;
        this.status = status;
        this.experience = experience;
        this.level = level;
        this.health = health;
        this.coins = coins;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
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
}
