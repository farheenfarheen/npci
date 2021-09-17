package dsalgo;
import java.util.ArrayList;

public class circular {

	int size;
	private ArrayList<Integer> items = new ArrayList<Integer>();
	int front,rear;
	circular(int size)
	{
		this.size=size;
		this.front=-1;
		this.rear=-1;
		
	}
	public void enQueue(int data)
	{
	     
	    // Condition if queue is full.
	    if(isFull())
	    {
	        System.out.print("Queue is Full");
	    }
	 
	    
	    else if(isEmpty())
	    {
	        front = 0;
	        rear = 0;
	        items.add(rear, data);
	    }
	 
	    else if(rear == size - 1 && front != 0)
	    {
	        rear = 0;
	        items.set(rear, data);
	    }
	 
	    else
	    {
	        rear = (rear + 1);
	     	        if(front <= rear)
	        {
	            items.add(rear, data);
	        }
	     
	        
	        else
	        {
	            items.set(rear, data);
	        }
	    }
	}
	public int deQueue()
	{
	    int temp;
	 
	    
	    if(isEmpty())
	    {
	        System.out.print("Queue is Empty");
	         
	        
	        return -1;
	    }
	 
	    temp =items.get(front);
	 
	    // Condition for only one element
	    if(front == rear)
	    {
	        front = -1;
	        rear = -1;
	    }
	 
	    else if(front == size - 1)
	    {
	        front = 0;
	    }
	    else
	    {
	        front = front + 1;
	    }
	     
	   
	    return temp;
	}
	boolean isFull()
	{
		if((front == 0 && rear == size - 1) ||
			      (rear == (front - 1) % (size - 1)))
		{
			return true;
		}
		return false;
	}
	boolean isEmpty()
	{
		if(front==-1)
		{
			return true;
		}
		return false;
	}
	void print()
	{
		if(isEmpty())
		{
			System.out.print("empty queue");
		}
		 if(rear >= front)
		    {
		     
		        // Loop to print elements from
		        // front to rear.
		        for(int i = front; i <= rear; i++)
		        {
		            System.out.print(items.get(i));
		            System.out.print(" ");
		        }
		        System.out.println();
		    }
		 else
		 {
			 for(int i = front; i < size; i++)
		        {
		            System.out.print(items.get(i));
		            System.out.print(" ");
		        }
			 
		 }
	}
	
	
}
