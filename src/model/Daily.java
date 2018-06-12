package model;

import java.util.ArrayList;

public class Daily extends Task {

    private boolean dailyDone;
    private ArrayList<CheckListItem> checklist;
    private Frequency frequency;

    public Daily(){

    }

    public Daily(String name, String difficulty, String descricao, boolean dailyDone,
                 ArrayList<CheckListItem> checklist, Frequency frequency) {
        super(name, difficulty, descricao);
        this.dailyDone = dailyDone;
        this.checklist = checklist;
        this.frequency = frequency;
    }

    public boolean isDailyDone() {
        return dailyDone;
    }

    public void setDailyDone(boolean dailyDone) {
        this.dailyDone = dailyDone;
    }

    public ArrayList<CheckListItem> getChecklist() {
        return checklist;
    }

    public void setChecklist(ArrayList<CheckListItem> checklist) {
        this.checklist = checklist;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }
}
