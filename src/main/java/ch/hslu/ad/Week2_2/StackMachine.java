package ch.hslu.ad.Week2_2;

import java.util.EmptyStackException;

public class StackMachine {

    private final StackImp<Integer> stack;
    private final List<String> cmds; // use your linked list

    public StackMachine(int size) {
        this.stack = new StackImp<>(size);
        this.cmds = new List<>();
    }

    public void load(int x) {
        if (!stack.push(x)) {
            System.err.println("Error: Stack is full, cannot LOAD " + x);
        }
    }

    public void add() {
        try {
            int a = stack.pop();
            int b = stack.pop();
            stack.push(b + a);
        } catch (EmptyStackException e) {
            System.err.println("Error: ADD requires two operands");
        }
    }

    public void mul() {
        try {
            int a = stack.pop();
            int b = stack.pop();
            stack.push(b * a);
        } catch (EmptyStackException e) {
            System.err.println("Error: MUL requires two operands");
        }
    }

    public void div() {
        try {
            int a = stack.pop();
            int b = stack.pop();
            if (a == 0) {
                System.err.println("Error: Division by zero");
                return;
            }
            stack.push(b / a);
        } catch (EmptyStackException e) {
            System.err.println("Error: DIV requires two operands");
        }
    }

    public void sub() {
        try {
            int a = stack.pop();
            int b = stack.pop();
            stack.push(b - a);
        } catch (EmptyStackException e) {
            System.err.println("Error: SUB requires two operands");
        }
    }

    public void print() {
        try {
            System.out.println(stack.pop());
        } catch (EmptyStackException e) {
            System.err.println("Error: PRINT requires one operand");
        }
    }

    public void execute() {
        for (String cmd : cmds) { // use iterator from your linked list
            String[] parts = cmd.split(" ");
            String command = parts[0];
            switch (command) {
                case "LOAD":
                    int value = Integer.parseInt(parts[1]);
                    load(value);
                    break;
                case "ADD":
                    add();
                    break;
                case "MUL":
                    mul();
                    break;
                case "DIV":
                    div();
                    break;
                case "SUB":
                    sub();
                    break;
                case "PRINT":
                    print();
                    break;
                default:
                    System.err.println("Unknown command: " + command);
            }
        }
    }

    public void addCommand(String cmd) {
        cmds.add(cmd); // add command to your linked list
    }

    public static void main(String[] args) {
        StackMachine sm = new StackMachine(10);
        sm.addCommand("PRINT"); // should print 20
        sm.addCommand("MUL");
        sm.addCommand("LOAD 4");
        sm.addCommand("ADD");
        sm.addCommand("LOAD 3");
        sm.addCommand("LOAD 2");
        sm.execute();
    }
}
