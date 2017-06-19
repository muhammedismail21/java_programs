
public class Node 
{
	int value;
	Node nextNode;
	Node prevNode;
	public Node() 
	{
		nextNode = null;
		prevNode = null;
	}
	public int getValue() 
	{
		return value;
	}
	public void setValue(int value) 
	{
		this.value = value;
	}
	public Node getNextNode() 
	{
		return nextNode;
	}
	public void setNextNode(Node nextNode) 
	{
		this.nextNode = nextNode;
	}
	public Node getPrevNode() 
	{
		return prevNode;
	}
	public void setPrevNode(Node prevNode) 
	{
		this.prevNode = prevNode;
	}
}
