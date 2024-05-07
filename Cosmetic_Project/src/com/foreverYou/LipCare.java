package com.foreverYou;

import java.util.Scanner;

public class LipCare extends ForeverYou
{
	public void gender_category() {
		System.out.println("Press 1 : Women");
		System.out.println("Press 2 : Men");
		System.out.println("Press 3 : Exit");
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		switch (option) {
		case 1: 
			WomenLipCare ref = new WomenLipCare();
			ref.lip_category();
			break;
		case 2: // men
			MenLipCare m = new MenLipCare();
			m.lip_category();
			break;
		case 3: homepage();
			break;
		
		default:
			System.err.println("Enter correct option from above: -");
			gender_category();
		}
	}
}
