package Day2;

public class operator
{

		static public void main(String[]args)
		{
			int a = 10, b = 9, c = 5, d = 3;
			
			//arithmetic
			System.out.println("Add "+(a+b));
			System.out.println("Sub "+(b-d));
			System.out.println("Multi "+(a*c));
			
			//relational
			System.out.println("Equal to "+(a==c));
			System.out.println("Non-Equal to "+(b==d));
			System.out.println("Greater than "+(a>=b));
			System.out.println("Lesser than "+(c<=d));
			
			//logical
			boolean condition1=true, condition2=false;
			
			System.out.println("AND "+(condition1 && condition2));
			System.out.println("OR "+(condition1 || condition2));
			System.out.println("NOT "+(!condition1));
			
			//unary
			System.out.println("Unary operator"+(~a));
			System.out.println("Unary operator"+(~b));
			System.out.println("Post increment "+(a++));
			System.out.println("Pre decrement "+(--b));
			
			//assignment
			a+=5;
			b-=8;
			c*=5;
			System.out.println("+= "+a);
			System.out.println("-= "+b);
			System.out.println("*= "+c);
			
			//ternary
			String res1 = (a>b)?"a is greater " : "b is greater ";
			System.out.println("Result "+res1);
			String res2 = (a<b)?"a is lesser " : "b is lesser ";
			System.out.println("Result "+res2);
			
			//bitwise
			/***
			 * AND -->&
			 * OR -->|
			 * NOT -->~
			 * XOR -->^
			 */
			int x = 5, y = 3;
			System.out.println("AND : "+(x & y));
			System.out.println("OR : "+(x | y));
			System.out.println("XOR : "+(x ^ y));
			System.out.println("NOT : "+(~x));
			
			//shift
			
			//rigth-shift
			System.out.println(10>>5);
			System.out.println(10>>2);
			System.out.println(10>>4);
		
			//left-shift
			System.out.println(10<<5);
			System.out.println(10<<2);
			System.out.println(10<<4);
		}

}
