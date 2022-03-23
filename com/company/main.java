package com.company;

import CarIdentity.Car;
import CarIdentity.interfaces.Moving;

public class main {
    public static void main(String[] args) {
        System.out.println(Moving.interfacename);
        Car bentley = new Car("bentley", 4);
        Moving(bentley);
    }

    public static void Moving(Car bentley) {
        bentley.Goforward();
        bentley.Goback();
        bentley.Turn();
    }
}