package exercise13_10;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(3, 5, "Yellow", true);
        Rectangle rectangle2 = new Rectangle(5, 3, "Blue", false);

        System.out.println("Rectangle 1:\n" + rectangle1.toString());
        System.out.println();
        System.out.println("Rectangle 2:\n" + rectangle2.toString());

        System.out.println("\nRectangle 1 is equal with Rectangle 2: " + rectangle1.equals(rectangle2));
    }
}
