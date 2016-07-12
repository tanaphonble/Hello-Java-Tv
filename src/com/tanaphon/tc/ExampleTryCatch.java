package com.tanaphon.tc;

import javax.annotation.processing.FilerException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Tanaphon on 7/12/2016.
 */
public class ExampleTryCatch {

    public static void openFile() throws MyExampleException {
        try {
            FileInputStream fileInputStream = new FileInputStream("file.txt");
        } catch (FileNotFoundException fnfe) {
            throw new MyExampleException("Cannot open file", fnfe);
        }
    }

    public static void main(String[] args) throws Exception {
        openFile();
    }


    public static class MyExampleException extends Exception {
        public MyExampleException(String msg, Throwable cause) {
            super(msg, cause);
        }
    }
}
