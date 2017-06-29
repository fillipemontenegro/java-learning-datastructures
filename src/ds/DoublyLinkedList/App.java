/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.DoublyLinkedList;

/**
 *
 * @author fillipemontenegro
 */
public class App {
    public static void main(String[] args){
        Node d = new Node("D");
        Node c = new Node("C");
        Node b = new Node("B");
        Node a = new Node("A");
        
        //System.out.println(a.nodesLength());
        
        DoublyLinkedList sll = new DoublyLinkedList();
        /*
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
        sll.insertLast("DoublyLAST");
        System.out.println(sll.toJson());
        sll.deleteFirst();
        sll.deleteLast();
        sll.insertFirst("DoublyFIRST");
        System.out.println(sll.toJson());
        sll.deleteLast();
        System.out.println(sll.toJson());
        
        sll.insertLast("First");
        sll.insertLast("Second");
        sll.insertAfter(sll.getFirstByValue("First"), "FirstB");
        System.out.println(sll.toJson());
        
        sll.insertAfter(sll.getFirstByValue("Second"), "SecondB");
        System.out.println(sll.toJson());
        
        sll.insertAfter(sll.getFirstByValue("NoValueFound"), "ThisValueWontBeAdded");
        System.out.println(sll.toJson());
        
        // Not yet implemented
        //sll.insertAfter("aa", sll);
        
        // Delete by value when the value is in the middle of list
        sll.deleteByValue("FirstB");
        System.out.println("\"FirstB\" removed: " + sll.toJson());

        // Delete by value when the value is not found (nothing should happen)
        sll.deleteByValue("NoValueFound");
        System.out.println("Nothing changes: " + sll.toJson());
        
        // Delete by value when found is first in list
        sll.deleteByValue("First");
        System.out.println("\"First\" removed: " + sll.toJson());
        
        sll.insertAfter(sll.getFirstByValue("Second"), "Zzzzzzzzz");
        System.out.println("\"Zzzzzzzzz\" included after \"Second\": " + sll.toJson());
        
        // Delete by value when found is last in list
        sll.deleteByValue("SecondB");
        System.out.println("\"SecondB\" removed: " + sll.toJson());
        
        //sll.deleteFirst();
        //System.out.println("Getting value of \"Zzzzzzzzz\": " + sll.getFirstByValue("Zzzzzzzzz").toString());
        //System.out.println("\"Second\" removed: " + sll.toJson());
        
        // Delete by value when there's only one node in the list
        sll.deleteByValue("Zzzzzzzzz");
        System.out.println("\"Zzzzzzzzz\" removed: " + sll.toJson());
        
        */
        
        sll.insertLast("Last");
        sll.insertFirst("First");
        System.out.println(sll.toJson());
        
        sll.deleteByValue("Last");
        System.out.println(sll.toJson());
    }
}
