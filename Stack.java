package ds.programs;

public class Stack 
{	
    int stackSize;
    int[] stackElements;
    int index;
    public Stack()
    {
        stackSize = 5;
        stackElements = new int[stackSize];
        index = -1;
    }
    public Stack(int stackSize)
    {
        this.stackSize = stackSize;
        stackElements = new int[stackSize];
        index = -1;
    }
    public boolean Push(int element)
    {
        throw new UnsupportedOperationException();
    }
    public int Pop()
    {
    	throw new UnsupportedOperationException();
    }
    public int Peek()
    {
    	throw new UnsupportedOperationException();
    }
    public static void main(String [] args)
    {
    	
    }
}

