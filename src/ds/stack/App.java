/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.stack;

/**
 *
 * @author fillipemontenegro
 */
public class App {
    
    public static void main(String[] args){
        
        Stack stack = new Stack(3);
        
        /* Stack changed from array of long to array of char to reverseString() */
        System.out.println(stack.peak());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        
        System.out.println(stack.peak());
        
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        
        System.out.println(stack.peak());
        
        System.out.println(reverseString("Hello"));
    }
    
    public static String reverseString(String string){
        String newString = "";
        Stack stack = new Stack(string.length());
        for(char c : string.toCharArray()) stack.push(c);
        while(!stack.isEmpty()) newString += stack.pop();
        return newString;
    }
}
