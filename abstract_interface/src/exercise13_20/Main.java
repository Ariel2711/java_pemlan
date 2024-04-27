package exercise13_20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double r1 = ((-1 * b) + Math.sqrt(discriminant)) / (2 * a);
            double r2 = ((-1 * b) - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("The roots are %2.6f and %2.5f", r1, r2);

        } else if (discriminant < 0) {
            Complex complexR1 = new Complex(-b / (2 * a), Math.sqrt(2 * a));
            Complex complexR2 = new Complex(-b / (2 * a), -Math.sqrt(2 * a));
            System.out.println("The roots are " + complexR1 + " and " + complexR2);

        } else if(discriminant == 0) {
            double r = ((-1 * b) + Math.sqrt(discriminant)) / (2 * a);
            System.out.print("The root is " + r);
        }

        input.close();
    }
}
