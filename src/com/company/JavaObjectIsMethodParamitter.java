package com.company;

public class JavaObjectIsMethodParamitter {
    public static void main(String[] args) {
        Employier bank = new Employier();

        Employee jennah = new Employee( 4567, "Jennah", "Losaft", "HR", "Recruiter", 67894);
        Employee samad = new Employee( 67432, "samad", "Lossi", "CS", "IT Support", 987564);

        bank.calculateAnnualBounus(jennah);
        bank.calculateAnnualBounus(samad );
        bank.employeeDetails(jennah);
    }
}
