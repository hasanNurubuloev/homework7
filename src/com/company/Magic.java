package com.company;

import org.w3c.dom.ls.LSOutput;

public class Magic extends Player implements SuperAdults{
    private int defence ;

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    @Override
    public void superAdults() {
        System.out.println("Маг применил суперспособность");
    }
}
