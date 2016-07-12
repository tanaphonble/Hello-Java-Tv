package com.tanaphon.document;

import com.tanaphon.hello.Document;

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