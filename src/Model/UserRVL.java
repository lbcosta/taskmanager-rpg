package Model;

import java.io.Serializable;
import java.util.ArrayList;

public class UserRVL implements Serializable{
    private ArrayList<ItemRVL> itens;
    private ArrayList<TaskRVL> tasks;
    private String name;
    private StatusRVL status;
    private double experience;
    private int level;
    private int health;
    private int coins;
    private int id;

    public UserRVL(ArrayList<ItemRVL> itens, ArrayList<TaskRVL> tasks, String name, StatusRVL status, double experience, int level, int health, int coins, int id) {
        this.itens = itens;
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

    public ArrayList<ItemRVL> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemRVL> itens) {
        this.itens = itens;
    }

    public ArrayList<TaskRVL> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<TaskRVL> tasks) {
        this.tasks = tasks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StatusRVL getStatus() {
        return status;
    }

    public void setStatus(StatusRVL status) {
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
