package jp.co.wap.exam;

import java.util.NoSuchElementException;

/*
 * Author: Abhas Mittal
 * B.Tech. Pulp and Paper Engineering, 3rd Year
 * IIT Roorkee
 */

public class PersistentQueue<E> {

	@SuppressWarnings("hiding")
	private class node<E> {
		private E e;
		private node<E> next;
		
		public node() {
			e = null;
			next = null;
		}
	}
	
	@SuppressWarnings("hiding")
	private class stack<E> {
		private node<E> top;
		private int n;
		
		public stack(){
			top = null;
			n = 0;
		}
		
		private stack(node<E> top, int n) {
			this.top = top;
			this.n = n;
		}
		
		
		/**
		 * Pushes one object on top of stack without changing the stack.
		 * Returns a new stack which shares common objects with the pre-existing stack.
		 * Thus, cost of copying is saved.
		 */
		public stack<E> push(E e){
			if (e == null)
				throw new IllegalArgumentException();
			
			node<E> temp = new node<E>();
			temp.e = e;
			temp.next = top;
			
			return new stack<E>(temp, n+1);
		}
		
		
		/**
		 * Removes one object from top of stack without changing the stack.
		 * Returns a new stack which shares common objects with the pre-existing stack.
		 * Thus, cost of copying is saved.*/
		
		public stack<E> pop(){
			if(n == 0)
			   throw new NoSuchElementException();
			
			return new stack<E>(top.next, n - 1);			
		}
		
		
		/**
		 * Returns the value at top of stack.
		 */
		
		public E peek() {
			if(n == 0)
			   throw new NoSuchElementException();
			
			return top.e;
		}
		
		
		/**
		 * Returns the size of stack.
		 */
		
		public int size() {
			return n;
		}
		
		
		/**
		 * reverse the stack and returns the new stack.
		 */
		public stack<E> reverse(){
			stack<E> newstack = new stack<E>();
			node<E> temp = top;
			
			while(temp != null){
				newstack = newstack.push(temp.e);
				temp = temp.next;
			}
			
			return newstack;
		}
	}	
	
	
	/** The immutable queue has been represented by two immutable stacks constructed above.
	 * 'input' stack holds incoming values ('enqueue' operation).
	 * 'output' stack removes values on demand ('dequeue' operation).
	 * These operations take place without any change to stack. Thus, the queue represented by
	 * them does not change too, and hence, remains immutable.
	 * Due to sharing of common nodes, queue operations are fast.
	 * 
	 */
	
	private stack<E> input;
	private stack<E> output;
	private int n;
	
	public PersistentQueue(){		
		input = new stack<E>();
		output = new stack<E>();
		n = 0;
	}
	
	private PersistentQueue(stack<E> input, stack<E> output, int n) {
		this.input = input;
		this.output = output;
		this.n = n;
	}
	
	
	/**
	 * Returns the queue that adds an item into the tail of the queue
	 */
	public PersistentQueue<E> enqueue(E e) {
		if (e == null)
			throw new IllegalArgumentException();
		
		return new PersistentQueue<E>(input.push(e), output, n + 1);
	}

	/**
	 * Returns the queue that removes the object at the head of the queue
	 */
	public PersistentQueue<E> dequeue() {
		if (n == 0)
			throw new NoSuchElementException();
		
		if(output.size() > 0)
			return new PersistentQueue<E>(input, output.pop(), n - 1);
		else
			return new PersistentQueue<E>(output, input.reverse().pop(), n - 1);
	}
	
	/**
	 * Looks at the object which is the head of this queue without removing it from the queue.
	 */
	public E peek() {
		if (n == 0)
			throw new NoSuchElementException();
		
		if(output.size() > 0)
			return output.peek();
		else
			return new PersistentQueue<E>(output, input.reverse(), n).peek();
	}
	
	/**
	 * Returns the number of objects in the queue
	 */
	public int size() {
		return n;
	}
}