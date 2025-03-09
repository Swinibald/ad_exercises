package ch.hslu.ad.Week_2;

import java.util.ArrayList;

public class Stack implements StackInterface{
    ArrayList<String> stack = new ArrayList<>();

    public Stack(){
        Stack stack = new Stack()
    }

    @Override
    public void push(String element) {
        stack.add(element)
    }

    @Override
    public String pull() {
        int top = getSize();
        return stack.get(top);

    }

    @Override
    public int getSize() {
        return stack.size();
    }

    @Override
    public boolean isEmpty() {
        return getSize() == 0;
    }

}
