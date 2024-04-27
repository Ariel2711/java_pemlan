import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		MyStack stack = new MyStack();

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter five string : ");

		for (int i = 0; i <= 4; i++)
			stack.push(scanner.next());

		System.out.print("Reverse order : ");
		for (int i = 4; i >= 0; i--)
			System.out.print(stack.peek(i) + " ");

		scanner.close();
	}
}