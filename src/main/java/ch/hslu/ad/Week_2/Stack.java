package ch.hslu.ad.Week_2;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack implements StackInterface{
    ArrayList<String> stack = new ArrayList<>();
    private int size;
    private int space;

    public Stack(int size){
        this.size = size;
        this.space = size;
    }

    @Override
    public void push(String element) {
        
        if (space != 0){
        stack.add(element);
        space = space - 1;
        }else{
            throw new EmptyStackException();
        }
    }

    @Override
    public String pop() {
        int top = getNumOfElements() - 1;
        String pop;
        pop = stack.get(top);
        stack.remove(top);
        size++;
        return pop;
    }

    @Override
    public int getSize() {
        return size;
    }

    public int getNumOfElements(){
        return stack.size();
    }

    @Override
    public boolean isEmpty() {
        return getNumOfElements() == 0;
    }

}
