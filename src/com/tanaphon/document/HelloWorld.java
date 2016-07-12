package com.tanaphon.document;

/**
 * Created by Tanaphon on 7/11/2016.
 */
public class HelloWorld {

    public static void main(String[] args) {
        ReadableDocument doc1 = new ReadableDocument();
        ReadableDocument doc2 = new ReadableDocument();
        doc1.getReadState();
        doc2.getReadState();

        ReadableDocument.runningNumber++;

        System.out.print(ReadableDocument.runningNumber);
    }
}