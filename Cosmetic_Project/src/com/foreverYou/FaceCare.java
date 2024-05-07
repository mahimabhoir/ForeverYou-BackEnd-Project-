package com.foreverYou;

import java.util.Scanner;

public class FaceCare extends ForeverYou 
{
	String brand;
	String preferances;
	String superIngredient;
	String makeupFinish;
	
	FaceCare()
	{
		
	}
	
	public FaceCare(String brand, String preferances, String superIngredient, String makeupFinish)
	{
		this.brand = brand;
		this.preferances = preferances;
		this.superIngredient = superIngredient;
		this.makeupFinish = makeupFinish;
	}
	


	public void gender_category() {
		System.out.println("Press 1 : Women");
		System.out.println("Press 2 : Men");
		System.out.println("Press 3 : Exit");
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		switch (option) {
		case 1: 
			Women w = new Women();
			w.category();
			break;
		case 2: // men
			Men m = new Men();
			m.category();
			break;
		case 3: homepage();
			break;
		
		default:
			System.err.println("Enter correct option from above: -");
			gender_category();
		}
	}
	
}
