

package com.foreverYou;

import java.util.*;

public class MenNailCare extends NailCare
{
	
public MenNailCare()
{
	super();
}
	
	public  void nail_category()
	{
		
			  System.out.println("Enter your preferences for Nailcare");
			  System.out.println("Press 1 : NailCutter");
		
			  System.out.println("Press 2 : Exit");
			  
			  try {
			  Scanner ref = new Scanner(System.in);
			  
			  int x = ref.nextInt();
			  switch (x)
			  {
			  case 1 : System.out.println("====Explore the world of NailCutters====");
			  nailCutter();
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
		   
	

			 
	 
	

		 public   void nailCutter() 
		  {
			// TODO Auto-generated method stub
			System.out.println("Pick up your favourite brands!");
			System.out.println("========Press 1 => Victorinox, NAIL CLIPPER========");
			System.out.println("========Press 2 => Kai Nail Clipper========");
			System.out.println("========Press 3 => BELL Nail Curve Cutters========");
			System.out.println("========Press 4 => MAYCREATE® Nail Cutter for Men Toe Nail Cutter========");
			System.out.println("========Press 5 => Beauté Secrets Nail Cutter========");

			System.out.println("========Press 6 => Back to choose category========");
			Scanner ref = new Scanner(System.in);
			try {
			int i = ref.nextInt();
			switch (i)
			{
			case 1: System.out.println("You've chosen Victorinox, NAIL CLIPPER!");
			type();
			break;
			case 2: System.out.println("You've chosen Kai Nail Clipper!");
			type();
			break;
			case 3: System.out.println("You've chosen BELL Nail Curve Cutters!");
			type();
			break;
			case 4: System.out.println("You've chosen MAYCREATE® Nail Cutter for Men Toe Nail Cutter!");
			type();
			break;
			case 5: System.out.println("You've chosen Beauté Secrets Nail Cutter!");
			type();
			break;
			
			case 8: nail_category();
			break;
			default: System.err.println("Invalid input");
			nailCutter();
		  }
		
			}
			catch(InputMismatchException input)
			{
				System.err.println("Invalid Input");
				nailCutter();
			}
		  }
		 
			
			
			public   void type()
			{
				System.out.println("====Select NailCutters Cutter type you want====");
				System.out.println("Press 1 : Sharp || Press 2 : Blent || Press 3 : 360° || Press 4 : Back to choose typetion");
				
				Scanner ref = new Scanner(System.in);
				try {
				int choice = ref.nextInt();
				switch (choice)
				{
				case 1 : System.out.println("You've chosen Sharp NailCutters!");
				if (isRegistered == false) {
					System.out.println("You've chosen Sharp NailCutters!");
					signup();
				}
					switch(choice)
					{
					case 1: System.out.print("Press Y/y to confirm the purchase: ");
					char confirm = ref.next().charAt(0);
					if (confirm == 'y' || confirm == 'Y')
					{
						total = total + 400;
						cart.put("Sharp NailCutters", 400);
					}
						else
						{
							type();
						}
					}
				break;
				case 2 :  System.out.println("You've chosen Blent NailCutters!"); 
				if (isRegistered == false) {
					System.out.println("You've chosen Blent NailCutters!");
					signup();
				}
					
					
					System.out.print("Press Y/y to confirm the purchase: ");
					char confirm = ref.next().charAt(0);
					if (confirm == 'y' || confirm == 'Y')
					{
						total = total + 200;
						cart.put("Blent NailCutters", 200);
					}
						else
						{
							type();
						}
					
				break;
				case 3 :
					if (isRegistered == false) {
						System.out.println("You've chosen 360° NailCutters!");
						signup();
					}
					System.out.println("You've chosen 360° NailCutters");
				
					 System.out.print("Press Y/y to confirm the purchase: ");
					char confirm1 = ref.next().charAt(0);
					if (confirm1 == 'y' || confirm1 == 'Y')
					{
						total = total + 210;
						cart.put("360° NailCutters", 210);
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
	




