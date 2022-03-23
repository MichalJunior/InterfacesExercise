package com.company;

public class Car extends Wehicle implements Moving, Comparable<String> {
    int wheelsquantity;

    Car(String mark, int wheelsquantity) {
        super(mark);
        this.wheelsquantity = wheelsquantity;
    }

    @Override
    public void Goforward() {
        System.out.println(mark + " jadę w przód");

    }

    @Override
    public void Turn() {
        System.out.println(mark + " Skręcaj");

    }

    @Override
    public void Goback() {
        System.out.println(mark +" jadę w tył");

    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
