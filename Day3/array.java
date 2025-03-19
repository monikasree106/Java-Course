package Day3;

import java.util.Arrays;

public class array 
{
	public static void main(String[] args) 
	{
		/***
		String[] names = { "Sachin Tendulkar" , "Mahendra Singh Dhoni" , "Virat Kohli" ,"Rohit Sharma" };
       
        
		//simple array eg
		//System.out.println(names[0]);
		
		
		
		//accessial elements using for loop
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
		*/
		
		/***
		//multi dimensional
		int[][] a = {{2,4},{5,7},{7,3},{3,1}};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		*/
		
		/***
		for(int[] i : a)
		{
			for(int[] j : i)
			{
				System.out.print();
			}
			System.out.println();
		}
		*/
		
		//ARRAY METHODS
		
		//1.length of the array
		int[] num = {10,20,30,40,50};
		System.out.println("length of the num : "+num.length);
		
		//2.copying the array
		int[] source = {1,2,3,4,5};
		int[] destination = new int[5];
		//copy array
		System.arraycopy(source, 0, destination, 0, source.length);
		
		
		for(int i : destination)
		{
			System.out.println("  "+i);
		}
		
		//3.array sort
		int[] b = {12,8,6,45,2};
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		
		//4.array fill
		int[] d = new int[5];
		Arrays.fill(d, 1);
		Arrays.fill(d, 1,4,2);
		System.out.println(Arrays.toString(d));
				
	}
}
