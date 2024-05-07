package com.foreverYou;

import java.util.*;

public class WomenNailCare extends NailCare
{
	
public WomenNailCare()
{
	super();
}
	
	public  void nail_category()
	{
		
			  System.out.println("Enter your preferences for Nailcare");
			  System.out.println("Press 1 : NailPaint");
			  System.out.println("Press 2 : NailPaint Remover");
			  System.out.println("Press 3 : Nail Moisturizer");
			  System.out.println("Press 4 : Exit");
			  
			  try {
			  Scanner ref = new Scanner(System.in);
			  
			  int x = ref.nextInt();
			  switch (x)
			  {
			  case 1 : System.out.println("====Explore the world of NailPaints====");
			  nailPaint();
			  break;
			  case 2 : System.out.println("====Explore the world of NailPaint Removers====");
			  remover();
			  break;
			  case 3 : System.out.println("====Explore the world of Nail Moisturizers====");
			  moisturizer();
			  break;
			  
			  
			  case 4 :gender_category();
			  break;
			  default: System.err.println("Invalid input!");
			  nail_category();
			  }
		  
	}
	catch(InputMismatchException input)
	{
		System.out.println("Exception occured");
		nail_category();
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
		   public void moisturizer() {
		// TODO Auto-generated method stub
			   System.out.println("Pick up your favourite brands!");
				System.out.println("========Press 1 => Cuccio cuticle oil ========");
				System.out.println("========Press 2 => Yes to coconut hand cream========");
				System.out.println("========Press 3 => Onsen Cuticle cream========");
				System.out.println("========Press 4 => Gena hoof cream========");
				System.out.println("========Press 5 => Elon Lanolin nail conditioner========");
			
				
				System.out.println("========Press 6 => Back to choose Category========");

		
				
				Scanner ref = new Scanner(System.in);
				try {
				int i = ref.nextInt();
				switch (i)
				{
				case 1: System.out.println("You've chosen Cuccio cuticle oil!");
				formula();
				break;
				case 2: System.out.println("You've chosen Yes to coconut hand cream!");
				formula();
				break;
				case 3: System.out.println("You've chosen Onsen Cuticle creams!");
				formula();
				break;
				case 4: System.out.println("You've chosen Gena hoof cream!");
				formula();
				break;
				case 5: System.out.println("You've chosen Elon Lanolin nail conditioner!");
				formula();
				break;
				
				case 6: nail_category();
				break;
				
				default: System.err.println("Invalid input");
				moisturizer();
			  }
			
				}
				catch(InputMismatchException input)
				{
					System.err.println("Invalid Input");
					moisturizer();
				}   
			   
		
	}

		 

		 
	

			 
		
	
		
	
		 
	

		
			public  void remover() 
			  {
				// TODO Auto-generated method stub
				System.out.println("Pick up your favourite brands!");
				System.out.println("========Press 1 => ColorBar Nail Polish Remover========");
				System.out.println("========Press 2 => Debelle Nail Paint Remover========");
				System.out.println("========Press 3 => Insight Nail Polish Remover ========");
				System.out.println("========Press 4 => Blue Heaven Gentle Nail Paint Remover========");
				System.out.println("========Press 5 => Faces Canada Nail Enamel Removal========");
				System.out.println("========Press 6 => Sugar Pop Nail Lacquer Remover ========");
				
				System.out.println("========Press 7 => Back to choose remover========");
				
				Scanner ref = new Scanner(System.in);
				try {
				int i = ref.nextInt();
				switch (i)
				{
				case 1: System.out.println("You've chosen ColorBar Nail Polish Remover!");
				formula();
				break;
				case 2: System.out.println("You've chosen Debelle Nail Paint Remover!");
				formula();
				break;
				case 3: System.out.println("You've chosen Insight Nail Polish Remover !");
				formula();
				break;
				case 4: System.out.println("You've chosen Blue Heaven Gentle Nail Paint Remover!");
				formula();
				break;
				case 5: System.out.println("You've chosen Faces Canada Nail Enamel Removal!");
				formula();
				break;
				case 6: System.out.println("You've chosen Sugar Pop Nail Lacquer Remover  !");
				formula();
				break;
				
				case 10 : nail_category();
				break;
				default: System.err.println("Invalid input");
				
			  }
			
				}
				catch(InputMismatchException input)
				{
					System.err.println("Invalid Input");
					remover();
				}
			  }
//			 
//		
				 
	

		 public   void nailPaint() 
		  {
			// TODO Auto-generated method stub
			System.out.println("Pick up your favourite brands!");
			System.out.println("========Press 1 => Lakme Gloss Nail Color========");
			System.out.println("========Press 2 => Kay Beauty Nail Nourish Enamel Polish========");
			System.out.println("========Press 3 => Nykaa Cosmetics Nail Enamel========");
			System.out.println("========Press 4 => ELLE 18 Nail Pops Nail Polish========");
			System.out.println("========Press 5 => Swiss Beauty Stunning Nail Lacquer========");

			System.out.println("========Press 6 => Back to choose category========");
			Scanner ref = new Scanner(System.in);
			try {
			int i = ref.nextInt();
			switch (i)
			{
			case 1: System.out.println("You've chosen Lakme Gloss Nail Color!");
			formula();
			break;
			case 2: System.out.println("You've chosen Kay Beauty Nail Nourish Enamel Polish!");
			formula();
			break;
			case 3: System.out.println("You've chosen Nykaa Cosmetics Nail Enamel!");
			formula();
			break;
			case 4: System.out.println("You've chosen ELLE 18 Nail Pops Nail Polish!");
			formula();
			break;
			case 5: System.out.println("You've chosen Swiss Beauty Stunning Nail Lacquer=!");
			formula();
			break;
			
			case 8: nail_category();
			break;
			default: System.err.println("Invalid input");
			nailPaint();
		  }
		
			}
			catch(InputMismatchException input)
			{
				System.err.println("Invalid Input");
				nailPaint();
			}
		  }
		 
			public   void  formula()
			{
				System.out.println("====Select formulation as per your choice====");
				System.out.println("Press 1 : Liquid || Press 2 : Crayon || Press 3 : Spray || Press 4 : Cream || Press 5 : Back to choose Hair type");
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
				case 5 : formula();
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
				System.out.println("====Select Nails type you want====");
				System.out.println("Press 1 : Shiny || Press 2 : Smooth || Press 3 : Glossy || Press 4 : Back to choose Formulation");
				
				Scanner ref = new Scanner(System.in);
				try {
				int choice = ref.nextInt();
				switch (choice)
				{
				case 1 : System.out.println("You've chosen Shiny Nails!");
				if (isRegistered == false) {
					System.out.println("You've chosen Shiny Nails!");
					signup();
				}
					switch(choice)
					{
					case 1: System.out.print("Press Y/y to confirm the purchase: ");
					char confirm = ref.next().charAt(0);
					if (confirm == 'y' || confirm == 'Y')
					{
						total = total + 400;
						cart.put("Shiny Nails", 400);
					}
						else
						{
							type();
						}
					}
				break;
				case 2 :  System.out.println("You've chosen Smooth Nails!"); 
				if (isRegistered == false) {
					System.out.println("You've chosen Smooth Nails!");
					signup();
				}
					
					
					System.out.print("Press Y/y to confirm the purchase: ");
					char confirm = ref.next().charAt(0);
					if (confirm == 'y' || confirm == 'Y')
					{
						total = total + 200;
						cart.put("Smooth Nails", 200);
					}
						else
						{
							type();
						}
					
				break;
				case 3 :
					if (isRegistered == false) {
						System.out.println("You've chosen Glossy Nails!");
						signup();
					}
					System.out.println("You've chosen Glossy Nails");
				
					 System.out.print("Press Y/y to confirm the purchase: ");
					char confirm1 = ref.next().charAt(0);
					if (confirm1 == 'y' || confirm1 == 'Y')
					{
						total = total + 210;
						cart.put("Glossy Nails", 210);
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
	

