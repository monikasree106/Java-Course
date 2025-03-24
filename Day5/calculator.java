package Day5;

public class calculator  
{
	//by changing the number of arguments
		public int add(int a , int b )
		{
			return a+b;
		}
		
		public int add(int a , int b , int c )
		{
			return a+b+c;
		}
		
		public static void main(String[] args) {
			calculator calc = new calculator();
			
			System.out.println(calc.add(5, 10));
			System.out.println(calc.add(2, 4, 8));
		}
}
