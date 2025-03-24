package Day5;

public class acesbirdact extends bird implements flyable
{

	@Override
	public void fly() 
	{
		System.out.println("birds flys...");
	}
	
	public static void main(String[] args)
	{
		acesbirdact aba = new acesbirdact();
		aba.fly();
		aba.eat();
	}
}