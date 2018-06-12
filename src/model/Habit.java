package model;

public class Habit extends Task {

    private boolean positiveInfluence;
    private boolean negativeInfluence;
    private int positivePoints;
    private int negativePoints;
    private int avatarId;


    public Habit(){

    }

    public Habit(boolean positiveInfluence, boolean negativeInfluence, int positivePoints, int negativePoints, int avatarId) {
        this.positiveInfluence = positiveInfluence;
        this.negativeInfluence = negativeInfluence;
        this.positivePoints = positivePoints;
        this.negativePoints = negativePoints;
        this.avatarId = avatarId;
    }

    public Habit(String name, String difficulty, String description, boolean positiveInfluence, boolean negativeInfluence, int positivePoints, int negativePoints, int avatarId) {
        super(name, difficulty, description);
        this.positiveInfluence = positiveInfluence;
        this.negativeInfluence = negativeInfluence;
        this.positivePoints = positivePoints;
        this.negativePoints = negativePoints;
        this.avatarId = avatarId;
    }

    public boolean isPositiveInfluence() {
        return positiveInfluence;
    }

    public void setPositiveInfluence(boolean positiveInfluence) {
        this.positiveInfluence = positiveInfluence;
    }

    public boolean isNegativeInfluence() {
        return negativeInfluence;
    }

    public void setNegativeInfluence(boolean negativeInfluence) {
        this.negativeInfluence = negativeInfluence;
    }

    public int getPositivePoints() {
        return positivePoints;
    }

    public void setPositivePoints(int positivePoints) {
        this.positivePoints = positivePoints;
    }

    public int getNegativePoints() {
        return negativePoints;
    }

    public void setNegativePoints(int negativePoints) {
        this.negativePoints = negativePoints;
    }

    public int getAvatarId() {
        return avatarId;
    }

    public void setAvatarId(int avatarId) {
        this.avatarId = avatarId;
    }
}
