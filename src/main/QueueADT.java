package main;

public class QueueADT
{

	int[] queue = new int[10];
	int front = -1;
	int rear = -1;
	int size = queue.length;

	void enqueue(int value)
	{

	}

	int dequeue()
	{
		int deleted = 0;
		//checking whether the
		if(isEmpty())
		{
		System.out.print("The Stack in Empty ");
		}
		else
		{
		deleted=queue[0];
		for (int i=0; i<queue.length; i++)
		{
			queue[i]=queue[i+1];
		}
		queue[(queue.length)-1]= Integer.parseInt(null);
		}



		return deleted;
	}

	int peek()
	{
		int item = 0;

		return item;
	}

	int size()
	{
		int size = 0;

		return size;
	}

	boolean isEmpty()
	{
		return false;
	}

	boolean isFull()
	{
		return false;
	}

}
