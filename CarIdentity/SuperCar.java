package CarIdentity;

import CarIdentity.interfaces.Moving;
import com.company.Colours;

public class SuperCar extends Car implements Moving, Value, Comparable<String> {
    int wheelsquantity;
    Colours colour;
    String mark;
    

    public SuperCar(String mark, int wheelsquiantity, Colours colour) {
        super(mark, wheelsquiantity, colour);
        this.wheelsquantity = wheelsquantity;
        this.mark = mark;
    }


    @Override
    public void Goforward() {
        System.out.println(mark + " szybko jadę w przód");

    }

    @Override
    public void Turn() {
        System.out.println(mark + " Skręcaj");

    }

    @Override
    public void Goback() {
        System.out.println(mark + " szybko jadę w tył");

    }

    @Override
    public int compareTo(String o) {
        return 0;
    }

    @Override
    public void Value() {
        System.out.println(mark + " to drogie auto!");

    }
}
