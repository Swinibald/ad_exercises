package ch.hslu.ad.Week2_2;

public class demoStack {

    public static void main(String[] args) {
        StackImp<String> stack = new StackImp<>(3);
        stack.push("toll!");
        stack.push("sind ");
        stack.push("Datensturkturen ");
        System.out.println(stack.pop()+ stack.pop()+ stack.pop());
    }

}
