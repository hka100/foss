package ca.ualberta.cs.lonelytwitter;
import java.util.Date;
/**
 * Created by yxi on 2017/1/20.
 */

public class NormalTweet extends Tweet {
    public NormalTweet(String message) {
        super(message);
    }

    public NormalTweet(Date date, String message) {
        super(date, message);
    }

    @Override
    public Boolean isImportant() {
        return false;
    }
}