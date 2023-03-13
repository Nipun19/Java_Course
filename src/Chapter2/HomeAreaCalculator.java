package Chapter2;

import java.util.Scanner;

public class HomeAreaCalculator {
    public static void main(String[] args) {

        /*************
         * Rectangle 1
         ************/

        //Create instance of Rectangle class
        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLength(50);
        double room1Area = room1.calculateArea();

        /*************
         * Rectangle 1
         ************/
        //Create instance of Rectangle class
        Rectangle room2 = new Rectangle(30,75);
        double room2Area = room1.calculateArea();

    }
}
