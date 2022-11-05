package com.bridgelabz.day8;

public class Empwage {
	   static final int Fullday = 1; 
	    static final int parttime = 2;
	    static final int Empwagehours = 20;

	    public static void main(String[] args) {
	        //Use case 4 code with Switch statement

	        System.out.println("Welcome to Employee wage");

	        
	        int wage = 0;
	        int empHrs = 0;
	        int wagemonth = 20;
	        
	        for(int i = 0; i<20; i++) {

	            int empCheck = (int)(Math.random() * 3); 

	            switch (empCheck) {
	            case Fullday :
	                System.out.println("The employee is Full day");
	                empHrs = 8;
	                break;
	            case parttime:
	                System.out.println("Employee is Part time");
	                empHrs = 4;
	                break;
	            default:
	                System.out.println("Employee is Absent");
	                empHrs = 0;
	        }

	        wage = empHrs * Empwagehours;
	        System.out.println("The employee wage is  "+ wage);
	    
	        wagemonth += wage;
	    
	    
	    System.out.println("the employee monthly wage is "+ wagemonth);
	    }    
}
}
	