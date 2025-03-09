package ch.hslu.ad.Week_2;

public interface StackInterface {

/**
 * Pushes an element onto the top of the stack.
 *
 * @param element the element to be pushed onto the stack
 */
public void push(String element);

/**
 * Pulls the top element of the Stack.
 * 
 * @return the element on top of the Stack
 */
public String pull();

/**
 * Measures the Amount of elements in  the Stack.
 *  
 * @return Returns the amount of elements in the stack as an integer
*/
public int getSize();

/**
 * Checks if the Stack is empty or not
 * @return true if the Stack is empty, false if there is an elemnt on the stack
 */
public boolean isEmpty();
}
