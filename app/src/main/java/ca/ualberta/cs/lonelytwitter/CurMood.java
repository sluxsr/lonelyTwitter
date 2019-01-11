package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class CurMood {
    private Date date;

    CurMood() {
        this.date = new Date(System.currentTimeMillis());
    }

    CurMood(Date date) {
        this.date = date;
    }

    abstract String format();

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return format() + " | " + date.toString();
    }

}
