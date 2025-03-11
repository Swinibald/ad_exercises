package ch.hslu.ad.Week_2.Stackmachine;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackMachine {
    private Stack<Integer> stack = new Stack<>();


    public StackMachine(List<Runnable> cmds){
        for (Runnable i : cmds) {
            i.run();            
        }
    }

    public void printStack(){

    }

    public void load(int x){
        stack.push(x);
    }    

    

    public void add(){
        int a = stack.pop();  
        int b = stack.pop();  
        int c = a + b;
        stack.push(c);

    }

   public void  mul(){
    int a = stack.pop();  
    int b = stack.pop();  
    int c = a * b;
    stack.push(c);

   }

    public void print(){
        System.out.println(stack.pop());

    }

    public void div(){
        int a = stack.pop();  
        int b = stack.pop();  
        int c = a / b;
        stack.push(c);

    }
    
    public void sub(){
        int a = stack.pop();  
        int b = stack.pop();  
        int c = a - b;
        stack.push(c);
        
    }

    public static void main (String[] args){
        List<Runnable> cmdList;
        cmdList = new ArrayList<>();
        final StackMachine stackM = new StackMachine(new ArrayList<>());
        cmdList.add(() -> stackM.load(2));
        cmdList.add(() -> stackM.load(3));
        cmdList.add(() -> stackM.add());
        cmdList.add(() -> stackM.load(4));
        cmdList.add(() -> stackM.mul());
        cmdList.add(() -> stackM.print());
        StackMachine stackM2 = new StackMachine(cmdList);
        stackM2.printStack();
    }
}
