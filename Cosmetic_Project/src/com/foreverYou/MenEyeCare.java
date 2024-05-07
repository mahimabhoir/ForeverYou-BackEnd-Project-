package com.foreverYou;

import java.util.*;

public class MenEyeCare extends EyeCare
{
	
public MenEyeCare()
{
	super();
}
	
	public  void eye_category()
	{
		
			  System.out.println("Enter your preferences for EyeCare");
			  System.out.println("Press 1 : Eye Glasses");
			  System.out.println("Press 2 : Eye Serum");
			  System.out.println("Press 3 : Eye Gel");
			  System.out.println("Press 4 : Eye Masks");
			  System.out.println("Press 5 : Eye Massager");
			  System.out.println("Press 6 : Eye Sunscreens SPF");
			  System.out.println("Press 7 : Eye Cleanser");
			  System.out.println("Press 8 : Exit");
			  
			  try {
			  Scanner ref = new Scanner(System.in);
			  
			  int x = ref.nextInt();
			  switch (x)
			  {
			  case 1 : System.out.println("====Explore the world of Luxurious Glasses====");
			  glasses();
			  break;
			  case 2 : System.out.println("====Explore the world of Eye Serums====");
			  serum();
			  break;
			  case 3 : System.out.println("====Explore the world of Eye Gels====");
			  gel();
			  break;
			  case 4 : System.out.println("====Explore the world of Eye Masks====");
			  mask();
			  break;
			  case 5 : System.out.println("====Explore the world of Eye Massager====");
			  massager();
			  break;
			  case 6 : System.out.println("====Explore the world of Eye Sunscreens SPF====");
			  spf();
			  break;
			  case 7 : System.out.println("====Explore the world of Eye Cleanser====");
			  cleanser();
			  break;
			  case 8 :gender_category();
			  break;
			  default: System.err.println("Invalid input!");
			  eye_category();
			  }
		  
	}
	catch(InputMismatchException input)
	{
		System.out.println("Exception occured");
		eye_category();
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
		   public void gel() {
		// TODO Auto-generated method stub
			   	System.out.println("Pick up your favourite brands!");
				System.out.println("========Press 1 => Clinique========");
				System.out.println("========Press 2 => Kiehl's Eye Fuel========");
				System.out.println("========Press 3 => Neutrogena Hydro Boost Eye Gel Cream========");
				System.out.println("========Press 4 => The Ordinary Caffeine Solution========");
				System.out.println("========Press 5 => Back to category");
				

		
				
				Scanner ref = new Scanner(System.in);
				try {
				int i = ref.nextInt();
				switch (i)
				{
				case 1: System.out.println("You've chosen Clinique!");
				skin_tone();
				break;
				case 2: System.out.println("You've chosen Kiehl's Eye Fuel!");
				skin_tone();
				break;
				case 3: System.out.println("You've chosen Neutrogena Hydro Boost Eye Gel Cream!");
				skin_tone();
				break;
				case 4: System.out.println("You've chosen The Ordinary Caffeine Solution!");
				skin_tone();
				break;
				
				case 5: eye_category();
				break;
				
				default: System.err.println("Invalid input");
				gel();
			  }
			
				}
				catch(InputMismatchException input)
				{
					System.err.println("Invalid Input");
					gel();
				}   
			   
		
	}

		 void mask() {
		// TODO Auto-generated method stub
			 	System.out.println("Pick up your favourite brands!");
				System.out.println("========Press 1 => Shiseido========");
				System.out.println("========Press 2 => Patchology========");
				System.out.println("========Press 3 => Tatcha========");
				System.out.println("========Press 4 => Peter Thomas Roth========");
				System.out.println("========Press 5 => Wander Beauty========");
				
				System.out.println("========Press 6=> Back to choose Category========");

		
				
				Scanner ref = new Scanner(System.in);
				try {
				int i = ref.nextInt();
				switch (i)
				{
				case 1: System.out.println("You've chosen Shiseido!");
				skin_tone();
				break;
				case 2: System.out.println("You've chosen Patchology!");
				skin_tone();
				break;
				case 3: System.out.println("You've chosen Tatcha!");
				skin_tone();
				break;
				case 4: System.out.println("You've chosen Peter Thomas Roth!");
				skin_tone();
				break;
				case 5: System.out.println("You've chosen Wander Beauty!");
				skin_tone();
				break;
				
				case 6 : eye_category();
				default: System.err.println("Invalid input");
				mask();
			  }
			
				}
				catch(InputMismatchException input)
				{
					System.err.println("Invalid Input");
					mask();
				}
			  
	}

		 void massager() {
		// TODO Auto-generated method stub
			 System.out.println("Pick up your favourite brands!");
				System.out.println("========Press 1 => RENPHO Unisex========");
				System.out.println("========Press 2 => Breo========");
				System.out.println("========Press 3 => OSITO========");

				System.out.println("========Press 4 => Back to choose brands========");

				
				Scanner ref = new Scanner(System.in);
				try {
				int i = ref.nextInt();
				switch (i)
				{
				case 1: System.out.println("You've chosen RENPHO Unisex!");
				skin_tone();
				break;
				case 2: System.out.println("You've chosen Breo!");
				skin_tone();
				break;
				case 3: System.out.println("You've chosen OSITO!");
				skin_tone();
				break;
				
				case 4: eye_category();
				default: System.err.println("Invalid input");
				massager();
			  }
			
				}
				catch(InputMismatchException input)
				{
					System.err.println("Invalid Input");
					massager();
				}
			  }
	

			 
		
	

		public void spf() {
		// TODO Auto-generated method stub
			System.out.println("Pick up your favourite brands!");
			System.out.println("========Press 1 => Nivea Men========");
			System.out.println("========Press 2 => Bath & Body Works========");
			System.out.println("========Press 3 => CLINIQUE ========");
			System.out.println("========Press 4 => Vaseline========");
			System.out.println("========Press 5 => Neutrogena========");
			System.out.println("========Press 6 => Back to choose Category========");
			
	
			
			Scanner ref = new Scanner(System.in);
			try {
			int i = ref.nextInt();
			switch (i)
			{
			case 1: System.out.println("You've chosen Nivea Men!");
			skin_tone();
			break;
			case 2: System.out.println("You've chosen Bath & Body Works!");
			skin_tone();
			break;
			case 3: System.out.println("You've chosen CLINIQUE!");
			skin_tone();
			break;
			case 4: System.out.println("You've chosen Vaseline!");
			skin_tone();
			break;
			case 5: System.out.println("You've chosen Neutrogena!");
			skin_tone();
			case 6: eye_category();
			break;
			
			
			default: System.err.println("Invalid input");
			spf();
		  }
		
			}
			catch(InputMismatchException input)
			{
				System.err.println("Invalid Input");
				spf();
			}
		
	}

		 void cleanser() {
		// TODO Auto-generated method stub
			 System.out.println("Pick up your favourite brands!");
				System.out.println("========Press 1 => Biotrue========");
				System.out.println("========Press 2 => Lancôme========");
				System.out.println("========Press 3 => Garnier Men========");
				
				System.out.println("========Press 4 => Back to choose category========");
		
				
				Scanner ref = new Scanner(System.in);
				try {
				int i = ref.nextInt();
				switch (i)
				{
				case 1: System.out.println("You've chosen Biotrue!");
				skin_tone();
				break;
				case 2: System.out.println("You've chosen Lancôme!");
				skin_tone();
				break;
				case 3: System.out.println("You've chosen Garnier Men!");
				skin_tone();
				break;
				
				case 4: eye_category();
				
				default: System.err.println("Invalid input");
				cleanser();
			  }
			
				}
				catch(InputMismatchException input)
				{
					System.err.println("Invalid Input");
					cleanser();
				}
			  }
	

		
			public  void serum() 
			  {
				// TODO Auto-generated method stub
				System.out.println("Pick up your favourite brands!");
				System.out.println("========Press 1 => Moody 7D ========");
				System.out.println("========Press 2 => Blue Nector========");
				System.out.println("========Press 3 => Minimalist========");
				System.out.println("========Press 4 => The Man Company========");
				System.out.println("========Press 5 => Lacto Calamine========");
				
				System.out.println("========Press 6 => Back to choose Bronzer========");
				
				Scanner ref = new Scanner(System.in);
				try {
				int i = ref.nextInt();
				switch (i)
				{
				case 1: System.out.println("You've chosen Moody 7D!");
				skin_tone();
				break;
				case 2: System.out.println("You've chosen Blue Nector!");
				skin_tone();
				break;
				case 3: System.out.println("You've chosen Minimalist!");
				skin_tone();
				break;
				case 4: System.out.println("You've chosen The Man Company!");
				skin_tone();
				break;
				case 5: System.out.println("You've chosen Lacto Calamine!");
				skin_tone();
				break;
				case 6: eye_category();
				break;
				default: System.err.println("Invalid input");
				
			  }
			
				}
				catch(InputMismatchException input)
				{
					System.err.println("Invalid Input");
					serum();
				}
			  }
//			 
//		
				 
	

		 public   void glasses() 
		  {
			// TODO Auto-generated method stub
			System.out.println("Pick up your favourite brands!");
			System.out.println("========Press 1 => Dior========");
			System.out.println("========Press 2 => Armani========");
			System.out.println("========Press 3 => Gucci========");
			System.out.println("========Press 4 => Persol========");
			System.out.println("========Press 5 => Ace & Tate========");
			System.out.println("========Press 6 => Tom Ford========");
			System.out.println("========Press 7 => Tommy Hilfiger========");
			System.out.println("========Press 8 => Back to choose category========");
			Scanner ref = new Scanner(System.in);
			try {
			int i = ref.nextInt();
			switch (i)
			{
			case 1: System.out.println("You've chosen Dior!");
			lookUp();
			break;
			case 2: System.out.println("You've chosen Armani!");
			lookUp();
			break;
			case 3: System.out.println("You've chosen Gucci!");
			lookUp();
			break;
			case 4: System.out.println("You've chosen Persol!");
			lookUp();
			break;
			case 5: System.out.println("You've chosen Ace & Tate!");
			lookUp();
			break;
			case 6: System.out.println("You've chosen Tom Ford!");
			lookUp();
			break;
			case 7: System.out.println("You've chosen Tommy Hilfiger!");
			lookUp();
			break;
			case 8: eye_category();
			break;
			default: System.err.println("Invalid input");
			glasses();
		  }
		
			}
			catch(InputMismatchException input)
			{
				System.err.println("Invalid Input");
				glasses();
			}
		  }
		 public   void skin_tone()
		 {
			
			System.out.println("Select your skin tone ==>");
			System.out.println("Press 1 : Ivory");
			System.out.println("Press 2 : Dusky");
			System.out.println("Press 3 : Honey");
			System.out.println("Press 4 : Tan");
			System.out.println("Press 5 : Caramel");
			System.out.println("Press 6 : Bronze");
			System.out.println("Press 7 : Praline");
			System.out.println("Press 8 : Espresso Brown");
			System.out.println("Press 10 : Category");
			
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
			case 5 : formula();
			break;
			case 6 : formula();
			break;
			case 7 : formula();
			break;
			case 8 : formula();
			break;
			case 9 : formula();
			break;
			
			case 10 : eye_category();
			default : System.err.println("Invalid input");
			skin_tone();
			}
			}
			catch(InputMismatchException input)
			{
				System.err.println("Select skin_tone appropriately!");
				skin_tone();
			}
			}
		 
	
			public   void  formula()
			{
				System.out.println("====Select formulation as per your choice====");
				System.out.println("Press 1 : Gel || Press 2 : Liquid || Press 3 : Cream || Press 4 : Back to choose category");
				//Add a method to go back for selection
				Scanner ref = new Scanner(System.in);
				try {
				int choice = ref.nextInt();
				switch (choice)
				{
				case 1 : lookUp();
				break;
				case 2 :  lookUp(); 
				break;
				case 3 :  lookUp();
				break;
				case 4 : lookUp();
				break;
				case 5 : skin_tone();
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
			
			public   void lookUp()
			{
				System.out.println("====Select LookUp lookUp as per your choice====");
				System.out.println("Press 1 : Glamorous || Press 2 : Radiant || Press 3 : ShowStopper || Press 4 : Gala || Press 5 : Back to choose LookUp");
				
				Scanner ref = new Scanner(System.in);
				try {
				int choice = ref.nextInt();
				switch (choice)
				{
				case 1 : System.out.println("You've chosen Glamorous LookUp!");
				if (isRegistered == false) {
					System.out.println("You've chosen Glamorous LookUp!");
					signup();
				}
					switch(choice)
					{
					case 1: System.out.print("Press Y/y to confirm the purchase: ");
					char confirm = ref.next().charAt(0);
					if (confirm == 'y' || confirm == 'Y')
					{
						total = total + 4000;
						cart.put("Glamorous LookUp: ", 4000);
					}
						else
						{
							lookUp();
						}
					}
				break;
				case 2 :  System.out.println("You've chosen Radiant LookUp!"); 
				if (isRegistered == false) {
					System.out.println("You've chosen Radiant LookUp!");
					signup();
				}
					
					
					System.out.print("Press Y/y to confirm the purchase: ");
					char confirm = ref.next().charAt(0);
					if (confirm == 'y' || confirm == 'Y')
					{
						total = total + 2000;
						cart.put("Radiant LookUp: ", 2000);
					}
						else
						{
							lookUp();
						}
					
				break;
				case 3 :
					if (isRegistered == false) {
						System.out.println("You've chosen ShowStopper LookUp!");
						signup();
					}
					System.out.println("You've chosen ShowStopper LookUp");
				
					 System.out.print("Press Y/y to confirm the purchase: ");
					char confirm1 = ref.next().charAt(0);
					if (confirm1 == 'y' || confirm1 == 'Y')
					{
						total = total + 2100;
						cart.put("ShowStopper LookUp: ", 2100);
					}
						else
						{
							lookUp();
						}
					
				break;
				case 4 : System.out.println("You've chosen Gala LookUp!");
				if (isRegistered == false) {
					System.out.println("You've chosen Gala LookUp!");
					signup();
				}
					 System.out.print("Press Y/y to confirm the purchase: ");
					char confirm2 = ref.next().charAt(0);
					if (confirm2 == 'y' || confirm2 == 'Y')
					{
						total = total + 2500;
						cart.put("Gala Glam: ", 2500);
					}
						else
						{
							lookUp();
						}
					
				break;
				case 5: lookUp();
				break;
				default : System.err.println("Invalid input");
				lookUp();
				}
				}
				catch(InputMismatchException input)
				{
					System.err.println("Select your look appropriately!");
					lookUp();
				
				}
				
			
			

			

	}


			

	
			
}		
	

