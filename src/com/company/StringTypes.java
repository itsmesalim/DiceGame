package com.company;

public class StringTypes {
    public static void main(String[] args) {
        System.out.println("hello\\\\word");
        System.out.println("5 * 2 = 10 ");
        System.out.printf("5 * 2 =   %d", 5*2).println();
        System.out.printf("%d * %d = %d",5,7, 5*7).println();
        System.out.printf("%d + %d = %d", 3,6, 3+6).println();
        System.out.printf("%f + %f = %f", 3.5,6.3, 3.5+6.3).println();
        System.out.printf("print %s ", "Testing").println();

        int a = 50;
        int b = 40;
        int c = 30;

        System.out.printf(" %d + %d + %d = %d", a,b,c, a+b+c).println();
        System.out.println("1"+2+2);
        System.out.println("1"+(2+3));
        System.out.println("2"+(3+4*2));
        int s=
                4;

        int k = 9; int d = 4;

        System.out.println(" s = "+s);
        System.out.println(" s = "+k);
        System.out.println(" s = "+d);

         int i = 4*7;
        System.out.println("i = "+i);

        int a1 = 6;
        int b1 = 5;
        int c1 = 3;
        int d1 = 8;

        if (a1+b1 == c1+d1){
            System.out.println("a1 + b1 == c1 + d1 ");
        }


        int number = 21;
        if (number%2 == 0){
            System.out.println("the number is even");
        }else {
            System.out.println("the number is odd ");
        }

        int angle1 = 60, angle2 = 60, angle3 = 60;
        if (angle1+angle2+angle3 == 180){
            System.out.println("it is a triangle ");
        }else {
            System.out.println("its not a triangle");
        }

        boolean isRaining = true;
        boolean isSunny = false;

        System.out.println("Is it raining? " + isRaining);
        System.out.println("Is it sunny? " + isSunny);

        // Logical operations with boolean variables
        boolean isRainyAndSunny = isRaining && isSunny;
        boolean isRainyOrSunny = isRaining || isSunny;
        boolean isNotRaining = !isRaining;

        System.out.println("Is it both rainy and sunny? " + isRainyAndSunny);
        System.out.println("Is it either rainy or sunny? " + isRainyOrSunny);
        System.out.println("Is it not raining? " + isNotRaining);


        int a2 = 6, i1;

        for (i1=0; i1<=80; i1++){
            System.out.println(i1+" * "+a2+" = "+ i1*a2);
        }

        int a3 = 10, i3;

        for (i3=0; i3<=10; i3++){
            System.out.println(a3+" * "+i3+" = "+ a3*i3);
        }





    }
}
