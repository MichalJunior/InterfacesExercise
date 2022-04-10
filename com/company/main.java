package com.company;


import car.features.Car;
import car.features.SuperCar;
import car.features.interfaces.Moving;

public class main {
    public static void main(String[] args) {
        System.out.println(Moving.interfacename);
        Car Punto = new Car("punto", 4, Colours.ZIELONY);
        SuperCar Bentley = new SuperCar("bentley", 4, Colours.CZARNY);


        Moving(Punto, Bentley);


    }

    private static void Moving(Car Punto, SuperCar Bentley) {
        Moving(Bentley);
        Moving(Punto);
    }

    private static void Moving(Car Punto) {
        Punto.Value();
        Punto.Goback();
        Punto.Goforward();
        Punto.Turn();

    }

    public static void Moving(SuperCar Bentley) {
        Bentley.Goforward();
        Bentley.Goback();
        Bentley.Turn();
        System.out.println();
    }


}