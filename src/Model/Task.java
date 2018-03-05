package Model;

import java.io.Serializable;
import java.util.ArrayList;

public class Task implements Serializable{
    //Propertys
    private int id;
    private String name;
    private byte difficulty;
    private ArrayList<String> tags;
    private ArrayList<String> comments;

    //Construtor primário
    public Task() {

    }

    //Construtor secundário


    public Task(int id, String name, byte difficulty, ArrayList<String> tags, ArrayList<String> comments) {
        this.id = id;
        this.name = name;
        this.difficulty = difficulty;
        this.tags = tags;
        this.comments = comments;
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

    public byte getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(byte difficulty) {
        this.difficulty = difficulty;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public ArrayList<String> getComments() {
        return comments;
    }

    public void setComments(ArrayList<String> comments) {
        this.comments = comments;
    }
}
