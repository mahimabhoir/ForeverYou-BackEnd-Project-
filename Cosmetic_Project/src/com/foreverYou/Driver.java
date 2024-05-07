package com.foreverYou;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
	// First Pop up
	static {
        System.out.println("======= Welcome to ForeverYOU =======");
        System.out.println("=====[ For Every You, Forever For You!!! ]=====");
        System.out.println("=======================================================================");
        System.out.println("== Your Ultimate Partner for Body Care ==");
        System.out.println("========== 1. Face Care =====================");
        System.out.println("========== 2. Eye Care =====================");
        System.out.println("========== 3. Lip Care =====================");
        System.out.println("========== 4. Hair Care =====================");
        System.out.println("========== 5. Nail care =====================");
        System.out.println("=========================================================================");
}


public static void main(String[] args)
{
	
	System.out.println("Allow ForeverYOU to send you the personalized notifications?");
    System.out.println("Press 1 for allowing, Press 2 for denying");

    Scanner ref = new Scanner(System.in);
    //Exception Handling
    try {
    int choice = ref.nextInt();
    switch (choice) {
        case 1:
            System.out.println("Thank you for allowing us to send you personalized notifications!");
            break;
        case 2:
            System.out.println("You won't be receiving the personalized recommendations from us.");
            break;
        default:
            System.out.println("Hey user, kindly enter valid input!");
            break;
    }
    }
    catch(Exception e){
    	System.out.println("Hey user, kindly enter valid input!");
    }
    //ref.close(); // Closing the scanner after its use
    System.out.println("=========================================================================");
    try {
    System.out.println("Hey user, Kindly enter 1 to create new account.");
	System.out.println("Hey user, Kindly enter 2 to Login.");
	System.out.println("Hey user, Kindly enter 3 to Guest login.");
	System.out.println("Hey user, Kindly enter 4 to exit.");
	
	Scanner sc = new Scanner(System.in);
	ForeverYou ref1 = new ForeverYou(); // Upcasting

	int n = sc.nextInt();
	switch (n) {
	case 1:
		ref1.signup();
	case 2:
		ref1.login();
	case 3:
		ref1.homepage();
		break;
	case 4:
		System.out.println("Hey user, it was great to have you here!!");
		System.exit(0);
		break;
	default:
		System.err.println("Try Again !!");
		main(null);
	}

    } 
    catch(InputMismatchException im)
    {
    	System.err.println("Invalid Input");
    }

}
}


