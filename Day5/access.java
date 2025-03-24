package Day5;

import program.person;

public class access
{
	public static void main(String[] args)
	{
		//original person object
		person originalperson = new person("rose",20);
		//copied person object
		person copiedperson = new person(originalperson); //object dependency
		
		System.out.println("original person : ");
		originalperson.displayInfo();
		
		System.out.println("copied person : ");
		copiedperson.displayInfo();
	}

}
