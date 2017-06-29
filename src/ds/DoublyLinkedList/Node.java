/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.DoublyLinkedList;

/**
 *
 * @author fillipemontenegro
 * @param <T>
 */
public class Node<T> {
    
    private T value;
    private Node nextNode;
    private Node previousNode;
    
    public Node(){
        
    }
    
    public Node(T value) {
        this.value = (T) value;
    }
    
    public Node(Node node) {
        this.value = (T) node.value;
    }
    
    public Node(T value, Node previousNode, Node nextNode) {
        this.value = (T) value;
        this.previousNode = previousNode;
        this.nextNode = nextNode;
    }
    
    public Node(Node node, Node previousNode, Node nextNode) {
        this.value = (T) node.value;
        this.previousNode = previousNode;
        this.nextNode = nextNode;
    }
    
    @Override
    public String toString(){
        return (String) this.value;
    }
    
    public T getValue() {
        return this.value;
    }
    
    public Node getNextNode(){
        return this.nextNode;
    }
    
    public void setNextNode(Node node){
        this.nextNode = node;
    }
    
    public Node getPreviousNode(){
        return this.previousNode;
    }
    
    public void setPreviousNode(Node node){
        this.previousNode = node;
    }
}
