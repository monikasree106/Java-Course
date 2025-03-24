package Day5;

public class overloading 
{
	int c;
	public void add(int a , int b)
	{
		c=a+b;
		System.out.println("The value of integer c : "+c);
	}
	public void add(float a , int b)
	{
		float c = a+b; //local variable
		System.out.println("The value of integer c : "+c);
	}
	public void add(float a , double b)
	{
		double c = a+b; //local variable
		System.out.println("The value of integer c : "+c);
	}
	
	public static void main(String[] args) {
		overloading ole = new overloading();
		ole.add(25, 50);
		ole.add(35.3f, 75);
		ole.add(12.54f, 24.23478);
	}
}
