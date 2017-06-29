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
public class CircularLinkedList<T> {
    private Node first;
    private Node last;
    
    public boolean isEmpty(){
        return (first == null);
    }
    
    public boolean hasOnlyOneNode(){
        return (!this.isEmpty() && first.getNextNode() == null);
    }
    
    // The constructor is overloaded for T of type Node
    // So @param value can be of Node type included
    public void insertFirst(T value){
        if(this.isEmpty()) first = last = new Node (value);
        else {
            Node temp = first;
            first = new Node(value, temp);
        }
    }
    
    public void deleteFirst(){
        // In garbage collector we trust
        if (!this.isEmpty()) first = first.getNextNode();
    }
    
    // The constructor is overloaded for T of type Node
    // So @param value can be of Node type included
    public void insertLast(T value){
        Node newLast = new Node(value);
        
        // Moved "last" updating to deleteLast() method
        //if (last == null) last = getLastNode();
        
        if (!this.isEmpty()) last.setNextNode(newLast);
        else first = newLast;
        
        last = newLast;
    }
    
    public void deleteLast(){
        // In garbage collector we trust
        if (!this.isEmpty() && !this.hasOnlyOneNode()) getBeforeLastNode().setNextNode(null);
        if (this.hasOnlyOneNode()) first = null;
        last = getLastNode();
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