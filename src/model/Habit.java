package model;

public class Habit extends Task {

    private boolean positiveInfluence;
    private boolean negativeInfluence;
    private int positivePoints;
    private int negativePoints;


    public Habit(){

    }

    public Habit(String name, String difficulty, String descricao, boolean positiveInfluence,
                 boolean negativeInfluence, int positivePoints, int negativePoints) {
        super(name, difficulty, descricao);
        this.positiveInfluence = positiveInfluence;
        this.negativeInfluence = negativeInfluence;
        this.positivePoints = positivePoints;
        this.negativePoints = negativePoints;
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
}
