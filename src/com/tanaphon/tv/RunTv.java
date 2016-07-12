package com.tanaphon.tv;

/**
 * Created by Tanaphon on 7/11/2016.
 */
public class RunTv {
    public static void main(String[] args) {
        Tv tv1 = new SharpA9();
        Tv tv2 = new BraviaD290();
        BraviaD290 tv3 = new BraviaD290();


        tv1.setCh(2);
        tv2.setCh(5);

        SmartFunction smartTv = (BraviaD290) tv1;
        SmartFunction sTv = (BraviaD290) tv1;

        smartTv.browseInternet();

        tv3.browseInternet();
        tv3.show3D();

    }
}
