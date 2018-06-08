package Models;

import java.util.ArrayList;

public class Daily extends Task {

    private ArrayList<SubItem> subItems;
    private boolean isDailyDone;
    private Frequency frequency;

    public Daily(int id, String name, Difficulty difficulty, ArrayList<String> tags, String description, ArrayList<SubItem> subItems, boolean isDailyDone, Frequency frequency) {
        super(id, name, difficulty, tags, description);
        this.subItems = subItems;
        this.isDailyDone = isDailyDone;
        this.frequency = frequency;
    }

    public ArrayList<SubItem> getSubItems() {
        return subItems;
    }

    public void setSubItems(ArrayList<SubItem> subItems) {
        this.subItems = subItems;
    }

    public boolean isDailyDone() {
        return isDailyDone;
    }

    public void setDailyDone(boolean dailyDone) {
        this.isDailyDone = dailyDone;
    }

    public void addSubItem(SubItem subItem){
        subItems.add(subItem);
    }
    public void addSubItem(boolean isItemDone, String itemName){
        SubItem subItem = new SubItem(isItemDone, itemName);
        subItems.add(subItem);
    }
    
    public SubItem getSubItem(SubItem itemRetornado){
        for (SubItem i: subItems) {
            if (i.equals(itemRetornado)){
                return i;
            }
        }
        return null;
    }
    public SubItem getSubItem(boolean isItemDone, String itemName){
        for (SubItem i: subItems) {
            if (i.getItemName().equals(itemName) && i.isDone() == isItemDone){
                return i;
            }
        }
        return null;
    }

    public void removeSubItem(SubItem subItem){
        subItems.remove(subItem);
    }
    public boolean removeSubItem(boolean isItemDone, String itemName){
        for (SubItem i: subItems) {
            if (i.getItemName().equals(itemName) && i.isDone() == isItemDone){
                subItems.remove(i);
                return true;
            }
        }
        return false;
    }
}
