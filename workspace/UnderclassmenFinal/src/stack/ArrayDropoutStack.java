package stack;

import interfaces.DropoutStackInterface;
import interfaces.StackUnderFlowException;

public class ArrayDropoutStack<T> implements DropoutStackInterface<T> {


	
	  
	  private final int DEFAULT_CAPACITY = 3;
	  private int front, count;
	  private T[] stack;
	  
	  public ArrayDropoutStack (int initialCapacity) {
	    
		  front = count = 0;
	    
		  stack = (T[]) (new Object[initialCapacity]);
	  }
	  
	  public ArrayDropoutStack()
	  {
	    
	    front = count = 0;
	    
	    
	    
	    
	    stack = (T[]) (new Object[DEFAULT_CAPACITY]);
	  }

	  @Override
	  public T pop() throws StackUnderFlowException
	  {
	    if(isEmpty()) {
	      throw new StackUnderFlowException("eres una puta");
	    }
	    
	    front--;
	    T result = stack[front];
	    stack[front] = null;
	    
	    return result;
	  }

	  @Override
	  public T top() throws StackUnderFlowException
	  {
	    if(isEmpty()) {
	      throw new StackUnderFlowException();
	    }
	    
	    return stack[front - 1];

	  }

	  @Override
	  public void push(T elem)
	  {
	    if(size() == stack.length) {
	      expandCapacity();
	    }
	    
	    stack[front] = elem;
	    count++;
	    front++;
	  }
	  
	  public void expandCapacity() {
	    T[] larger = (T[])(new Object[stack.length * 2]);
	    
	    for (int i = 0; i < stack.length; i++) {
	      larger[i] = stack[i];
	    }
	    
	    stack = larger;
	    
	    count += stack.length;
	  }

	  @Override
	  public boolean isEmpty()
	  {
	    if (front == 0) 
	    {
	    				return true;
	    } else 
	    {
	      
	    	
	    	return false;
	    }
	  }

	  @Override
	  public int size()
	  {
	    return front;
	  }

	  @Override
	  public void resize(int newCapacity)
	  {
	    T[] larger = (T[])(new Object[newCapacity]);
	    
	    for (int i = 0; i < stack.length; i++) {
	      larger[i] = stack[i];
	    }
	    
	    if(newCapacity > stack.length) {
	      for (int i = 0; i < newCapacity - stack.length; i++) {
	        T nullObject = null;
	        larger[i] = nullObject;
	        front++;
	      }
	    }
	    
	    if(newCapacity < stack.length) {
	      for (int i = 0; i < stack.length-newCapacity; i++) {
	        larger[newCapacity] = larger[newCapacity + 1];

	        count--;
	      }
	    }
	    
	    stack = larger;
	    
	    count += stack.length;
	  }
	  
//	  @Override
//		public void resize(int newCapacity)
//		{
//			T[] larger = (T[])(new Object[newCapacity]);
//			for (int index=0; index < stack.length; index++)
//			larger[index] = stack[index];
//			stack = larger;
//		}
//	  @Override
//	  public void resize(int newCapacity) {
//	 //      
//	        T[] temp = (T[]) new Object[newCapacity];
//	        for (int i = 0; i < stack.length; i++) {
//	            temp[i] = stack[i];
//	        }
//	        stack = temp;
//	}  
} 

	  
	