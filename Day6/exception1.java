package Day6;

public class exception1
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
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
		exception1 ee = new exception1();
		ee.name();
	}
}
