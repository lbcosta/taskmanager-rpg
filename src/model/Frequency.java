package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.Property;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;

import java.time.LocalDate;
import java.util.Date;

public class Frequency {
    IntegerProperty id;
    Property<Date> startDate;
    IntegerProperty repeats;
    IntegerProperty dailyId;

    public Frequency() {
    }

    public Frequency(Date startDate, int repeats, int dailyId) {
        this.startDate = new SimpleObjectProperty<>(startDate);
        this.repeats = new SimpleIntegerProperty(repeats);
        this.dailyId = new SimpleIntegerProperty(dailyId);
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

    public Date getStartDate() {
        return startDate.getValue();
    }

    public Property<Date> startDateProperty() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate.setValue(startDate);
    }

    public int getRepeats() {
        return repeats.get();
    }

    public IntegerProperty repeatsProperty() {
        return repeats;
    }

    public void setRepeats(int repeats) {
        this.repeats.set(repeats);
    }

    public int getDailyId() {
        return dailyId.get();
    }

    public IntegerProperty dailyIdProperty() {
        return dailyId;
    }

    public void setDailyId(int dailyId) {
        this.dailyId.set(dailyId);
    }
}
