package com.lysenko;

/**
 * Created by Vladyslav on 21.04.2015.
 */
public class MyData {

    private long time = 0;
    private String message = "";

    public MyData() { }

    public MyData(long time, String message) {
        this.time = time;
        this.message = message;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
