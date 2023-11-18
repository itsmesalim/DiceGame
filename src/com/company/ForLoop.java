package com.company;

public class ForLoop {
    public static void main(String[] args) {


//        for (int i=1; i<=10; i++){
//            System.out.println(i+" * "+i+" = "+i*i);
//        }
//
//        for (int j=1; j<=10; j=j+2){
//            System.out.println(j+" * "+j+" = "+j*j);
//        }
//
//        for (int i=0; i<=10; i++){
//            for (int j=0; j<=5; j++){
//                System.out.println(i+"*"+j+" = "+i*j);
////            }
////        }
//        sayHiWorld();
//        hello2ndMethod( 6, 9);
//        stringChar("Hello World", "  this is my code ");
//
//    }
//
//    public static void sayHiWorld(){
//        System.out.println("hello world");
//        System.out.println("I have learn my first method\n\n");
//    }
//
//
//    public static void hello2ndMethod(int n1, int n2){
//
//        int num1 = n1;
//        int num2 = n2;
//        System.out.println("num1 + num2 =  "+(num1+num2));
//    }
//
//    public static void stringChar(String h1, String w2){
//        String hello = h1;
//        String world = w2;
//
//        System.out.println(hello+world);

//            printHelloSomTimes(6);
//            printNumbers(10);
//            printSquareNumbers(10);
            printTable5(1);
            printTable5(2);
            printTable5(3);
            printTable5(4);
            printTable5(5);
            printTable5(6);
            printTable5(7);
            printTable5(8);
            printTable5(9);
            printTable5(10);
            printTable5(11);
            printTable5(12);
            printTable5(13);
            printTable5(14);
            printTable5(15);
            printTable5(16);
            printTable5(17);
            printTable5(18);
            printTable5(19);
            printTable5(20);


   }

//    public static void printHelloSomTimes(int a){
//        for (int i=0; i<=a; i++){
//            System.out.println(" Hello Word ");
//        }
//    }
//
//    public static void printNumbers(int a){
//        for (int i=0; i<=a; i++){
//            System.out.println(i);
//        }
//    }
//
//    public static void printSquareNumbers(int n){
//        for (int i=0; i<=n; i++){
//            System.out.println(i+" * "+i+" = "+i*i);
//        }
//    }

    public static void printTable5(int h){
        System.out.println("table of "+h);
        for (int j=0; j<=h; j++){
            for (int i=0; i<=h; i++){
                System.out.println(h+" * "+i+" = "+h*i);
            }
        }

    }
}
