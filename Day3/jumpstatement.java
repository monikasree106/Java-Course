package Day3;

public class jumpstatement 
{
	public static void main(String[] args)  
	{
		int i = 2;
		
		while(i<100)
		{
			/***
			//break
			if(i==51)
			{
				break;
			}
			*/
			
			//continue
			if(i==51)
			{
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}

}

