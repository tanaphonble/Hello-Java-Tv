package com.tanaphon.nameprinter;


/**
 * Created by Tanaphon on 7/12/2016.
 */
public class NamePrinter {
    protected String name = "1233";

    public NamePrinter() {

    }

    public NamePrinter(String name) {
        this.name = name;
    }

    public void setName(String name) {
        //    System.out.println("Name changing");
        this.name = name;
    }

    public void print() {
        if (validName()) {
            sayHi();
        } else {
            System.out.println("Set name first!");
        }
    }

    protected void sayHi() {
        System.out.println("Hello, " + name);
    }

    protected boolean validName() {
        return name != null;
    }

    public static void main(String[] args) {
        NamePrinter namePrinter1 = new MyNamePrinter();
        NamePrinter namePrinter2 = new MyNamePrinter();
        NamePrinter namePrinter3 = new MyNamePrinter();
        namePrinter1.setName("Ble");
        namePrinter1.print();
        namePrinter2.setName("Yoyo Jelly");
        namePrinter2.print();
        namePrinter3.print();
//
//        if (args.length > 0) {
//            for (int i = 0; i < args.length; i++) {
//                System.out.println(args[i]);
//            }
//        }

        for (String arg : args) {
            // do something
            // for (String x : y) << foreach x in y
        }

        NumberName nn = NumberName.ONE;
        switch (nn) {
            case ONE:
                System.out.print("one");
                break;
            case TWO:
                System.out.print("two");
                break;
            default:
                System.out.print("not 1,2");
        }

        try {

        } catch (Exception e) {

        }

    }
}