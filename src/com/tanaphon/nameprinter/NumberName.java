package com.tanaphon.nameprinter;

/**
 * Created by Tanaphon on 7/12/2016.
 */
public enum NumberName {
    ONE,
    TWO,
    THREE("three"); // THREE < three

    private String name;

    NumberName() {
    }

    NumberName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
