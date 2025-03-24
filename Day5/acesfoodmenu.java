package Day5;

public class acesfoodmenu implements vegitem , nonvegitem
{

	@Override
	public void fry() 
	{
		System.out.println("fish , prawn");	
	}

	@Override
	public void grey() 
	{
		System.out.println("mutton , chicken");
	}

	@Override
	public void breakfast() {
		System.out.println("dosa , idly");	
	}

	@Override
	public void lunch() {
		System.out.println("meals , biryani");	
	}
	
	public static void main(String[] args) 
	{
		acesfoodmenu fd = new acesfoodmenu();
		fd.breakfast();
		fd.fry();
		fd.lunch();
		fd.grey();
		
	}

}
