package com.java.algorithms;

public class Main {

    public static void main(String[] args) {
//        Stack theStack = new Stack(3);
//        theStack.push(20);
//        theStack.push(40);
//        theStack.push(60);
//        theStack.push(80);

//        while( !theStack.isEmpty() ){
//            long value = theStack.pop();
//            System.out.println("value = " + value);
//        }
//        String reversed = reverseString("hello");
//        System.out.println(reversed);

//      Queues
//        Queue myQueue = new Queue(5);
//        myQueue.insert(1);
//        myQueue.insert(2);
//        myQueue.insert(3);
//        myQueue.insert(6);
//        myQueue.view();

//        Nodes
//        Node nodeA = new Node();
//        nodeA.data = 5;
//        Node nodeB = new Node();
//        nodeB.data = 3;
//        Node nodeC = new Node();
//        nodeC.data = 7;
//        Node nodeD = new Node();
//        nodeD.data = 10;
//
//        nodeA.next = nodeB;
//        nodeB.next = nodeC;
//        nodeC.next = nodeD;
//
//        System.out.println(listLength(nodeA)); //returns 4
//        System.out.println(listLength(nodeB)); //returns 3

//        Singly linked list
//        SinglyLinkedList myList = new SinglyLinkedList();
//        myList.insertFirst(50);
//        myList.insertFirst(50);
//        myList.insertFirst(150);
//        myList.insertFirst(50);
//        myList.insertFirst(200);
//        myList.insertFirst(300);
//        myList.insertLast(100000);
//
//        myList.displayList();
//
//        CircularLinkedList myList = new CircularLinkedList();
//        myList.insertFirst(50);
//        myList.insertFirst(50);
//        myList.insertFirst(150);
//        myList.insertFirst(50);
//        myList.insertFirst(200);
//        myList.insertFirst(300);
//        myList.insertLast(100000);

//        Did not copy all the methods for testing doubly linked lists

    }
    public static int listLength(Node node){ //must be static so we don't need to create an instance of the object
        int counter = 0;
        while(node != null){
            counter ++;
            node = node.next;
        }
        return counter;
    }

    public static String reverseString(String str){
        int stackSize = str.length(); //max stack size
        Stack theStack = new Stack(stackSize);
        for(int j = 0; j< str.length(); j++){
            char ch = str.charAt(j); //get a char from input string
            theStack.push(ch);
        }
        String result = "";
        while(!theStack.isEmpty()){
            char ch = theStack.pop();
            result = result + ch; //append result
        }
        return result;
    }
}
