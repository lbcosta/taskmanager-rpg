package Model;

import java.util.ArrayList;

public class Daily extends Task {

    private ArrayList<ChecklistItem> checklist;
    private boolean dailyDone;

    public Daily(int id, String name, byte difficulty, ArrayList<String> tags, ArrayList<String> comments, ArrayList<ChecklistItem> checklist, boolean dailyDone) {
        super(id, name, difficulty, tags, comments);
        this.checklist = checklist;
        this.dailyDone = dailyDone;
    }

    public ArrayList<ChecklistItem> getChecklist() {
        return checklist;
    }

    public void setChecklist(ArrayList<ChecklistItem> checklist) {
        this.checklist = checklist;
    }

    public boolean isDailyDone() {
        return dailyDone;
    }

    public void setDailyDone(boolean dailyDone) {
        this.dailyDone = dailyDone;
    }
}
