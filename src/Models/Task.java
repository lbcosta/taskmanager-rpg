package Models;

import java.util.ArrayList;

public class Task {
    //Propriedades
    private int id;
    private String name;
    private Difficulty difficulty;
    private ArrayList<String> tags;
    private String description;

    //Construtor primário
    public Task() {

    }

    //Construtor secundário


    public Task(int id, String name, Difficulty difficulty, ArrayList<String> tags, String description) {
        this.id = id;
        this.name = name;
        this.difficulty = difficulty;
        this.tags = tags;
        this.description = description;
    }

    //Getters and Setters

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

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String commentaries) {
        this.description = description;
    }

}
