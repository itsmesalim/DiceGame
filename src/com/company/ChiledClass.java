package com.company;

public class ChiledClass extends BaseClass {



    int c = 80;
    int d = 90;
//
    public void getValue2(){
        System.out.println("this is sub Class method ");
        System.out.println("c = "+c);
        System.out.println("d = "+d);

    }

    public static class ChiledClass2 extends ChiledClass{

        int t = 30;
        int p = 20;
        public void getValue3(){
            System.out.println("this is sub Class method2 ");
            System.out.println("t = "+t);
            System.out.println("p = "+p);

        }


    }

}
