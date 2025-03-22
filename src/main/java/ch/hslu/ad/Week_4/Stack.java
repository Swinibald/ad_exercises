package ch.hslu.ad.Week_4;

import java.util.ArrayList;
import java.util.EmptyStackException;
import org.slf4j.LoggerFactory;
import ch.hslu.ad.Week_4.StackInterface;
import org.slf4j.Logger;

public class Stack implements StackInterface{
    ArrayList<Integer> stack = new ArrayList<>();
    private int size;
    private int space;
    private static Logger log = LoggerFactory.getLogger(Stack.class);

    public Stack(int size){
        this.size = size;
        this.space = size;
    }

    @Override
    public void push(int element) {
        
        if (space != 0){
        stack.add(element);
        space = space - 1;
        }else{
            throw new StackOverflowError();        
        }
    }

    @Override
    public int pop() {
        int top = getNumOfElements() - 1;
        int pop;
        if ( space != size){
        pop = stack.get(top);
        stack.remove(top);
        space++;
        return pop;
        }else{
            log.error("Stack is empty.");
            throw new EmptyStackException();
        }
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
