package Day1;

import java.util.Scanner;

public class amountcal
{
	public static void main(String[] args) 
	{
		int amt1 , amt2 , res1 , res2 , res3 ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the amount1:");
		amt1 = sc.nextInt();
		System.out.println("Enter the amount2:");
		amt2 = sc .nextInt();
		
		res1 = amt1 + amt2;
		System.out.println(res1);
		
		res2 = amt1 - amt2;
		System.out.println(res2);
		
		res3 = amt1 * amt2;
		System.out.println(res3);
		
		if(res1<50)
		{
			System.out.println("Result is lesser than 50");
		}
		else
		{
			System.out.println("Result is greater than 50");
		}
		
		if(res2<50)
		{
			System.out.println("Result is lesser than 50");
		}
		else
		{
			System.out.println("Result is greater than 50");
		}
		
		if(res3<50)
		{
			System.out.println("Result is lesser than 50");
		}
		else
		{
			System.out.println("Result is greater than 50");
		}
		
	}

}
