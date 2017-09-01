/**
 * Program to calculate area and perimeter of circle of radius 5.5
 * @author Laura Witherspoon
 * Assignment 1.8
 * Date: 8/28/2017
 */

public class Circle {

    private static double radius = 5.5;

    public static void main(String[] args) {
        System.out.println("The area of a circle with " + radius + " radius is: " + getArea());
        System.out.println("The perimeter of a circle with " + radius + " radius is: " + getPerimeter());
    }

    /**
     *
     * @return area of circle
     */
    public static double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     *
     * @return perimeter of circle
     */
    public static double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
