package com.company;

public class Mental extends Player implements SuperAdults {
    private int superAdults ;

    public int getSuperAdults() {
        return superAdults;
    }

    public void setSuperAdults(int superAdults) {
        this.superAdults = superAdults;
    }

    @Override
    public void superAdults() {
        System.out.println("Кинетик применил суперспосоность");
    }
}
