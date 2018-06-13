package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class ItemDoAvatar {
    IntegerProperty id;
    IntegerProperty avatarId;
    IntegerProperty itemId;

    public ItemDoAvatar() {
    }

    public ItemDoAvatar(int avatarId, int itemId) {
        this.avatarId = new SimpleIntegerProperty(avatarId);
        this.itemId = new SimpleIntegerProperty(itemId);
    }

    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public int getAvatarId() {
        return avatarId.get();
    }

    public IntegerProperty avatarIdProperty() {
        return avatarId;
    }

    public void setAvatarId(int avatarId) {
        this.avatarId.set(avatarId);
    }

    public int getItemId() {
        return itemId.get();
    }

    public IntegerProperty itemIdProperty() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId.set(itemId);
    }
}
