package Model;

import java.util.ArrayList;

public class HabitRVL extends TaskRVL{

    private boolean positiveInfluence;
    private boolean negativeInfluence;

    //Construtor
    public HabitRVL(int id, String nome, byte dificuldade, ArrayList<String> tags, boolean positiveInfluence, boolean negativeInfluence) {
        super(id, nome, dificuldade, tags);
        this.positiveInfluence = positiveInfluence;
        this.negativeInfluence = negativeInfluence;
    }
}
