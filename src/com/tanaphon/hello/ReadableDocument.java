package com.tanaphon.hello;

/**
 * Created by Tanaphon on 7/11/2016.
 */
public class ReadableDocument extends Document {
    private String readState;

    protected static int runningNumber;


    public void read(){

    }

    public String getReadState(){
        runningNumber++;
        return readState;
    }

}