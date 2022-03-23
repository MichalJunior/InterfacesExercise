package com.company;

public class main {
    public static void main(String[] args) {
        System.out.println(Moving.interfacename);
        Car bentley = new Car("bentley", 4);
        Moving(bentley);
    }

    private static void Moving(Car bentley) {
        bentley.Goback();
        bentley.Goforward();
        bentley.Turn();
    }
}