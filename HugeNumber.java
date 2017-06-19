
public class HugeNumber 
{
	int carry;
	int count;
	Node newNode;
	Node start;
	Node end;
	Node current;
	
	public HugeNumber() 
	{
		carry = 0;
		count = 0;
		start = null;
		end = null;
		current = null;
		//newNode = new Node();
	}
	
	public int getCarry() 
	{
		return carry;
	}
	public void setCarry(int carry) 
	{
		this.carry = carry;
	}
	public Node getStart() 
	{
		return start;
	}
	public void setStart(Node start) 
	{
		this.start = start;
	}
	public Node getEnd() 
	{
		return end;
	}
	public void setEnd(Node end) 
	{
		this.end = end;
	}
	public void addDidit(int value)
	{		
		newNode = new Node();
		newNode.value = value;
		
		if(start == null)
		{
			start = newNode;
			end = newNode;
		}
		else
		{
			newNode.prevNode = end;
			end.nextNode = newNode;
			end = newNode;
		}
		count++;
		
	}
	public void removeDigit()
	{
		if(start.nextNode == null)
		{
			start = null;
			end = null;
		}
		else
		{
			end = end.prevNode;
			end.nextNode = null;
		}
		count--;
	}
	public HugeNumber addNumbers(HugeNumber number1, HugeNumber number2)
	{
		int _sum = 0;
		HugeNumber sum = new HugeNumber();
		
		int difference = 0 ;
		if(number1.count > number2.count)
		{
			difference = number1.count - number2.count;
			for(int i = difference; i >= 1; i--)
			{
				number2.newNode = new Node();
				number2.newNode.value = 0;
				number2.start.prevNode = number2.newNode;
				number2.newNode.nextNode = number2.start;
				number2.start = number2.newNode;
				number2.count++;
			}
		}		
		else
		{
			difference = number2.count - number1.count;
			for(int i = difference; i >= 1; i--)
			{
				number1.newNode = new Node();
				number1.newNode.value = 0;
				number1.start.prevNode = number1.newNode;
				number1.newNode.nextNode = number1.start;
				number1.start = number1.newNode;
				number1.count++;
			}
		}			
		
		number1.current = number1.end;
		number2.current = number2.end;
		carry = 0;
		
		
		while(number1.current != null)
		{
			_sum = number1.current.value + number2.current.value + carry;
			
			if(_sum > 9)
			{
				carry = 1;				
			}
			else
			{
				carry = 0;
			}
			sum.newNode = new Node();
			sum.newNode.value = _sum % 10;
			if(sum.start == null)
			{
				sum.start = sum.newNode;
				sum.end = sum.newNode;
			}
			else
			{				
				sum.start.prevNode = sum.newNode;
				sum.newNode.nextNode = sum.start;
				sum.start = sum.newNode;
			}						
			
			number1.current = number1.current.prevNode;
			number2.current = number2.current.prevNode;
		}
		
	       if (carry == 1)
	        {
	            sum.newNode = new Node();
	            sum.newNode.value = 1;
	            sum.start.prevNode = sum.newNode;
	            sum.newNode.nextNode = sum.start;
	            sum.start = sum.newNode;
	        }
		
		return sum;
	}
}















