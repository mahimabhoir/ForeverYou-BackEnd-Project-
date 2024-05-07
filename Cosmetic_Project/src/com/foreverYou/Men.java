package com.foreverYou;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Men extends FaceCare
{
	public void category()
	{
		
			  System.out.println("Enter your preferences for facecare");
			  System.out.println("Press 1 : Face wash");
			  System.out.println("Press 2 : Face creams");
			  System.out.println("Press 3 : Even Toners");
			  System.out.println("Press 4 : Exit");
			  
			  try {
			  Scanner ref = new Scanner(System.in);
			  
			  int x = ref.nextInt();
			  switch (x)
			  {
			  case 1 : System.out.println("====Explore the world of Face washes====");
			  face_wash();
			  break;
			  case 2 : System.out.println("====Explore the world of Face Creams====");
			  face_cream();
			  break;
			  case 3 : System.out.println("====Explore the world of Even Toners====");
			  even_toner();
			  break;
			  
			  case 8 :gender_category();
			  break;
			  default: System.err.println("Invalid input!");
			  category();
			  }
		  
	}
	catch(InputMismatchException input)
	{
		System.out.println("Exception occured");
		category();
	}
			  Scanner sc = new Scanner(System.in);
			  System.out.print("Enter 1 : to continue shopping || Enter 2 : final purchase ==>  ");
			  int option = sc.nextInt();
			  if (option == 1) 
			  {
			  	homepage();
			  } 
			  else if (option == 2) {
			  	//payment
			  	total_bill();

			  }  
	}
			  
		   public void face_wash() {
		// TODO Auto-generated method stub
			   System.out.println("Pick up your favourite brands!");
				System.out.println("========Press 1 => Glow & Handsome========");
				System.out.println("========Press 2 => Himalayan Men========");
				System.out.println("========Press 3 => Garnier Men========");
				System.out.println("========Press 4 => Nivea Men========");
				System.out.println("========Press 5 => Beardo========");
				System.out.println("========Press 6 => Back to choose Category========");
				
		
				
				Scanner ref = new Scanner(System.in);
				try {
				int i = ref.nextInt();
				switch (i)
				{
				case 1: System.out.println("You've chosen Glow & Handsome!");
				preferances();
				break;
				case 2: System.out.println("You've chosen Himalayan Men!");
				preferances();
				break;
				case 3: System.out.println("You've chosen Garnier Men!");
				preferances();
				break;
				case 4: System.out.println("You've chosen Nivea Men!");
				preferances();
				break;
				case 5: System.out.println("You've chosen Beardo!");
				preferances();
				break;
				case 6: category();
				
				default: System.err.println("Invalid input");
				face_wash();
			  }
			
				}
				catch(InputMismatchException input)
				{
					System.err.println("Invalid Input");
					face_wash();
				}   
			   
		
	}

		 void face_cream() {
		// TODO Auto-generated method stub
			 	System.out.println("Pick up your favourite brands!");
				System.out.println("========Press 1 => The Man Company========");
				System.out.println("========Press 2 => L'oreal Professional Men========");
				System.out.println("========Press 3 => The Hill Men ========");
				System.out.println("========Press 4 => MenDeserve========");
				System.out.println("========Press 5 => Pond's Men========");
				System.out.println("========Press 6 => Back to choose category========");
				
		
				
				Scanner ref = new Scanner(System.in);
				try {
				int i = ref.nextInt();
				switch (i)
				{
				case 1: System.out.println("You've chosen The Man Company!");
				preferances();
				break;
				case 2: System.out.println("You've chosen L'oreal Professional Men!");
				preferances();
				break;
				case 3: System.out.println("You've chosen The Hill Men!");
				preferances();
				break;
				case 4: System.out.println("You've chosen MenDeserve!");
				preferances();
				break;
				case 5: System.out.println("You've chosen Pond's Men!");
				preferances();
				break;
				case 6: category();
				break;
				default: System.err.println("Invalid input");
				face_cream();
			  }
			
				}
				catch(InputMismatchException input)
				{
					System.err.println("Invalid Input");
					face_cream();
				}
			  
	}

		 void even_toner() {
		// TODO Auto-generated method stub
			 System.out.println("Pick up your favourite brands!");
				System.out.println("========Press 1 => Beardo========");
				System.out.println("========Press 2 => Mancode========");
				System.out.println("========Press 3 => CLINIQUE========");
				System.out.println("========Press 4 => Gentlemen's Tonic Advanced========");
				System.out.println("========Press 5 => The Man Company========");
				System.out.println("========Press 6 => Back to category========");


		
				
				Scanner ref = new Scanner(System.in);
				try {
				int i = ref.nextInt();
				switch (i)
				{
				case 1: System.out.println("You've chosen Beardo!");
				preferances();
				break;
				case 2: System.out.println("You've chosen Mancode!");
				preferances();
				break;
				case 3: System.out.println("You've chosen CLINIQUE!");
				preferances();
				break;
				case 4: System.out.println("You've chosen Gentlemen's Tonic Advanced!");
				preferances();
				break;
				case 5: System.out.println("You've chosen The Man Company!");
				preferances();
				break;
				case 6: category();
				break;
				
				default: System.err.println("Invalid input");
				even_toner();
			  }
			
				}
				catch(InputMismatchException input)
				{
					System.err.println("Invalid Input");
					even_toner();
				}
			  }
	

			 
		
	
		 public  void preferances()
		 {
			
			System.out.println("Select your preferences ==>");
			System.out.println("Press 1 : Vegan || Press 2 : Parabean Free || Press 3 : Oil Free || Press 4 : Back to Category");
			
			Scanner ref = new Scanner(System.in);
			try {
			int choice = ref.nextInt();
			switch (choice)
			{
			case 1 : superIngredient();
			break;
			case 2 : superIngredient(); 
			break;
			case 3 : superIngredient();
			break;
			case 4 : category();
			break;
			default : System.err.println("Invalid input");
			preferances();
			}
			}
			catch(InputMismatchException input)
			{
				System.err.println("Select preferances appropriately!");
				preferances();
			}
			}
		 
	
			public void  superIngredient()
			{
				System.out.println("====Select essential ingredients as per your choice====");
				System.out.println("Press 1 : Charcoal || Press 2 : Alpha Hyaluronic Acid || Press 3 : Antioxidants || Press 4 : Glycerin || Press 5 : Back to Preferances");
				
				Scanner ref = new Scanner(System.in);
				try {
				int choice = ref.nextInt();
				switch (choice)
				{
				case 1 : makeupFinish();
				break;
				case 2 :  makeupFinish(); 
				break;
				case 3 :  makeupFinish();
				break;
				case 4 : makeupFinish();
				break;
				case 5 : preferances();
				break;
				default : System.err.println("Invalid input");
				superIngredient();
				}
				}
				catch(InputMismatchException input)
				{
					System.err.println("Select the ingredients appropriately!");
					superIngredient();
				}
				}
			
			public  void makeupFinish()
			{
				System.out.println("====Select Makeup finish as per your choice====");
				System.out.println("Press 1 : Glowing || Press 2 : Natural || Press 3 : Radiant || Press 4 : Even toned || Press 5 : Back to choose Super Ingredients");
				
				Scanner ref = new Scanner(System.in);
				try {
				int choice = ref.nextInt();
				switch (choice)
				{
				case 1 : System.out.println("Glowing");
				if (isRegistered == false) {
					System.out.println("You've chosen Glowing MakeupFinish!");
					signup();
				}
				switch(choice)
				{
				case 1: System.out.print("Press Y/y to confirm the purchase: ");
				char confirm = ref.next().charAt(0);
				if (confirm == 'y' || confirm == 'Y')
				{
					total = total + 590;
					cart.put("Glowing Glam", 590);
				}
					else
					{
						makeupFinish();
					}
				}
				break;
				case 2 : 
				System.out.println("You've chosen Natural MakeupFinish"); 
				if (isRegistered == false) {
					System.out.println("You've chosen Natural MakeupFinish!");
					signup();
				}
					
					
					System.out.print("Press Y/y to confirm the purchase: ");
					char confirm = ref.next().charAt(0);
					if (confirm == 'y' || confirm == 'Y')
					{
						total = total + 400;
						cart.put("Natural Glam", 400);
					}
						else
						{
							makeupFinish();
						}
					
				break;
				case 3 :  System.out.println("Radiant");
				System.out.println("You've chosen Radiant MakeupFinish");
				
				 System.out.print("Press Y/y to confirm the purchase: ");
				char confirm1 = ref.next().charAt(0);
				if (confirm1 == 'y' || confirm1 == 'Y')
				{
					total = total + 2100;
					cart.put("Radiant Glam", 2100);
				}
					else
					{
						makeupFinish();
					}
				break;
				case 4 : System.out.println("Even toned");
				 System.out.print("Press Y/y to confirm the purchase: ");
					char confirm2 = ref.next().charAt(0);
					if (confirm2 == 'y' || confirm2 == 'Y')
					{
						total = total + 2150;
						cart.put("Even toned Glam", 2150);
					}
						else
						{
							makeupFinish();
						}
				break;
				case 5: superIngredient();
				break;
				default : System.err.println("Invalid input");
				makeupFinish();
				}
				}
				catch(InputMismatchException input)
				{
					System.err.println("Select the ingredients appropriately!");
					makeupFinish();
				}
				}

			
}
