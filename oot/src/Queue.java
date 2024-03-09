import java.util.ArrayList;

public class Queue {
	private ArrayList<Integer> elements;
	private int size;

	Queue() {
		elements = new ArrayList<Integer>();
	}

	public void enqueue(int v) {
		elements.add(v);
        size++;
	}

	public int dequeue() {
		int v = elements.get(0);
		elements.remove(0);
		size--;
		return v;
	}

	public int getElement(int index){
		int v = elements.get(index);
		return v;
	}

	public boolean empty() {
		return size == 0;
	}

	public int getSize() {
		return size;
	}
}

// public class Queue {
// 	private int[] elements;
// 	private int size;

// 	Queue() {
// 		elements = new int[8];
// 	}

// 	public void enqueue(int v) {
// 		if (size >= elements.length) {
// 			int[] temp = new int[elements.length * 2];
// 			System.arraycopy(elements, 0, temp, 0, elements.length);
// 			elements = temp;
// 		}
// 		elements[size] = v;
//         size++;
// 	}

// 	public int dequeue() {
// 		int v = elements[0];
// 		int[] temp = new int[elements.length];
// 		System.arraycopy(elements, 1, temp, 0, size);
// 		elements = temp;
// 		size--;
// 		return v;
// 	}

// 	public boolean empty() {
// 		return size == 0;
// 	}

// 	public int getSize() {
// 		return size;
// 	}
// }