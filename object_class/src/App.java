import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a, b, c: ");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();

		QuadraticEquation qe = new QuadraticEquation(a, b, c);

		System.out.print("The equation has ");
		if (qe.getDiscriminant() < 0)
			System.out.println("no real roots");
		else if (qe.getDiscriminant() > 0) 
			System.out.println("two roots " + qe.getRoot1() + 
				" and " + qe.getRoot2());
		else 
			System.out.println("one root " + (qe.getRoot1() > 0 ? 
				qe.getRoot1() : qe.getRoot2()));

        scanner.close();
	}
}