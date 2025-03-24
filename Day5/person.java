package Day5;

import Day5.person;

public class person
{
	private String name;
	private int age;
	
	//regular constructor
	public person(String name , int age)
	{
		this.name = name;
		this.age = age;
	}
	
	//copy constructor
	public person(person other)
	{
		this.name = other.name;
		this.age= other.age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	
	//method to display person details
	public void displayInfo()
	{
		System.out.println("Name : " + name + " |  Age : " + age);
	}
		

}
