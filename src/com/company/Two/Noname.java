package com.company.Two;

public class Noname {
    static int one=10;
    static int two;
    static {
        two=2*one;
    }
    static int demoOne(){
        return one+two;
    }
    static int demoTwo(){
        return demoOne()*2;

    }
}
