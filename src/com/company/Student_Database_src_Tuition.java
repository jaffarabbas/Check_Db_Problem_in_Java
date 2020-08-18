
package com.company;
import java.util.Scanner;


	 class Student_Database_src_Tuition{
	    private static int costPerCourse = 600;
	    private String courses = "";
	    private int tuitionBalance = 0;
	

	    // enroll in courses
	    public void enroll() {
	        // put inside a loop, user hits q to quit
	        boolean keepAdding = true;
	        while (keepAdding) {
	            System.out.println("Enter course to enroll (Q to quit): ");
	            Scanner in = new Scanner(System.in);
	            String course = in.nextLine();
	

	            if (course.toLowerCase().equals("q")) {
	

	                keepAdding = false;
	

	            } else {
	                courses = courses + "\n" + course;
	                tuitionBalance = tuitionBalance + costPerCourse;
	                System.out.println("ENROLLED in: " + courses);
	                System.out.println("TUITION BALANCE = " + tuitionBalance);
	            }
	        }
	    }
	

	    // view balance
	    public int getTuitionBalance() {
	        System.out.println();
	        System.out.println("Your balance is: $" + tuitionBalance);
	        return tuitionBalance;
	    }
	

	    public String getCourses() {
	        System.out.println();
	        System.out.println("Your courses: " + courses);
	        return courses;
	    }
	

	    // pay tuition
	    public void payTuition() {
	        getTuitionBalance();
	        Scanner in = new Scanner(System.in);
	        System.out.println("How much do you wish to pay?");
	        if (in.hasNextInt()){
	            int paymentAmount = in.nextInt();
	

	            System.out.println("Your payment of $" + paymentAmount + " was successful.");
	            tuitionBalance = tuitionBalance - paymentAmount;
	            getTuitionBalance();
	        }
	        else {
	            System.out.println("Please enter a whole number.");
	            payTuition();
	        }
	

	    }
	}