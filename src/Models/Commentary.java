package Models;

import java.util.Calendar;
import java.util.Date;

public class Commentary {
    private String comment;
    private final Date dateOfComment;

    public Commentary(String comment, Date dateOfComment) {
        this.comment = comment;
        this.dateOfComment = dateOfComment;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDateOfComment() {
        return dateOfComment;
    }
}
