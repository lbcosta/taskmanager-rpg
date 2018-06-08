package Models;

public class Item {
    private String name;
    private String description;
    private String img;
    private double value ;
    private EquipType type;

    private int bonusStr;
    private int bonusAgi;
    private int bonusInt;
    private int bonusSpirit;

    public Item(String name, String description, String img, double value, EquipType type, int bonusStr, int bonusAgi, int bonusInt, int bonusSpirit) {
        this.name = name;
        this.description = description;
        this.img = img;
        this.value = value;
        this.type = type;
        this.bonusStr = bonusStr;
        this.bonusAgi = bonusAgi;
        this.bonusInt = bonusInt;
        this.bonusSpirit = bonusSpirit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public EquipType getType() {
        return type;
    }

    public void setType(EquipType type) {
        this.type = type;
    }

    public int getBonusStr() {
        return bonusStr;
    }

    public void setBonusStr(int bonusStr) {
        this.bonusStr = bonusStr;
    }

    public int getBonusAgi() {
        return bonusAgi;
    }

    public void setBonusAgi(int bonusAgi) {
        this.bonusAgi = bonusAgi;
    }

    public int getBonusInt() {
        return bonusInt;
    }

    public void setBonusInt(int bonusInt) {
        this.bonusInt = bonusInt;
    }

    public int getBonusSpirit() {
        return bonusSpirit;
    }

    public void setBonusSpirit(int bonusSpirit) {
        this.bonusSpirit = bonusSpirit;
    }
}

