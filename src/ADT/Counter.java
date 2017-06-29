/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

/**
 *
 * @author fillipemontenegro
 */
public class Counter {
    
    private final String name;
    private int value;
    
    public Counter (String name) {
        this.name = name;
        this.value = 0;
    }
    
    public void increment() {
        value++;
    }
    
    public int getCurrentValue() {
        return value;
    }
    
    @Override
    public String toString() {
        return "The value of " + name + " is " + value;
    }
    
}
