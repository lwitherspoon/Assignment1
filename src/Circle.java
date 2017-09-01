/**
 * Program to calculate area and perimeter of circle of radius 5.5
 * @author Laura Witherspoon
 * Assignment 1.8
 * Date: 8/28/2017
 */

public class Circle {

    public static void main(String[] args) {
        double radius = 5.5;
        System.out.println("The area of a circle with " + radius + " radius is: " + getArea(radius));
        System.out.println("The perimeter of a circle with " + radius + " radius is: " + getPerimeter(radius));
    }

    /**
     *
     * @return area of circle
     */
    static double getArea(double rad) {
        return Math.PI * rad * rad;
    }

    /**
     *
     * @return perimeter of circle
     */
    static double getPerimeter(double rad) {
        return 2 * Math.PI * rad;
    }
}
