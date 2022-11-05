package com.bridgelabz.day8;

public class Empwage {
	//class variable 
	   static final int Fullday = 1; 
	    static final int parttime = 2;
	    static public int Empwagehours = 20;

	    public static void main(String[] args) {
	        //Use case 4 code with Switch statement

	        System.out.println("Welcome to Employee wage");

	        
	        int wage = 0;
	        int empHrs = 0;
	        int wagemonth = 20;
	        int workingday = 0;
	        int totalhour = 0;
	        
	        

	            int empCheck = (int)(Math.random() * 3); 

	            switch (empCheck) {
                case Fullday:
                    System.out.println("The employee is full day");
                    empHrs = 8;
                    workingday++;
                    break;
                case parttime:
                    System.out.println("Employee is  part time");
                    empHrs = 4;
                    workingday++;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    empHrs = 0;
            }

	        wage = empHrs * Empwagehours;
	        System.out.println("The employee wage is  "+ wage);
	    
	        wagemonth += wage;
	        totalhour +=wage; 
	       // workingday +=wage;
	    
	    System.out.println("employee working day "+workingday);    
	    System.out.println("employee total hours is "+totalhour);
	    
	    System.out.println("the employee monthly wage is "+ wagemonth);
	    }    

}
	