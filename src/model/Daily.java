package model;

public class Daily extends Task {

    private boolean dailyDone;
    private int avatarId;

    public Daily(boolean dailyDone, int avatarId) {
        this.dailyDone = dailyDone;
        this.avatarId = avatarId;
    }

    public Daily(String name, String difficulty, String description, boolean dailyDone, int avatarId) {
        super(name, difficulty, description);
        this.dailyDone = dailyDone;
        this.avatarId = avatarId;
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
