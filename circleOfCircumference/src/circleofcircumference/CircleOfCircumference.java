
package circleofcircumference;

import java.util.Scanner;


public class CircleOfCircumference {

    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int radius;
        double Circumference,Area;
        
        System.out.print("Enter a radius: ");
        radius = scn.nextInt();
        Circumference = 2 * Math.PI * radius;
        Area = Math.PI* radius * radius;
        System.out.println(Circumference);
        System.out.println(Area);
    }
    
}
