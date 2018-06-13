package model;

public class Daily {

    int id;
    String name;
    String difficulty;
    String description;
    boolean dailyDone;
    int avatarId;

    public Daily() {
    }

    public Daily(String name, String difficulty, String description, boolean dailyDone, int avatarId) {
        this.name = name;
        this.difficulty = difficulty;
        this.description = description;
        this.dailyDone = dailyDone;
        this.avatarId = avatarId;
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

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDailyDone() {
        return dailyDone;
    }

    public void setDailyDone(boolean dailyDone) {
        this.dailyDone = dailyDone;
    }

    public int getAvatarId() {
        return avatarId;
    }

    public void setAvatarId(int avatarId) {
        this.avatarId = avatarId;
    }
}
