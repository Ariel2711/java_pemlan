import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a, b, c: ");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();

		QuadraticEquation qe = new QuadraticEquation(a, b, c);

		double discriminant = qe.getDiscriminant();

		System.out.println("Discriminant : " + discriminant);

		System.out.print("The equation has ");
		if (discriminant > 0)
			System.out.println("two roots " + qe.getRoot1() + 
				" and " + qe.getRoot2());
		else if (discriminant == 0) 
			System.out.println("one root " + qe.getRoot1());
		else 
			System.out.println("no roots");

        scanner.close();
	}
}