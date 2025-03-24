package Day5;

public class exception
{
	String str1 = "123";
	
	public void name()
	{
		try 
		{
			int i = Integer.parseInt(str1);
			System.out.println(" the value of converted : "+str1);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
		exception ee = new exception();
		ee.name();
	}
}
