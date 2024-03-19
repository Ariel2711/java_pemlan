public class App {
	public static void main(String[] args) {
		MyStack stack = new MyStack();

		System.out.println("Add data to list");
		for (int i = 1; i <= 10; i++){
			stack.push(i);
			System.out.println("add : " + stack.peek());
		}
		System.out.println(stack.toString());

		System.out.println("Remove data from list");
		while(!stack.isEmpty())
			System.out.println("remove : " + stack.pop());
		System.out.println(stack.toString());
	}
}