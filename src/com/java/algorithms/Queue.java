package com.java.algorithms;

public class Queue {
    private int maxSize; //initializes set number of slots
    private long[] queueArr; //slots to main the data
    private int front; //index position for the element in the front
    private int rear; //this is index position for element at back
    private int nItems; //counter to maintain the number of items in queue

    public Queue(int size){
        this.maxSize = size;
        this.queueArr = new long[size];
        front = 0; //index of first position
        rear = -1; //no item in array yet ot be considered as last item.
        nItems = 0; //we dont have elements in array yet
    }
    public void insert(long j){
        if(rear == maxSize -1){ //rear is at the end of the array. Circular Queue with overwrite.
            rear = -1;
        }
        rear++;
        queueArr[rear] = j;
        nItems++;
    }
    public long remove(){ //remove from the front
        long temp = queueArr[front];
        front ++;
        if(front == maxSize){
            front = 0; //set front back to 0th index to utilize entire array
        }
        nItems --;
        return temp;
    }
    public long peakFront(){
        return queueArr[front];
    }
    public boolean isEmpty(){
        return (nItems == 0);
    }
    public boolean isFull(){
        return (nItems == maxSize);
    }

    public void view(){
        System.out.println("[ ");
        for(int i =0; i<queueArr.length; i++){
            System.out.println(queueArr[i] + " ");
        }
        System.out.println("]");
    }
}
