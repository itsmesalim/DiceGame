package com.company;

public class InhiritenceClass2 extends InhiritenceClass{

    private int id;
    private float salary;

    public InhiritenceClass2() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }



    public InhiritenceClass2(int id, float salary) {
        this.id = id;
        this.salary = salary;
    }



}
