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
        //How to test the binary search function with a given array and index.
//        System.out.println(binarySearch(new int[] {1,2,3,4,7,9,12,18}, 12));
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



//    SEARCH ALGORITHM SECTION
//    class method instead of instance method
    public static int linearSearch(int[] a, int x){
//        O(n)
        for(int i = 0; i < a.length; i++){
            if(a[i] == x){
               return i;
            }
        }
        return -1;
    }
// BINARY SEARCH GOOD FOR SORTED ARRAYS

    public static int binarySearch(int[] a, int x){
        //set your start and last variables to keep track of the range
        int p = 0;
        int r = a.length -1;
        while(p <= r){
            int q = (p + r)/2;
            if(x < a[q]) r = q-1;
            else if (x > a[q]) p = q+1;
            else return q;
        }
        return -1;
    }

//    Recursion

}
