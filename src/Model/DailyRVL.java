package Model;

import java.util.ArrayList;

public class DailyRVL extends TaskRVL {

    private ArrayList<ChecklistItem> checklist;
    private boolean dailyFeito;

    public DailyRVL(int id, String nome, byte dificuldade, ArrayList<String> tags, ArrayList<String> observações, ArrayList<ChecklistItem> checklist, boolean dailyFeito) {
        super(id, nome, dificuldade, tags, observações);
        this.checklist = checklist;
        this.dailyFeito = dailyFeito;
    }

    public ArrayList<ChecklistItem> getChecklist() {
        return checklist;
    }

    public void setChecklist(ArrayList<ChecklistItem> checklist) {
        this.checklist = checklist;
    }

    public boolean isDailyFeito() {
        return dailyFeito;
    }

    public void setDailyFeito(boolean dailyFeito) {
        this.dailyFeito = dailyFeito;
    }
}
