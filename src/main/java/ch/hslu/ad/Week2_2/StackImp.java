package ch.hslu.ad.Week2_2;

import java.util.EmptyStackException;

public class StackImp<E> implements Stack<E> {

    private final int size;
    private int stackPointer = 0;
    private final E[] stack;

    @SuppressWarnings("unchecked")
    public StackImp(int size) {
        this.size = size;
        this.stack = (E[]) new Object[size];
    }

    @Override
    public boolean isEmpty() {
        return stackPointer == 0;
    }

    @Override
    public boolean push(E value) {
        if (isFull()) {
            return false;
        }
        stack[stackPointer++] = value;
        return true;
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        E value = stack[--stackPointer];
        stack[stackPointer] = null;
        return value;
    }

    @Override
    public boolean isFull() {
        return stackPointer == size;
    }
}
