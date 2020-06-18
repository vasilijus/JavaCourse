package com.thirdprogram.collectionsdemo;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String [] args) {
		QueueDemo demo = new QueueDemo();
		Queue queue = demo.createQueueForDemo();
		demo.printQueueForDemo(queue);
	}
	
	private Queue createQueueForDemo() {
		PriorityQueue<Integer> queueOfInt = new PriorityQueue<>();
		queueOfInt.add(100);
		queueOfInt.add(50);
		queueOfInt.add(200);
		return queueOfInt;
	}
	
	private void printQueueForDemo(Queue queue) {
		System.out.println("retrieve head of the list "+ queue.peek());
		System.out.println("retrieve & remove head of the list-1 st attempt: "+ queue.poll());
		System.out.println("retrieve & remove head of the list-2 st attempt: \""+ queue.poll());
	}
}
