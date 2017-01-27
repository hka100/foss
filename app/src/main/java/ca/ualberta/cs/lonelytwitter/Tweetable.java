package ca.ualberta.cs.lonelytwitter;

/**
 * Created by yxi on 2017/1/20.
 */

public interface Tweetable {
    public String getMessage();
    public void setMessage(String string) throws TweetTooLongException;
}
