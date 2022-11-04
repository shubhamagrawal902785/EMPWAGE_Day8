package com.bridgelabz.day8;

public class Empwage {
	public static void main(String args[])
	{
		System.out.println("welcome to emp wage");
		
		int empCheck = (int)(Math.random() * 2);
		int wage=0;
		int fullday=1;
		int emphours=0;
		int empwageperhours=20;
		
		if(empCheck==fullday)
		{
			System.out.println("Employee is present full day");
			
			emphours=8;
		}
		else
		{
			System.out.println("Employee is absent");
			emphours=0;
		}
		
		wage=emphours*empwageperhours;
		System.out.println(wage);
	}

}
