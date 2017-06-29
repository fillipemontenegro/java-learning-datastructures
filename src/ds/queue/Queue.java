/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.queue;

/**
 *
 * @author fillipemontenegro
 */
public class Queue<E> {
    
    private int size, rear, numberOfItems;
    private E[] array;
    
    public Queue(){
        this(3);
    }
    
    public Queue(int size) {
        this.size = size > 0 ? size : 3;
        this.array = (E[]) new Object[size];
        this.numberOfItems = 0;
        this.rear = -1;
    }
    
    public void insert(E value){
        if (!isFull()) {
            rear++;
            numberOfItems++;
            array[rear] = value;
        }
        else {
            System.out.println("The Queue is full!");
        }
    }
    
    public void remove(){
        if (!isEmpty()){
            for(int i = 1; i < numberOfItems; i++){
                array[i-1] = array[i];
            }
            array[rear] = null;
            rear--;
            numberOfItems--;
        }
        else {
            System.out.println("The Queue is empty!");
        }
    }
    
    public void view(){
        System.out.print("[ ");
        for(E element : array){
            System.out.print(element + " ");
        }
        System.out.println("]");
    }
    
    public boolean isEmpty() {
        return (rear == -1);
    }
    
    public boolean isFull() {
        return (rear == size-1);
    }
}
