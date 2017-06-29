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
public class DoublyLinkedList<T> {
    private Node first;
    private Node last;
    
    public boolean isEmpty(){
        return first == null;
    }
    
    public boolean hasOnlyOneNode(){
        return (!this.isEmpty() && first.getNextNode() == null);
    }
    
    // The constructor is overloaded for T of type Node
    // So @param value can be of Node type included
    public void insertFirst(T value){
        if(this.isEmpty()) first = last = new Node (value);
        else {
            Node newSecondNode = first;
            first = new Node(value, null, newSecondNode);
            newSecondNode.setPreviousNode(first);
        }
    }
    
    public void deleteFirst(){
        // In garbage collector we trust
        if (!this.isEmpty() && !this.hasOnlyOneNode()) {
            first = first.getNextNode();
            first.setPreviousNode(null);
        }
        if (this.hasOnlyOneNode()) first = last = null;
    }
    
    // The constructor is overloaded for T of type Node
    // So @param value can be of Node type included
    public void insertLast(T value){
        Node newLast = new Node(value);
        
        if (!this.isEmpty()) {
            last.setNextNode(newLast);
            newLast.setPreviousNode(last);
        }
        else first = newLast;
        
        last = newLast;
    }
    
    public void deleteLast(){
        // In garbage collector we trust
        if (!this.isEmpty() && !this.hasOnlyOneNode()) {
            last.getPreviousNode().setNextNode(null);
            last = last.getPreviousNode();
        }
        if (this.hasOnlyOneNode()) first = last = null;
    }
    
    // Change type of node from Node to T ? Overload the method
    public boolean insertAfter(Node node, T value) {
        if (node == null) return false;
        
        Node newNode = new Node(value, node, null);
        
        // Even if node is the last, node.getNextNode() will return null, which is an acceptable param for setNextNode()
        // This way I don't need to create a temporary instance (copy) of node (i.e Node oldNode = node;)
        newNode.setNextNode(node.getNextNode());
        node.setNextNode(newNode);
        
        if (node == last) {
            last = newNode;
            return true;
        }
        
        newNode.getNextNode().setPreviousNode(newNode);
        return true;
    }
    
    public boolean deleteByValue(T value) {
        if (this.isEmpty()) return false;
        
        // Try and find the Node
        Node curr = first;
        while (curr.getValue() != value) {
            curr = curr.getNextNode();
            if (curr == null) return false;
        }
        
        //Now delete if found
        
        if (this.hasOnlyOneNode()) {
            first = last = null;
            return true;
        }
        
        if (curr == first) {
            //deleteFirst();
            first = first.getNextNode();
            first.setPreviousNode(null);
            return true;
        }
        
        if (curr == last) {
            //deleteLast();
            last = last.getPreviousNode();
            last.setNextNode(null);
            return true;
        }
        
        curr.getPreviousNode().setNextNode(curr.getNextNode());
        curr.getNextNode().setPreviousNode(curr.getPreviousNode());
        
        // Do I need to remove curr's nextNode and previousNode properties or is the above enough for garbage collection?
        //curr.setNextNode(null);
        //curr.setPreviousNode(null);
        
        return true;
    }
    
    public Node getFirstByValue(T value) {
        
        if (this.isEmpty()) return null;
        
        Node curr = first;
        while (curr.getValue() != value) {
            curr = curr.getNextNode();
            if (curr == null) return null;
        }
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