package com.company;

public class Ball2 {

    private String name1;
    private String color1;
    private int bounceRate1;

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getColor1() {
        return color1;
    }

    public void setColor1(String color1) {
        this.color1 = color1;
    }

    public int getBounceRate1() {
        return bounceRate1;
    }

    public void setBounceRate1(int bounceRate1) {
        this.bounceRate1 = bounceRate1;
    }


    public Ball2(String mName1, String mColor1, int mBounceRate1) {
        name1 = mName1;
        color1 = mColor1;
        bounceRate1 = mBounceRate1;
    }















    public void showName(){
        System.out.println(name1);
    }

    public void showColor(){
        System.out.println(color1);
    }

    public void showBounceRate(){
        System.out.println(bounceRate1);
    }

    public void ballBounce(String ballBounce1){
        ballBounce1 = "My Ball is ";
        System.out.println(ballBounce1+"Bouncing..........");
    }

    public void deflate(String ballDeflate1){
        ballDeflate1 = "My Ball is ";
        System.out.println(ballDeflate1+"Deflating.......");
    }

    public void inflate(String ballInflate1){
        ballInflate1 = "My Ball is ";
        System.out.println(ballInflate1+"Inflating.......");
    }
}
