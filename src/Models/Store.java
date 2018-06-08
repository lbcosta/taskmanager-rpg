package Models;

import java.util.ArrayList;

public class Store {
    private ArrayList<Item> items;

    public Store(ArrayList<Item> items) {
        this.items = items;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void addItem(Item itemToAdd){
        items.add(itemToAdd);
    }

    public boolean removeItem(Item itemToRemove){
        return items.remove(itemToRemove);
    }
}
