package Models;

import Models.Item;
import Models.Task;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
    private ArrayList<Item> items;
    private ArrayList<Task> tasks;
    private int id;

    private String name;
    private int level;
    private double experience;
    private int health;
    private int coins;

    private int pointsToDistribute;
    private int strengh;
    private int intelligence;
    private int agility;
    private int spirit;

    public User(ArrayList<Item> items, ArrayList<Task> tasks, int id, String name, int level, double experience, int health, int coins, int pointsToDistribute, int strengh, int intelligence, int agility, int spirit) {
        this.items = items;
        this.tasks = tasks;
        this.id = id;
        this.name = name;
        this.level = level;
        this.experience = experience;
        this.health = health;
        this.coins = coins;
        this.pointsToDistribute = pointsToDistribute;
        this.strengh = strengh;
        this.intelligence = intelligence;
        this.agility = agility;
        this.spirit = spirit;
    }

    public int getPointsToDistribute() {
        return pointsToDistribute;
    }

    public void setPointsToDistribute(int pointsToDistribute) {
        this.pointsToDistribute = pointsToDistribute;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
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

    public int getStrengh() {
        return strengh;
    }

    public void setStrengh(int strengh) {
        this.strengh = strengh;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getSpirit() {
        return spirit;
    }

    public void setSpirit(int spirit) {
        this.spirit = spirit;
    }

    public void addSpirit(int pointsToAdd){
        this.spirit += pointsToAdd;
    }
    public void addAgility(int pointsToAdd){
        this.agility += pointsToAdd;
    }
    public void addInteligence(int pointsToAdd){
        this.intelligence += pointsToAdd;
    }
    public void addStrength(int pointsToAdd){
        this.strengh += pointsToAdd;
    }

    public boolean removeTask(Task toRemove) {
        return tasks.remove(toRemove);
    }

    public Task getTask(Task toGet) {
        for (Task task : tasks) {
            if (task.equals(toGet)) {
                return task;
            }
        }
        return null;
    }

    public void addTask(Task toAdd) {
        tasks.add(toAdd);
    }


    public boolean removeItem(Item toRemove) {
        return items.remove(toRemove);
    }

    public Item getItem(Item toGet) {
        for (Item item : items) {
            if (item.equals(toGet)) {
                return item;
            }
        }
        return null;
    }

    public boolean addItem(Item toAdd){
        return items.add(toAdd);
    }
}