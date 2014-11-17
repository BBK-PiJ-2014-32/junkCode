public interface TestQueue {

/**
* Adds another person to the queue.
*/
	void insert(IntegerNode newNode);

/**
* Removes a person from the queue.
*/
	public IntegerNode retrieve();
}