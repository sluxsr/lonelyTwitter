package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Sad extends CurMood {

    public Sad(Date date) {
        super(date);
    }

    public Sad() {
        super();
    }

    @Override
    String format() {
        return "Sad";
    }
}
