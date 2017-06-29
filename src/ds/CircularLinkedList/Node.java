/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.CircularLinkedList;


/**
 *
 * @author fillipemontenegro
 * @param <T>
 */
public class Node<T> {
    
    private T value;
    private Node nextNode;
    
    public Node(){
        
    }
    
    public Node(T value) {
        this.value = (T) value;
        this.nextNode = null;
    }
    
    public Node(Node node) {
        this.value = (T) node.value;
        this.nextNode = null;
    }
    
    public Node(T value, Node nextNode) {
        this.value = (T) value;
        this.nextNode = nextNode;
    }
    
    public Node(Node node, Node nextNode) {
        this.value = (T) node.value;
        this.nextNode = nextNode;
    }
    
    @Override
    public String toString(){
        return (String) value;
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
}
