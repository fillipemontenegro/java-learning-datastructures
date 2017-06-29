/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.singlylinkedlist;

/**
 *
 * @author fillipemontenegro
 */
public class SinglyLinkedList<T> {
    private Node first;
    
    public SinglyLinkedList(){
        
    }
    
    public boolean isEmpty(){
        return (first == null);
    }
    
    public boolean hasOnlyOneNode(){
        return (!this.isEmpty() && first.getNextNode() == null);
    }
    
    // The constructor is overloaded for T of type Node
    // So @param value can be of Node type included
    public void insertFirst(T value){
        Node temp = first;
        first = new Node(value, temp);
    }
    
    public void deleteFirst(){
        // In garbage collector we trust
        if (!this.isEmpty()) first = first.getNextNode();
    }
    
    // The constructor is overloaded for T of type Node
    // So @param value can be of Node type included
    public void insertLast(T value){
        if (!this.isEmpty()) getLastNode().setNextNode(new Node(value));
        else first = new Node(value);
    }
    
    public void deleteLast(){
        // In garbage collector we trust
        if (!this.isEmpty() && !this.hasOnlyOneNode()) getBeforeLastNode().setNextNode(null);
        if (this.hasOnlyOneNode()) first = null;
    }
    
    public Node getLastNode(){
        if (this.isEmpty()) return null;
        
        Node curr = first;
        while(curr.getNextNode() != null) curr = curr.getNextNode();
        return curr;
    }
    
    public Node getBeforeLastNode(){
        if (this.isEmpty() || this.hasOnlyOneNode()) return null;
        
        Node curr = first;
        while(curr.getNextNode().getNextNode() != null) curr = curr.getNextNode();
        return curr;
    }
    
    public String toJson(){
        
        if (this.isEmpty()) return "null";
        if (this.hasOnlyOneNode()) return "{\"" + first.getValue() + "\", {\"length\": 1}}";
        
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        Node curr = first;
        int counter = 0;
        while(curr != null) {
            sb.append("\"");
            sb.append(curr.getValue());
            sb.append("\", ");
            curr = curr.getNextNode();
            counter++;
        }
        sb.append("{\"length\": ");
        sb.append(counter);
        sb.append("}}");
        
        
        return sb.toString();
    }
}