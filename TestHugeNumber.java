
public class TestHugeNumber {

	public static void main(String[] args) 
	{
		HugeNumber num1 = new HugeNumber();
		HugeNumber num2 = new HugeNumber();
		
		
		num1.addDidit(1);
		num1.addDidit(2);
		num1.addDidit(7);
		num1.addDidit(5);
		num1.addDidit(9);
		
		num2.addDidit(9);
		num2.addDidit(8);
		num2.addDidit(9);
		
		HugeNumber res = new HugeNumber();
		res = res.addNumbers(num1, num2);	
		
		num1.current = num1.start;
		num2.current = num2.start;
		
		while(num1.current != null)
		{						
			System.out.print(num1.current.value);
			num1.current = num1.current.nextNode;
		}
		System.out.println();
		while(num2.current != null)
		{						
			System.out.print(num2.current.value);
			num2.current = num2.current.nextNode;
		}
	
		System.out.println("\n---");
	
		res.current = res.start;
		
		while(res.current != null)
		{						
			System.out.print(res.current.value);
			res.current = res.current.nextNode;
		}
		
	}

}
