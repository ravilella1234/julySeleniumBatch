package com.icici.loans.eduloans;

public strictfp class A 
{
	//primitive variable
	int eno=100;  //insantce (or) non-static (or) global variable
	static String cname="vmware";  // static variable
	
	public void m1()
	{
		int eno=200;
		System.out.println("iam m1 method from class A");
		System.out.println(eno);
	}

	public static void m4()
	{
		A a=new A();
		a.m1();
	}
	

	
}
