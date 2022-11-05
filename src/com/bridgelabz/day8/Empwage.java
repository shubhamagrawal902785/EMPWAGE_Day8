package com.bridgelabz.day8;

public class Empwage {
	   static final int Fullday = 1; // Constance
	    static final int parttime = 2;
	    static final int Empwagehours = 20;

	    public static void main(String[] args) {
	        //Use case 4 code with Switch statement

	        System.out.println("Welcome to Employee wage");

	        int empCheck = (int)(Math.random() * 3); //Generating Random Number
	        int wage = 0;
	        int empHrs = 0;

	        switch (empCheck){
	            case Fullday :
	                System.out.println("The employee  full time");
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
	    }
	}
