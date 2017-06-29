/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.stack;

/**
 *
 * @author fillipemontenegro
 * @param <T> generic type
 */
public class Stack<T> {
    
    private int size;
    private T[] array;
    private int top;
    
    public Stack(){
        this(2);
    }
    
    public Stack(int size){
        this.size = size > 0 ? size : 2;
        this.array = (T[]) new Object[size];
        this.top = -1;
    }
    
    public void push(T value){
        if(!isFull()){
            top++;
            array[top] = value;
        }
        else
            System.out.println("The stack is full!");
    }
    
    public T pop(){
        if(!isEmpty()){
            top--;
            return array[top+1];
        }
        else {
            System.out.println("The stack is empty!");
            return null;
        }
    }
    
    public T peak(){
        if (!isEmpty())
            return array[top];
        else{
            System.out.println("Can't peak an empty stack!");
            return null;
        }
    }
    
    public boolean isFull(){
        return (top == size-1);
    }
    
    public boolean isEmpty(){
        return (top < 0);
    }
}
