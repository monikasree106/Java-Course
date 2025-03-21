package day4;

import java.util.Scanner;// imported while using this commands ' Scanner sc = new Scanner(System.in); ' 

public class string 
{
	public static void main(String[] args) 
	{
		//string literal
		String s1 = "Programming";
		//string object
		String s2 = new String ("Language");
		//array of characters
		char[] c1 = {'J','A','V','A'};
		//char to string
		String s3 = new String(c1);
				
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
				
		//string concatenation
		String s5 = s1  +  s2;
		System.out.println(s5);
						
		s1 = s1+s3;
		System.out.println(s1);
						
		//STRING METHODS
		
		//1.string length
	    String s4 = "Java Program";
		System.out.println(s4.length());
				
		//2.string equals()
		Scanner sc = new Scanner(System.in);
		/***
		System.out.println("Enter the username");
		String username = sc.next();
		System.out.println("Enter the password");
		String password = sc.next();
		if(username.equals("Admin") && password.equals("admin@123"))
		{
			System.out.println("Success");
		}
		else
		{
			System.out.println("Error 404 found");
		}
		*/
				
		String s6 = "Mona";
		String s9 = "Mona";
		System.out.println(s6.equals(s9));
				
		/***
		//3.string equallIgnoreCase
		if(username.equalsIgnoreCase("Admin") && password.equalsIgnoreCase("admin@123"))
		{
			System.out.println("Success");
		}
		else
		{
			System.out.println("Error 404 found");
		}
		*/
				
		//4.string == operator
		System.out.println(s6==s9);
		
		String name1 = new String("mano");
		String name2 = new String("mano");
		System.out.println(name1==name2); //name1 and name2 are two separate objects ;
		//5.compare to
		// --> s7>s8 >> positive number
		// --> s7<s8 >> negative number
		// --> s7==s8 >> zero
		String s7 = "heults";
		String s8 = "hellos";
		System.out.println(s7.compareTo(s8));
				
		//6.concate
		String str1 = "Startit";
		String str2 = new String("Program");
		System.out.println(str1.concat(str2));
				
		//7.toCharArray()
		String str3 = "Welcome to java";
		System.out.println("Value of method : ");
		char[] ch = str3.toCharArray();
		System.out.println(str3.toCharArray());
				
		for(char st: ch) //to display in line
		{
			System.out.println(st);
		}
				
		//8.subString()
		System.out.println(str3.substring(5));
		System.out.println(str3.substring(7,11)); //by index value
			
		//9.intern
		String clg = "KGISL";
		String clg1 = new String("KGISL");
		String str4 =clg1.intern();
		System.out.println(clg==str4);
				
		//Advanced string
				
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("Before : "+sb);
				
		//append
		sb.append("world");
		System.out.println("After append : "+sb);
				
		//insert
		sb.insert(5,",");
		System.out.println("After insert : "+sb);
				
		//replace
		sb.replace(6, 11, "java"); //sourceindex , destinationindex , string to replace
		System.out.println("After replace : "+sb);
				
		//reverse
		sb.reverse();
		System.out.println("After reverse : "+sb);
		
	}

}
