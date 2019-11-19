package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the radius of a circle: ");
        Double radius = input.nextDouble();
        input.close();

        Circle.getArea(radius);

        System.out.println("The area of the circle with radius " + radius + "is " + area + ".");
    }
}