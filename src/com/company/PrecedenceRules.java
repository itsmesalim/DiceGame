package com.company;

public class PrecedenceRules {
    public static void main(String[] args) {
        float a;
        a = 5.0f/2;
        System.out.println("a = "+ a);

        int b;
        b = 5+4*6;
        System.out.println("b = "+ b);

        int c;
        c = (9+5)+4*2;
        System.out.println("c = "+ c);

        int d;
        d = 5-(2*3);
        System.out.println("d = "+ d);

        int e;
        e = (3*4)+(4-3)-6;
        System.out.println("e = "+ e);

        int f;
        f = 8/2+3*4;
        System.out.println("f = "+ f);


    }
}
