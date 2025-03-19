package Day3;

import java.util.Scanner; // used for diamond pattern only

public class controlstatement
{
	public static void main(String[] args)
{
		
		/***
		int i = 10;
		 
		//while
		while(i>5)
		{
			System.out.println("value of i : "+i);
			i--;
		}
		System.out.println("final of i :"+i);
		*/
		
		/***
		int i = 10;
		
		// do-while
		do
		{
			System.out.println("value of i : "+i);
			i--;
		}
		while(i>1);
		System.out.println("final of i : "+i);
		*/
		
		/***
		int i = 10;
		
		//for
		for(i=10;i>1;i--)
		{
			System.out.println("value of i : "+i);
		}
		System.out.println("final of i : "+i);
		*/
		
		//nested for
		/***
		//square pattern 
		for(int i= 1; i<=4 ;i++) // i=4
		{
			for (int j=2;j<=4;j++) //j=1 to 4 ; 4 times iteration happens
			{
				System.out.print(" "+i); 
			}
			System.out.println();
		}
		*/
		
		/***
		//triangle pattern 
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<i+1;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	    */
		
       /**
		//triangle pattern to print the ' * '
		int num = 6;
		for(int i=0;i<=num;i++)
		{
			for(int j=1;j<=num-i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		*/

		
		//diamond pattern
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no .of rows : ");
		int rows = sc.nextInt();
		
		//top half of the diamond
		for(int i=1;i<=rows;i++)
		{
			//leading space
			for(int j=i;j<rows;j++)
			{
				System.out.print(" ");
			}
			//print *
			for(int k=1;k<=(2*i-1);k++)
			{
				System.out.print("*");
			}	
			System.out.println();
		}
		
		//bottom half of the diamond
		for(int i=rows-1;i>=2;i--)
		{
			//leading space
			for(int j=rows;j>i;j--)
			{
				System.out.print(" ");
			}
			//print *
			for(int k=1;k<=(2*i-1);k++)
			{
				System.out.print("*");
			}	
			System.out.println();
		}
	}
}