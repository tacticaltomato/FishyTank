package capitalGains;

import interfaces.QueueInterface;
 

public class Queue<T> implements QueueInterface<T> {
	private int count;
	private LinearNode<T> front, rear;
	
	public Queue() {
		count = 0;
		front = rear = null;
	}
	
	public T dequeue() throws IllegalStateException {
		if (isEmpty())
			throw new IllegalStateException ("queue empty");
		T result = front.getElement();
		front = front.getNext();
		count--;
		if (isEmpty())
			rear = null;
		return result;
	}
	
	public T peek() { 
		if (isEmpty())
			throw new IllegalStateException ("queue empty");
		T result = front.getElement();
		return result;
	}
	
	
	public QueueInterface<T> enqueue(T elem) {
		if (elem == null)
			throw new NullPointerException ("queue empty");
		LinearNode<T> node = new LinearNode<T> (elem);
		if (isEmpty())
			front = node;
		else
			rear.setNext (node);
		rear = node;
		count++;
		return this;
	}
	
	
	public boolean isEmpty() {
		if (count == 0)
			return true;
		else
			return false;
	}
	
	public int size() {
		return count;
	}
	
	
	public String toString() {
		String result = "[";
		LinearNode<T> temp = front;
		
		while (temp != null) {
			if (temp == rear) {
				result += temp.getElement();
			} else {
				result += temp.getElement() + ", ";
			}
			temp = temp.getNext();
		}
		
		result += "]";
		return result;
	}
	
	
}
