package com.apex.session.advanced.assignment;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class ImplementPriorityQueue10 {

	public static void main(String[] args) {

		// Implementation of min heap
		PriorityQueue<Integer> minheap = new PriorityQueue<>();
		minheap.add(20);
		minheap.add(10);
		minheap.add(15);
		minheap.add(25);
		minheap.add(30);
		minheap.add(45);
		minheap.add(40);
		
		Iterator<Integer> itr=minheap.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("-------------");
		
		System.out.println("top element is "+ minheap.peek());
		
		System.out.println("---------------");
		
		minheap.remove(40);
		
		while (!minheap.isEmpty()) {
			System.out.println(minheap.poll());
		}
		
		
		System.out.println("---------------");

		// Implementation of max heap
		PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
		maxheap.add(20);
		maxheap.add(10);
		maxheap.add(15);
		maxheap.add(25);
		maxheap.add(30);
		maxheap.add(45);
		maxheap.add(40);
		
		
		while (!maxheap.isEmpty()) {
			System.out.println(maxheap.poll());
		}


	}

}
