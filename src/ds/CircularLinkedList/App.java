/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.CircularLinkedList;

/**
 *
 * @author fillipemontenegro
 */
public class App {
    public static void main(String[] args){
        
        Node d = new Node("D");
        Node c = new Node("C", d);
        Node b = new Node("B", c);
        Node a = new Node("A", b);
        
        //System.out.println(a.nodesLength());
        
        CircularLinkedList sll = new CircularLinkedList();
        
        sll.insertLast(a);
        sll.insertLast(b);
        sll.insertLast(c);
       
        System.out.println(sll.toJson());
        
        sll.deleteLast();
        sll.deleteLast();
        sll.deleteLast();
        
        sll.insertLast("cccccccccc");
        sll.insertLast("ddddddddd");
        sll.insertLast("eeeeeeeeee");
        sll.insertLast("ffffffffff");
        sll.insertFirst("aaaaaaaaaaaa");
        System.out.println(sll.toJson());
        sll.deleteFirst();
        sll.deleteFirst();
        sll.deleteFirst();
        System.out.println(sll.toJson());
        
        sll.deleteLast();
        sll.deleteLast();
        System.out.println(sll.toJson());
        sll.deleteLast();
        sll.deleteFirst();
        System.out.println(sll.toJson());
        sll.insertLast("CircLAST");
        System.out.println(sll.toJson());
        sll.deleteFirst();
        sll.deleteLast();
        sll.insertFirst("CircFIRST");
        System.out.println(sll.toJson());
    }
}
