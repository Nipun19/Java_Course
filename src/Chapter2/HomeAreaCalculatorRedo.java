package Chapter2;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    public static void main(String[] args) {

        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen, bathroom);
        System.out.println("Total Area is:"+area);

    }

    public Rectangle getRoom() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the room:");
        double length = sc.nextDouble();
        System.out.println("Enter width of the room:");
        double width = sc.nextDouble();

        return new Rectangle(length, width);
    }
    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2) {
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }


}
