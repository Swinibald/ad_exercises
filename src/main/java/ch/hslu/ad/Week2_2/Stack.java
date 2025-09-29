package ch.hslu.ad.Week2_2;

import ch.hslu.ad.Week_4.base;

public interface Stack<E> {


    /**
     * Checks if the stack is empty.
     * @return true if the stack is empty, false otherwise.
     */
    public boolean isEmpty();

    /**
     * Pushes an element onto the stack.
     * @param value the element to be pushed onto the stack.
     * @return true if the element was successfully pushed onto the stack, false otherwise.
     */
    public boolean push(E value);

    /**
     * Pops an element from the stack.
     * @return the element that was popped from the stack.
     */
    public E pop();

    /**
     * Checks if the stack is full.
     * @return true if the stack is full, false otherwise.
     */
    public boolean isFull();
}
