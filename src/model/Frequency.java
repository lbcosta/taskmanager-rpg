package model;

import java.time.LocalDate;
import java.util.Date;

public class Frequency {
    private int id;
    private Date startDate;
    private int repeats;
    private int dailyId;

    public Frequency() {
    }

    public Frequency(int id, Date startDate, int repeats, int dailyId) {
        this.id = id;
        this.startDate = startDate;
        this.repeats = repeats;
        this.dailyId = dailyId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public int getRepeats() {
        return repeats;
    }

    public void setRepeats(int repeats) {
        this.repeats = repeats;
    }

    public int getDailyId() {
        return dailyId;
    }

    public void setDailyId(int dailyId) {
        this.dailyId = dailyId;
    }
}
