/*
 * To run tg=his program in eclipse set the arguments:
 * right click on project in packge explorer and follow the link
 * project-> properties -> Run/Debug settings -> select the class (StringToIntegerConversion)
 * -> click edit -> select arguments tab 
 * specify two integer numbers separated by a blank space
 * 
 * */

package basic.java.programs;

public class StringToIntegerConversion 
{
	public static void main(String[] args)
	{
		
		// Declaring three integer variables
        int number1; // stores the first number
        int number2; // stores the second number
        int sum = 0; // stores the sum of number1 and number2

      
        /* initializing 
         * Reading the input from the console usifng command line arguments
         * using Integer.parseInt(...) to convert string input to integer type
        */
        number1 = Integer.parseInt(args[0]);
      
        number2 = Integer.parseInt(args[1]);
        sum = number1 + number2; // using + operator to add two numbers
        System.out.println("Sum: " + sum); // writes the output to the sccreen
	}

}
