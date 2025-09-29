package ch.hslu.ad.Week2_2;

import java.util.EmptyStackException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StackMachine {

    private final StackImp<Integer> stack;
    private final List<String> cmds;
    private static final Logger log = LoggerFactory.getLogger(StackMachine.class);

    public StackMachine(int size) {
        this.stack = new StackImp<>(size);
        this.cmds = new List<>();
    }

    public void load(int x) {
        if (!stack.push(x)) {
            log.error("Error: Stack is full, cannot LOAD " + x);
        }
    }

    public void add() {
        try {
            int a = stack.pop();
            int b = stack.pop();
            stack.push(b + a);
        } catch (EmptyStackException e) {
            log.error("Error: ADD requires two operands", e);
        }
    }

    public void mul() {
        try {
            int a = stack.pop();
            int b = stack.pop();
            stack.push(b * a);
        } catch (EmptyStackException e) {
            log.error("Error: MUL requires two operands", e);
        }
    }

    public void div() {
        try {
            int a = stack.pop();
            int b = stack.pop();
            if (a == 0) {
                log.error("Error: Division by zero");
                stack.push(b);
                return;
            }
            stack.push(b / a);
        } catch (EmptyStackException e) {
            log.error("Error: DIV requires two operands", e);
        }
    }

    public void sub() {
        try {
            int a = stack.pop();
            int b = stack.pop();
            stack.push(b - a);
        } catch (EmptyStackException e) {
            log.error("Error: SUB requires two operands", e);
        }
    }

    public void print() {
        try {
            System.out.println(stack.pop());
        } catch (EmptyStackException e) {
            log.error("Error: PRINT requires one operand", e);
        }
    }

    public void execute() {
        for (String cmd : cmds) {
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
                    log.error("Error: Unknown command " + command);
            }
        }
    }

    public void addCommand(String cmd) {
        cmds.add(cmd);
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
