package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Happy extends CurMood {
    public Happy(Date date) {
        super(date);
    }

    public Happy() {
        super();
    }

    @Override
    String format() {
        return "Happy";
    }
}
