package zohirul_Alom;

import java.util.Scanner;

public class LogicalEndOperator {
	
	// logical operator use to make relation between two or more function.

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		char ch;
		System.out.println("Enter Any Letter: ");
		ch = input.next().charAt(0);
		
		if(ch >='a' && ch<= 'z'){
			
			System.out.println("Small Letter");
			
		}
		else if(ch >='A' && ch <= 'Z'){
			
			System.out.println("Capital Letter");
			
		}
		else{
			System.out.println("Not A Letter");
		}

	}

}
