package ds.programs;
import java.util.Random;

public class TestQueue 
{

	public static void main(String[] args) throws Exception 
	{
        Queue queue = new Queue(10);
        Random randomIntegers = new Random(10);
        for (int i = 0; i < 5; i++)
        {
            queue.EnQueue(randomIntegers.nextInt(20));
        }
        queue.Display();
        queue.DeQueue();
        queue.Display();
        queue.EnQueue(25);
        queue.Display();
	}

}
