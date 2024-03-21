import java.util.ArrayList;

public class MyStack extends ArrayList {
    public boolean isEmpty(){
        return super.isEmpty();
    }

    public int getSize() {
        return super.size();
    }

    public Object peek(int i) {
        return super.get(i);
    }

    public Object pop() {
        Object o = get(super.size() - 1);
        super.remove(super.size() - 1);
        return o;
    }
    
    public void push(Object o) {
        super.add(o);
    }

    @Override
    public String toString() {
        return "Stack: " + super.toString();
    }
}