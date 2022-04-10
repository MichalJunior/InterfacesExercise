package car.features;

import car.features.interfaces.Moving;
import com.company.Colours;

public class Car implements Value, Moving {

    String mark;
    int wheelsquiantity;
    Colours colour;


    public Car(String mark, int wheelsquiantity, Colours colour) {
        this.mark = mark;
        this.wheelsquiantity = wheelsquiantity;
        this.colour = colour;
    }

    @Override
    public void Value() {
        boolean cheap;
        System.out.println(mark + " to tanie auto!");
    }


    @Override
    public void Goforward() {
        System.out.println(mark + " wolno jedzie do przodu");


    }

    @Override
    public void Turn() {
        System.out.println(mark + " skręca");


    }

    @Override
    public void Goback() {
        System.out.println(mark + " wolno cofa");

    }
}
