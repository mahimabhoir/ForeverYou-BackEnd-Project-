package com.foreverYou;

import java.util.*;

public class MenHairCare extends HairCare
{
	
public MenHairCare()
{
	super();
}
	
	public  void hair_category()
	{
		
			  System.out.println("Enter your preferences for HairCare");
			  System.out.println("Press 1 : Hair Conditioner");
			  System.out.println("Press 2 : Shampoo");
			  
			  System.out.println("Press 3 : Hair Oil");
			  System.out.println("Press 4 : Exit");
			  
			  try {
			  Scanner ref = new Scanner(System.in);
			  
			  int x = ref.nextInt();
			  switch (x)
			  {
			  case 1 : System.out.println("====Explore the world of Hair Conditioners====");
			  conditioner();
			  break;
			  case 2 : System.out.println("====Explore the world of Shampoos====");
			  shampoo();
			  break;
			  
			  case 3 : System.out.println("====Explore the world of Hair Oil Brands====");
			  hairOil();
			  break;
			  
			  case 4 :gender_category();
			  break;
			  default: System.err.println("Invalid input!");
			  hair_category();
			  }
		  
	}
	catch(InputMismatchException input)
	{
		System.out.println("Exception occured");
		hair_category();
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
		   

		 void hairOil() {
		// TODO Auto-generated method stub
			 	System.out.println("Pick up your favourite brands!");
				System.out.println("========Press 1 => BEARDO Hair Care Oill========");
				System.out.println("========Press 2 => Pilgrim Advanced========");
				System.out.println("========Press 3 => NEWISH Men Hair Oil========");
				System.out.println("========Press 4 => URBAN Men Sesame Hair Oil========");
				System.out.println("========Press 5 => The Men Essential Hair Oil========");
			
				System.out.println("========Press 6=> Back to choose Category========");

		
				
				Scanner ref = new Scanner(System.in);
				try {
				int i = ref.nextInt();
				switch (i)
				{
				case 1: System.out.println("You've chosen BEARDO Hair Care Oil!");
				hair_type();
				break;
				case 2: System.out.println("You've chosen Pilgrim Advanced!");
				hair_type();
				break;
				case 3: System.out.println("You've chosen NEWISH Men Hair Oil!");
				hair_type();
				break;
				case 4: System.out.println("You've chosen URBAN Men Sesame Hair Oil!");
				hair_type();
				break;
				case 5: System.out.println("You've chosen The Men Essential Hair Oil!");
				hair_type();
				break;
				
				case 9 : hair_category();
				default: System.err.println("Invalid input");
				hairOil();
			  }
			
				}
				catch(InputMismatchException input)
				{
					System.err.println("Invalid Input");
					hairOil();
				}
			  
	}


			 
		
	
		
	
		 
	

		
			public  void shampoo() 
			  {
				// TODO Auto-generated method stub
				System.out.println("Pick up your favourite brands!");
				System.out.println("========Press 1 => Dove Men Shampoo========");
				System.out.println("========Press 2 => Tresemme Keratin Smooth Men Shampoo========");
				System.out.println("========Press 3 => Himalaya Anti Hair Fall Men Shampoo ========");
			
				System.out.println("========Press 4 => Sebamed Anti Hairloss Men Shampoo ========");
				System.out.println("========Press 5 => L’oreal Paris Extraordinary Clay Men's Shampoo ========");
				System.out.println("========Press 6 => WOW Skin Science Onion Oil Shampoo========");
				System.out.println("========Press 7 => Mamaearth Hibiscus Damage Repair Shampoo========");
				System.out.println("========Press 8 => Pilgrim Patuá & Keratin Hair SMOOTHENING SHAMPOO========");
				System.out.println("========Press 9 => Back to choose Shampoo========");
				
				Scanner ref = new Scanner(System.in);
				try {
				int i = ref.nextInt();
				switch (i)
				{
				case 1: System.out.println("You've chosen Dove Men Shampoo!");
				hair_type();
				break;
				case 2: System.out.println("You've chosen Tresemme Keratin Smooth Men Shampoo!");
				hair_type();
				break;
				case 3: System.out.println("You've chosen Himalaya Anti Hair Fall Men Shampoo!");
				hair_type();
				break;
			
				case 4: System.out.println("You've chosen Sebamed Anti Hairloss Men Shampoo!");
				hair_type();
				break;
				case 5: System.out.println("You've chosen L’oreal Paris Extraordinary Clay Men's Shampoo !");
				hair_type();
				break;
				case 6: System.out.println("You've chosen WOW Skin Science Onion Oil Shampoo!");
				hair_type();
				break;
				case 7: System.out.println("You've chosen Mamaearth Hibiscus Damage Repair Shampoo!");
				hair_type();
				break;
				case 8: System.out.println("You've chosen Pilgrim Patuá & Keratin Hair SMOOTHENING SHAMPOO!");
				hair_type();
				break;
				case 9 : hair_category();
				break;
				default: System.err.println("Invalid input");
				
			  }
			
				}
				catch(InputMismatchException input)
				{
					System.err.println("Invalid Input");
					shampoo();
				}
			  }
//			 
//		
				 
	

		 public   void conditioner() 
		  {
			// TODO Auto-generated method stub
			System.out.println("Pick up your favourite brands!");
			System.out.println("========Press 1 => Dove Men's Daily Shine Conditioner========");
			System.out.println("========Press 2 => Tresemme Hair Fall Defence Conditioner========");
			System.out.println("========Press 3 => Pantene Advanced Hairfall Solution Conditioner========");
			System.out.println("========Press 4 => L'oreal Paris Deep Conditioner========");
			System.out.println("========Press 5 => Bblunt Intense Moisture Conditioner========");

			System.out.println("========Press 6 => Back to choose category========");
			Scanner ref = new Scanner(System.in);
			try {
			int i = ref.nextInt();
			switch (i)
			{
			case 1: System.out.println("You've chosen Dove Men's Daily Shine Conditioner!");
			hair_type();
			break;
			case 2: System.out.println("You've chosen Tresemme Hair Fall Defence Conditioner!");
			hair_type();
			break;
			case 3: System.out.println("You've chosen Pantene Advanced Hairfall Solution Conditioner!");
			hair_type();
			break;
			case 4: System.out.println("You've chosen L'oreal Paris Deep Conditioner!");
			hair_type();
			break;
			case 5: System.out.println("You've chosen Bblunt Intense Moisture Conditioner=!");
			hair_type();
			break;
			
			case 8: hair_category();
			break;
			default: System.err.println("Invalid input");
			conditioner();
		  }
		
			}
			catch(InputMismatchException input)
			{
				System.err.println("Invalid Input");
				conditioner();
			}
		  }
		 public   void hair_type()
		 {
			
			System.out.println("Select your hair type ==>");
			System.out.println("Press 1 : Straight || Press 2 : Curly || Press 3 : Wavy || Press 4 : Coily || Press 5 : Back to Brand");
			
			Scanner ref = new Scanner(System.in);
			try {
			int choice = ref.nextInt();
			switch (choice)
			{
			case 1 : formula();
			break;
			case 2 : formula(); 
			break;
			case 3 : formula();
			break;
			case 4 : formula();
			break;
			case 5 : hair_type();
			default : System.err.println("Invalid input");
			hair_type();
			}
			}
			catch(InputMismatchException input)
			{
				System.err.println("Select your hair type appropriately!");
				hair_type();
			}
			}
		 
	
			public   void  formula()
			{
				System.out.println("====Select formulation as per your choice====");
				System.out.println("Press 1 : Gel || Press 2 : Oil || Press 3 : Liquid || Press 4 : Cream || Press 5 : Back to choose Hair type");
				//Add a method to go bck for selection
				Scanner ref = new Scanner(System.in);
				try {
				int choice = ref.nextInt();
				switch (choice)
				{
				case 1 : type();
				break;
				case 2 :  type(); 
				break;
				case 3 :  type();
				break;
				case 4 : type();
				break;
				case 5 : hair_type();
				break;
				default : System.err.println("Invalid input");
				formula();
				}
				}
				catch(InputMismatchException input)
				{
					System.err.println("Select the formulation appropriately!");
					formula();
				}
				}
			
			public   void type()
			{
				System.out.println("====Select Hairs type you want====");
				System.out.println("Press 1 : Shiny || Press 2 : Smooth || Press 3 : Silky || Press 4 : Back to choose Formulation");
				
				Scanner ref = new Scanner(System.in);
				try {
				int choice = ref.nextInt();
				switch (choice)
				{
				case 1 : System.out.println("You've chosen Shiny Hairs!");
				if (isRegistered == false) {
					System.out.println("You've chosen Shiny Hairs!");
					signup();
				}
					switch(choice)
					{
					case 1: System.out.print("Press Y/y to confirm the purchase: ");
					char confirm = ref.next().charAt(0);
					if (confirm == 'y' || confirm == 'Y')
					{
						total = total + 400;
						cart.put("Shiny Hairs", 400);
					}
						else
						{
							type();
						}
					}
				break;
				case 2 :  System.out.println("You've chosen Smooth Hairs!"); 
				if (isRegistered == false) {
					System.out.println("You've chosen Smooth Hairs!");
					signup();
				}
					
					
					System.out.print("Press Y/y to confirm the purchase: ");
					char confirm = ref.next().charAt(0);
					if (confirm == 'y' || confirm == 'Y')
					{
						total = total + 200;
						cart.put("Smooth Hairs", 200);
					}
						else
						{
							type();
						}
					
				break;
				case 3 :
					if (isRegistered == false) {
						System.out.println("You've chosen Silky Hairs!");
						signup();
					}
					System.out.println("You've chosen Silky Hairs");
				
					 System.out.print("Press Y/y to confirm the purchase: ");
					char confirm1 = ref.next().charAt(0);
					if (confirm1 == 'y' || confirm1 == 'Y')
					{
						total = total + 210;
						cart.put("Silky Hairs", 210);
					}
						else
						{
							type();
						}
					
				break;
			
				case 4: type();
				break;
				default : System.err.println("Invalid input");
				type();
				}
				}
				catch(InputMismatchException input)
				{
					System.err.println("Select the t appropriately!");
					type();
				
				}
				
			
			

			

	}


			

	
			
}		
	

