package day4;

import day4.constructor;

public class constructor 
{
	/***
	public constructor()
	{
		System.out.println("Default constructor");
	}
	
	public constructor( String name , String age )
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Parameterized Constructor");
	}
	
	public int sum(int a,int b)
	{
		int res = a + b;
		return res;
	}
	public static void main(String[] args) 
	{
		constructor cx = new constructor();
		constructor ce = new constructor("Mona shree" , "19");
		System.out.println(ce.sum(5,10));
	}
	*/
	

	
	//OverLoading
	private String empname;
	private int empid;
	private String location;
	
	
	
	public constructor(String empname , int empid , String location) 
	{
		this.empname = empname;
		this.empid = empid;
		this.location = location;
	}
	
	/***
	public void displayInfo() 
	{
		System.out.println("EmpName : " + this.empname );
		System.out.println("EmpId : " + this.empid);
		System.out.println("Location : " + this.location);
	}
	public static void main(String[]args)
	{
		constructor cox = new constructor( " LISA " , 20 , "Japan" );
		cox.displayInfo();
	}
	*/
	

	public constructor(String empname , String location) {
	   this(empname,0,location);
	}
	
	public constructor(String empname , int empid) {
		this(empname,empid,null);
	}
	
	
	public void displayInfo() 
	{
		System.out.println("EmpName : " + this.empname );
		System.out.println("EmpId : " + this.empid);
		System.out.println("Location : " + this.location);
	}
	public static void main(String[]args)
	{
		constructor cox = new constructor( " LISA " , 20 ,"Kora" );
		cox.displayInfo();
		constructor cox1 = new constructor( " LISA " ,19, "Japan" );
		cox1.displayInfo();
		constructor cox2 = new constructor( " ROSE " , 18 ,"China" );
		cox2.displayInfo();
	}
	

}
