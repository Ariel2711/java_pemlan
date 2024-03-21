import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		MyStack stack = new MyStack();

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter five string : ");

		for (int i = 0; i < 5; i++)
			stack.push(scanner.next());

		for (int i = 4; i >= 0; i--)
			System.out.println(stack.peek(i));

		scanner.close();
	}
}