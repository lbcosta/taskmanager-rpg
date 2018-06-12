package model;

import java.time.LocalDate;

public class Frequency {
    private LocalDate startDate;
    private int repeats;

    public Frequency(LocalDate startDate, int repeats) {
        this.startDate = startDate;
        this.repeats = repeats;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public int getRepeats() {
        return repeats;
    }

    public void setRepeats(int repeats) {
        this.repeats = repeats;
    }
}
