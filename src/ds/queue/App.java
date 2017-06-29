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
public class App {
    
    public static void main(String[] args){
        
        Queue q = new Queue(5);
        
        q.view();
        
        // 5x insert()
        q.insert(1);
        q.insert(2);
        q.insert(3);
        q.insert(4);
        q.insert(5);
        
        q.view();
        
        q.remove();
        
        q.view();
        
        q.insert(6);
        q.insert(7);
        
        q.view();
        
        // 6x remove()
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        
        q.insert(8);
        q.insert(9);
        
        q.view();
    }
    
}
