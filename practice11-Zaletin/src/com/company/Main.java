package com.company;

public class Main {

    public static void main(String[] args) {
	Queue<Integer> queue = new Queue<>();
	queue.enqueue(1);
	queue.enqueue(2);
	queue.enqueue(3);
	System.out.println(queue.size());
	System.out.println(queue.element());
	while (!queue.isEmpty())
	    System.out.println(queue.dequeue());
    }
}
