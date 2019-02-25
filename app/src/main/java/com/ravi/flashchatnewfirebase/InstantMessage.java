package com.ravi.flashchatnewfirebase;

/**
 * Created by root on 14/2/18.
 */

public class InstantMessage {
    private String message;
    private String author;

    public InstantMessage(String message,String author ) {
        this.message = message;
        this.author = author;
    }

    public InstantMessage() {

    }

    public String getMessage() {
        return message;
    }

    public String getAuthor() {
        return author;
    }
}
