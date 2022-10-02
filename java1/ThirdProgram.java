
/*Write a java program to show following menu to the user:

*******Menu*******
1. Calculate Area of Circle
2. Calculate Circumference of a Circle
3. Exit.
Choose an option (1-3): 

Take radius as user input. */
import java.util.Scanner;

class circle {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the radius");

        float radius = sc.nextFloat();

        float area = (float) (Math.PI * (radius * radius));
        System.out.println("The area of circle is" + area);

        float circumference = (float) (Math.PI * 2 * radius);
        System.out.println("The circumference of the circle is:" + circumference);
    }
}
