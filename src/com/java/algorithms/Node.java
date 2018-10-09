package com.java.algorithms;

public class Node {
//    not using access modifiers so that we can access them in the Main app?

//    using a recursive instance class
    public int data;
    public Node next = null;
    public Node previous;

    public void displayNode(){
        System.out.println("{ " + data + " } ");
    }
}
