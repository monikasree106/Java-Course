package Day6;

public class exception3 
{
	static void validdateAge(int age)
	{
		if(age<18)
		{
			throw new IllegalArgumentException("age must be 18 or above");
		}
		else
		{
			System.out.println("age is valid");
		}
	}
	public static void main(String[] args) 
	{
		try
		{
			validdateAge(15);
			
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("caught an exception : "+e.getMessage());
		}
	}
}
