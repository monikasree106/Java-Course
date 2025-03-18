package Day2;

import java.util.Scanner;

public class conditionalstatement 
{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		/**
		 * 
		System.out.println("Enter your age : ");
		
		int age = sc.nextInt();
		
		// simple if , if-else 
		if(age>=18)
			System.out.println("Eligible to vote");
		else
			System.out.println("Not-Eligible to vote");
			
		*/
		
		/***
		
		//else-if ladder
		
		System.out.println("Enter ticket price : ");
		
		int price =sc.nextInt();
		
		if(price>=60 && price<=100)
		{
			System.out.println("seat from 1 to 30");
		}
		else if (price>=100 && price<=250)
		{
			System.out.println("seat from 30 to 60");
		}
		else if(price>=250 && price<=500)
		{
			System.out.println("seat from 60 to 90");
		}
		else
		{
			System.out.println("special cabin");
		}
		
		*/
		
		/***
		 * 
		//nested if-else
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		System.out.println("Enter your weigth");
		int weight = sc.nextInt();
		
		if(age>20)
		{
			if(weight>30)
			{
				System.out.println("age & weight is satisfied ; can donate blood");
			}
			else
			{
				System.out.println("under weight ; cannot donate blood");
			}
		}
		else
		{
			System.out.println("age is not satisfied ; cannot donate blood ");
		}
		
		*/
		
		//switch case
		System.out.println("Select an operation : ");
		
		System.out.println("1 . Addition");
		System.out.println("2 . Subtraction");
		System.out.println("3 . Multiplication");
		System.out.println("4 . Division");

		System.out.println("Enter your choice ( 1 / 2 / 3 / 4 ): ");
		int choice = sc.nextInt();
		
		System.out.println("Enter the first number : ");
		double num1 = sc.nextDouble();
		
		System.out.println("Enter the second number : ");
		double num2 = sc.nextDouble();
		
		double result;
		
		switch (choice)
		{
		case 1:
			result = num1 + num2;
			System.out.println("Result : "+result);
			break;
			
		case 2:
			result = num1 - num2;
			System.out.println("Result : "+result);
			break;
			
		case 3:
			result = num1 * num2;
			System.out.println("Result : "+result);
			break;
			
		case 4:
			if(num2 != 0)
			{
				result = num1 / num2;
				System.out.println("Result : "+result);
			}
			else
			{
				System.out.println("Error : division by zero not allowed");
			}
			break;
			
		default:
			System.out.println("Invalid choice ; select the correct choice");
			
		}
	}

}
