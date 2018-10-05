package com.java.algorithms;

public class SinglyLinkedList {
    private Node first;
    private Node last;
    public SinglyLinkedList (){

    }

    public boolean isEmpty(){
        return (first == null);
    }

    //used to insert at the begin of list
    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;

    }
    public void insertLast(int data){
        Node current = first;
        while(current.next!= null){
            current = current.next; //loop until current.next null-->reach the end
        }
        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;
    }
    public Node deleteFirst(){
        Node temp = first;
        temp = first.next;
        return temp;
    }
    public void displayList(){
        System.out.println("List (first --> last) ");
        Node current = first;
        while(current!= null){
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }
}
