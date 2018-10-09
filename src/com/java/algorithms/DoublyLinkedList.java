package com.java.algorithms;

public class DoublyLinkedList {
    private Node first;
    private Node last;

    public DoublyLinkedList(){
        this.first = null;
        this.last = null;
    }
    public boolean isEmpty(){
        return first == null;
    }
    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty()){
            last = newNode; //if empty, last willrefer to the new Node being created
        }else{
            first.previous = newNode;
        }
        newNode.next = first; //new nodes next field will point ot the old first
        this.first = newNode;
    }

    public void insertLast(int data){
        Node newNode = new Node();
        newNode.data = data;

        if(!isEmpty()){
            last.next = newNode; //assigning old last to new node
            newNode.previous = last; //old last will be the new nodes preiouvs
        }else{
            first = newNode;
        }
        last = newNode; //linkedLIsts last field should point to the new node
    }

    //assume non-empty list
    public Node deleteFirst(){
        Node temp = first;
        if(first.next == null){ //only one item in the list
            last = null;
        }else{
            first.next.previous = null; //cut off the previous connex
        }
        first = first.next; //assign reference of node following old first node to first field in linked list obj
        return temp; //return the deleted old first node
    }

    //assume non-empty list
    public Node deleteLast(){
        Node temp = last;
        if(first.next == null){ //only have one node, delete the first one
            first = null;
        }else{
            last.previous.next  = null; //last node's previous node's next field to null
        }
        last = last.previous;
        return temp;
    }
    //assume a non-empty list
    public boolean insertAfter(int key, int data){

        Node current = first; //start from beg
        while(current.data != key){
            current = current.next;
            if(current == null){//end of list
                return false;
            }
        }
        Node newNode = new Node();
        newNode.data = data;
        if(current ==last){
            current.next = null;
            last = newNode;
        }else{
            newNode.next = current.next; //new nodes next field should point to node ahead of current one
            current.next.previous = newNode; //node ahead of current, its previous field should point to new one.
        }
        newNode.previous = current;
        current.next = newNode;
        return true;
    }
    //assume non empty list
    public Node deleteKey(int key){
        Node current = first;
        while(current.data != key){
            current = current.next;
            if(current == null){
                return null;
            }
        }
        if(current == first){
            first = current.next;
        }else{
            current.previous.next = current.next; //change the connection dont nulify
        }
        if(current == last){
            last = current.previous;
        }else{
            current.next.previous = current.previous;
        }
        return current;
    }
    public void displayForward(){
        System.out.println("List (first --> last): ");
        Node current = first;
        while(current != null){
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }
    public void displayBackward(){
        System.out.println("List (last --> first): ");
        Node current = last;
        while(current != null){
            current.displayNode();
            current = current.previous;
        }
        System.out.println();
    }
}