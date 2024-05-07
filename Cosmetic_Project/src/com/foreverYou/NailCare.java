package com.foreverYou;

import java.util.Scanner;

public class NailCare extends ForeverYou 
{
	String brand;
	String preferances;
	String superIngredient;
	String makeupFinish;
	
	NailCare()
	{
		
	}
	
	public NailCare(String brand, String preferances, String superIngredient, String makeupFinish)
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
			WomenNailCare w = new WomenNailCare();
			w.nail_category();
			break;
		case 2: // men
			MenNailCare m = new MenNailCare();
			m.nail_category();
			break;
		case 3: homepage();
			break;
		
		default:
			System.err.println("Enter correct option from above: -");
			gender_category();
		}
	}
	
}
