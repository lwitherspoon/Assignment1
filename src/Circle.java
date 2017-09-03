/**
 * Program to calculate area and perimeter of circle of radius 5.5
 * @author Laura Witherspoon
 * Assignment 1.8
 * Date: 8/28/2017
 */

public class Circle {

    public static void main(String[] args) {
        double radius = 5.5;
        System.out.printf("The area of a circle with %1.1f radius is approximately: %1.4f \n", radius, getArea(radius));
        System.out.printf("The perimeter of a circle with %1.1f radius is approximately: %1.4f", radius, getPerimeter(radius));
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
