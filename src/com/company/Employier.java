package com.company;

public class Employier {
    private String name;
    private String location;

    public Employier(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public Employier() {

    }

    public boolean areRelated(Employee employeeA, Employee employeeB){
        if (employeeA.getLastName() == employeeB.getLastName()){
            return true;
        }else {
            return false;
        }
    }

    public void calculateAnnualBounus(Employee employee){
        double annualBounus = (employee.getMonthlySalary()*0.15)*11;
        System.out.println("annual bounus for "+employee.getFirstName()+" is "+annualBounus);
    }

    public void employeeDetails(Employee employee){
        System.out.println("ID : "+employee.getIdNumber()+
                "\n First Name : "+employee.getFirstName()+
                "\n Last Name : "+employee.getLastName()+
                "\n Department : "+employee.getDepartment()+
                "\n Position : "+employee.getPosition()+
                "\n Monthly Salary : "+employee.getMonthlySalary());
    }

}
