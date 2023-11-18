package com.company;

public class Ball {
    public String color;
    public String name;
    public int bounceRate;


    public void bounce(String ballBounce){
        System.out.println(ballBounce+"Bouncing.......");
    }

    public void deflate(String ballDeflate){
        System.out.println(ballDeflate+"Deflating.......");
    }

    public void inflate(String ballInflate){
        System.out.println(ballInflate+"Inflating.......");
    }
}
