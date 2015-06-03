package listas;

/**
* Lista Circular
* @author https://github.com/derrickcodes/SLinkedCircularList
*/
public class ListaCircular
{
	
	private Node firstNode;			
	private Node lastNode;			
	private int length;				
	
	public ListaCircular()
	{
		clear();
	} 

	public boolean add(Object newEntry)
	{
		Node newNode = new Node(newEntry);
		
		if (isEmpty())
		{	
			firstNode = newNode;
			lastNode = newNode;
			firstNode.next = newNode;	
			lastNode.next = newNode;	
		}
		else
		{
			Node currLast = lastNode;	
			currLast.next = newNode;	
			newNode.next = firstNode;	
			lastNode = newNode;			
		} 
		
		length++;	
		return true;
	} 
	
	public boolean add(int newPosition, Object newEntry)
	{
		boolean isSuccessful = true;
		
		if ((newPosition >= 1) && (newPosition <= length + 1))
		{
			Node newNode = new Node(newEntry);
			
			if (isEmpty())
			{
				firstNode = newNode;
				lastNode = newNode;
				firstNode.next = newNode;	
				lastNode.next = newNode;	
			}
			else if (newPosition == 1)
			{
				newNode.next = firstNode;	
				firstNode = newNode;		
				lastNode.next = firstNode;	
			}
			else if (newPosition == length + 1) 
			{
				lastNode.next = newNode;	 
				lastNode = newNode;
				lastNode.next = firstNode;
			} 
			else
			{
				Node nodeBefore = getNodeAt(newPosition -1);
				Node nodeAfter = nodeBefore.next;
				newNode.next = nodeAfter;
				nodeBefore.next = newNode;
			} 
			
			length++;
		}
		else
		{
			isSuccessful = false;
		}
		
		return isSuccessful;
	} 

	public Object remove(int givenPosition)
	{
		Object result = null; 				
		
		if (!isEmpty() && (givenPosition >= 1) && (givenPosition <= length))
		{
			if (givenPosition == 1)
			{
				result = firstNode.data;
				firstNode = firstNode.next;
				lastNode.next = firstNode;
				if (length == 1)
				{
					lastNode = null;		
				} 
			} 
			else
			{
				Node nodeBefore = getNodeAt(givenPosition -1);
				Node nodeToRemove = nodeBefore.next;
				Node nodeAfter = nodeToRemove.next;
				nodeBefore.next = nodeAfter; 	
				result = nodeToRemove.data;		
				if (givenPosition == length)
				{
					lastNode = nodeBefore;		
					lastNode.next = firstNode;
				} 
			} 
			
			length--;
		} 
		
		return result;
	} 

	public final void clear()
	{
		firstNode = null;
		lastNode = null;
		length = 0;
	} 

	public boolean replace(int givenPosition, Object newEntry)
	{
		boolean isSuccessful = true;
		
		if (!isEmpty() && (givenPosition >=1) && (givenPosition <= length))
		{
			Node desiredNode = getNodeAt(givenPosition);
			desiredNode.data = newEntry;
		}
		else
		{
			isSuccessful = false;
		}
		return isSuccessful;
	} 

	public Object getEntry(int givenPosition)
	{
		Object result = null;	
		
		if (!isEmpty() && (givenPosition >= 1) && (givenPosition <= length))
			result = getNodeAt(givenPosition).data;
		
		return result;
	} 
	public boolean contains(Object anEntry)
	{
		boolean found = false;
		Node currentNode = firstNode;
		do
		{
			if (anEntry.equals(currentNode.data))
				found = true;
			else
				currentNode = currentNode.next;
		} while (!found && (currentNode != lastNode));
		
		return found;
	} 

	public int getLength() {
		return length;
	}

	/**
	 * 
	 */
	public boolean isEmpty()
	{
		return length == 0;
	}

	
	public boolean isFull() {
		return false;
	}

	
	public void display()
	{
		Node currentNode = firstNode;
		
		do
		{
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		} while (currentNode != firstNode);
	} 
	
	private Node getNodeAt(int givenPosition)
	{
		Node currentNode = firstNode;
		
		
		for (int counter = 1; counter < givenPosition; counter++)
			currentNode = currentNode.next;
		
		return currentNode;
	} 

	private class Node		
	{
		private Object data;		
		private Node next;			
		
		private Node(Object dataPortion)
		{
			data = dataPortion;
			next = null;
		} 
		
		private Node(Object dataPortion, Node nextNode)
		{
			data = dataPortion;
			next = nextNode;
		} 
	} 
	
}