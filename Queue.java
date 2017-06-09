package ds.programs;

public class Queue
{
    int queueSize;
    int[] queueElements;
    int front;
    int rear;
   public int getQueSize()
   { 
	   return queueSize; 
   }
    
    public Queue()
    {
        queueSize = 5;
        queueElements = new int[queueSize];
        front = -1;
        rear = -1;
    }
    public Queue(int queueSize)
    {
        this.queueSize = queueSize;
        queueElements = new int[queueSize];
        front = -1;
        rear = -1;
    }
    public boolean EnQueue(int element)
    {
        if (rear == queueSize - 1)
        {
            return false;
        }
        else if (front == -1)
        {
            front = 0;
            rear++;
            queueElements[rear] = element;
            return true;
        }
        else
        {
            rear++;
            queueElements[rear] = element;
            return true;
        }
    }
    public int DeQueue()throws Exception
    {
        if (front == -1)
        {
            throw new Exception("Queue is empty.");
        }
        else
        {
            int temp = queueElements[front];
            front++;
            return temp;
        }
    }
    public void Display()
    {
        System.out.println("\nQueue: ");
        for (int i = front; i <= rear; i++)
        {
        	System.out.println(queueElements[i]+ " ");
        }
    }     
}