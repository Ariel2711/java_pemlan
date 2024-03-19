import java.util.ArrayList;

public class MyStack extends ArrayList {
    public void push(Object o) {
        super.add(o);
    }

    public Object pop() {
        Object o = get(super.size() - 1);
        super.remove(super.size() - 1);
        return o;
    }

    public Object peek() {
        return super.get(super.size() - 1);
    }

    @Override
    public String toString() {
        return "Stack: " + super.toString();
    }
}