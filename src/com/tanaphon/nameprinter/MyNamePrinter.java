package com.tanaphon.nameprinter;

/**
 * Created by Tanaphon on 7/12/2016.
 */
public class MyNamePrinter extends NamePrinter {
    public MyNamePrinter() {
    }

    public MyNamePrinter(String name) {
        super(name);
    }

    private static final String myName = "Ble";

    @Override
    protected void sayHi() {
        if (isBoss(name)) {
            System.out.println("Hi, " + myName);
        } else {
            super.sayHi();
        }
    }

    private boolean isBoss(String name) {
        return name.equals(myName);
    }

}
