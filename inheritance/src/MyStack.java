import java.util.ArrayList;

public class MyStack extends ArrayList<Object> {
    // @Override
    // public boolean isEmpty(){
    //     return this.isEmpty();
    // }

    public int getSize() {
        return this.size();
    }

    public Object peek(int i) {
        return this.get(i);
    }

    public Object pop() {
        Object o = get(this.size() - 1);
        this.remove(this.size() - 1);
        return o;
    }
    
    public void push(Object o) {
        this.add(o);
    }

    @Override
    public String toString() {
        return "Stack: " + this.toString();
    }
}