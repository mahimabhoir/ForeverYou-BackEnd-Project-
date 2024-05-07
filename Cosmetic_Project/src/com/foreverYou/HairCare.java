package com.foreverYou;

import java.util.Scanner;

public class HairCare extends FaceCare 
{
	HairCare()
	{
		
	}


	public void gender_category() {
		System.out.println("Press 1 : Women");
		System.out.println("Press 2 : Men");
		System.out.println("Press 3 : Exit");
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		switch (option) {
		case 1: 
			WomenHairCare w = new WomenHairCare();
			w.hair_category();
			break;
		case 2: // men
			MenHairCare m = new MenHairCare();
			m.hair_category();
			break;
		case 3: homepage();
			break;
		
		default:
			System.err.println("Enter correct option from above: -");
			gender_category();
		}
	}


}
