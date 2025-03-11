package ch.hslu.ad.Week_2;

import java.util.ArrayList;
import java.util.EmptyStackException;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Stack implements StackInterface{
    ArrayList<String> stack = new ArrayList<>();
    private int size;
    private int space;
    private static Logger log = LoggerFactory.getLogger(Stack.class);

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
            log.error("Stack is already Full");
            throw new StackOverflowError();        
        }
    }

    @Override
    public String pop() {
        int top = getNumOfElements() - 1;
        String pop;
        if ( space != size){
        pop = stack.get(top);
        stack.remove(top);
        space++;
        return pop;
        }else{
            log.error("Stack is empty.");
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

    public static void main(String[] args) {
        Stack stack = new Stack(4);
        stack.push("t");
        stack.push("0");
        stack.push("l");
        stack.push("l");
        System.out.println(stack.pop() + stack.pop() + stack.pop() + stack.pop());

    }


}
