package model;

public class ItemDoAvatar {
    private int avatarId;
    private int itemId;

    public ItemDoAvatar() {
    }

    public ItemDoAvatar(int avatarId, int itemId) {
        this.avatarId = avatarId;
        this.itemId = itemId;
    }

    public int getAvatarId() {
        return avatarId;
    }

    public void setAvatarId(int avatarId) {
        this.avatarId = avatarId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
}
