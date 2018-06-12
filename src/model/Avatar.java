package model;

import java.util.ArrayList;

public class Avatar {
    private int id;
    private String name;
    private Status status;
    private int experience;
    private int level;
    private int health;
    private int coins;
    private int points;
    private ArrayList<Task> tasks;

    public Avatar() {

    }

    public Avatar(int id, String name, Status status, int experience, int level,
                  int health, int coins, int points, ArrayList<Task> tasks) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.experience = experience;
        this.level = level;
        this.health = health;
        this.coins = coins;
        this.points = points;
        this.tasks = tasks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void addTask(Task task){
        tasks.add(task);
    }

    public void removeTask(String name){
        for(Task t : tasks) {
            if(t.getName().equals(name)) {
                tasks.remove(t);
                break;
            }
        }
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
