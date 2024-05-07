package com.foreverYou;

import java.util.Scanner;

public class EyeCare extends FaceCare 
{
	String brand;
	String palatte;
	String formula;
	String type;
	
	EyeCare()
	{
		
	}
	
	public EyeCare(String brand, String palette, String formula, String type)
	{
		this.brand = brand;
		this.palatte = palatte;
		this.formula = formula;
		this.type = type;
	}
	


	public void gender_category() {
		System.out.println("Press 1 : Women");
		System.out.println("Press 2 : Men");
		System.out.println("Press 3 : Exit");
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		switch (option) {
		case 1: 
			WomenEyeCare ref = new WomenEyeCare();
			ref.eye_category();
			break;
		case 2: // men
			MenEyeCare m = new MenEyeCare();
			m.eye_category();
			break;
		case 3: homepage();
			break;
		
		default:
			System.err.println("Enter correct option from above: -");
			gender_category();
		}
	}


}
