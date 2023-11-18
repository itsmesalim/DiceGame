package com.company;

import java.util.ArrayList;

public class ArrayClass {
    public static void main(String[] args) {

        ArrayClass arrayClass = new ArrayClass();
//        int array[] = {2,4,6,8,10};
//        String array1[] = {"salman", "asad", "karim", "mansoor","walid"};
//
//        for(int i=0; i<array.length; i++){
//            System.out.print("items"+array[i]);
//            System.out.println(" = "+array1[i]);
//        }

//        int array2[] = new int [4];
//
//        array2[0] = 340;
//        array2[1] = 290;
//        array2[2] = 890;
//        array2[3] = 480;
//
//        System.out.println("array2 [0] = "+array2[0]);
//        System.out.println("array2 [1] = "+array2[1]);
//        System.out.println("array2 [2] = "+array2[2]);
//        System.out.println("array2 [3] = "+array2[3]);
//
//
//        ArrayList name = new ArrayList();
//        name.add("james");
//        name.add("jokers");
//        name.add("hakman");
//        name.add("hilmand");
//        name.add("harrykrish");
//
//        for (int i=0; i<name.size(); i++){
//            System.out.println(i+" : "+name.get(i));
//        }
        int numbers[] = {45, 34, 23, 12, 36, 32, 48, 56, 72, 90, 46, 99, 96, 24};
        multipleOfThree(numbers);

    }

    public static void multipleOfThree(int num[]){
        if (num.length>0){
            for (int i=0; i<num.length; i++){
                if (num[i] % 3 ==0){
                    System.out.println(num[i]+" is a multiple of 3");
                }else {
                    System.out.println(num[i]+" is not a multiple of 3");
                }
            }
        }else {
            System.out.println("Array is empty ");
        }
    }
}
