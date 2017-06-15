package capitalGains;


public class Stock<T> {
	

		  /** reference to next node in list */

		  private Stock<T> next;

		  /** element stored at this node */

		  private T element;

		  /**
		  * Creates an empty node.
		  */

		  public Stock() {
		    next = null;
		    element = null;
		  }

		  /**

		  * Creates a node storing the specified element.

		  * @param elem element to be stored

		  */

		  public Stock (T elem) {
		    next = null;
		    element = elem;
		  }

		  /**
		  * Returns the node that follows this one.
		  * @return Stock<T> reference to next node
		  */

		  public Stock<T> getNext() {
		    return next;
		  }

		  /**
		  * Sets the node that follows this one.
		  * @param node node to follow this one
		  */

		  public void setNext (Stock<T> node) {
		    next = node;
		  }

		  /**
		  * Returns the element stored in this node.
		  * @return T element stored at this node
		  */

		  public T getElement() {
		    return element;
		  }

		  /**
		  * Sets the element stored in this node.
		  * @param elem element to be stored at this node
		  */

		  public void setElement (T elem) {
		    element = elem;
		  }

		}

