package com.foreverYou;

import java.util.*;

public class Women extends FaceCare
{
	public void category()
	{
		
			  System.out.println("Enter your preferences for facecare");
			  System.out.println("Press 1 : Blush");
			  System.out.println("Press 2 : Bronzer");
			  System.out.println("Press 3 : Compact");
			  System.out.println("Press 4 : Concealers");
			  System.out.println("Press 5 : Foundation");
			  System.out.println("Press 6 : BB & CC Creams");
			  System.out.println("Press 7 : Micellar");
			  System.out.println("Press 8 : Exit");
			  
			  try {
			  Scanner ref = new Scanner(System.in);
			  
			  int x = ref.nextInt();
			  switch (x)
			  {
			  case 1 : System.out.println("====Explore the world of Blushes====");
			  blush();
			  break;
			  case 2 : System.out.println("====Explore the world of Bronzers====");
			  bronzer();
			  break;
			  case 3 : System.out.println("====Explore the world of Compacts====");
			  compact();
			  break;
			  case 4 : System.out.println("====Explore the world of Concealers====");
			  conceler();
			  break;
			  case 5 : System.out.println("====Explore the world of Foundations====");
			  foundation();
			  break;
			  case 6 : System.out.println("====Explore the world of BB & CC Creams====");
			  cream();
			  break;
			  case 7 : System.out.println("====Explore the world of Micellars====");
			  micellar();
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
			  
		   public void micellar() {
		// TODO Auto-generated method stub
			   System.out.println("Pick up your favourite brands!");
				System.out.println("========Press 1 => Garnier Misceller========");
				System.out.println("========Press 2 => M.A.C========");
				System.out.println("========Press 3 => Fixderma========");
				System.out.println("========Press 4 => Swiss Beauty========");
				System.out.println("========Press 5 => Back to choose Micellar========");

		
				
				Scanner ref = new Scanner(System.in);
				try {
				int i = ref.nextInt();
				switch (i)
				{
				case 1: System.out.println("You've chosen Garnier Misceller!");
				preferances();
				break;
				case 2: System.out.println("You've chosen M.A.C!");
				preferances();
				break;
				case 3: System.out.println("You've chosen Fixderma!");
				preferances();
				break;
				case 4: System.out.println("You've chosen Swiss Beauty!");
				preferances();
				break;
				case 5: micellar();
				break;
				default: System.err.println("Invalid input");
				micellar();
			  }
			
				}
				catch(InputMismatchException input)
				{
					System.err.println("Invalid Input");
					micellar();
				}   
			   
		
	}

		 void cream() {
		// TODO Auto-generated method stub
			 	System.out.println("Pick up your favourite brands!");
				System.out.println("========Press 1 => Lakme========");
				System.out.println("========Press 2 => Maybelline New York========");
				System.out.println("========Press 3 => Plum========");
				System.out.println("========Press 4 => Pond's========");
				System.out.println("========Press 5 => Glow & Lovely========");
				System.out.println("========Press 6 => Garnier========");
				System.out.println("========Press 7 => Faces Canada========");
				System.out.println("========Press 8=> Lotus========");
				System.out.println("========Press 9=> Back to choose BB & CC Cream========");

		
				
				Scanner ref = new Scanner(System.in);
				try {
				int i = ref.nextInt();
				switch (i)
				{
				case 1: System.out.println("You've chosen Lakme!");
				preferances();
				break;
				case 2: System.out.println("You've chosen Maybelline New York!");
				preferances();
				break;
				case 3: System.out.println("You've chosen Plum!");
				preferances();
				break;
				case 4: System.out.println("You've chosen Pond's!");
				preferances();
				break;
				case 5: System.out.println("You've chosen Glow & Lovely!");
				preferances();
				break;
				case 6: System.out.println("You've chosen Garnier!");
				preferances();
				break;
				case 7: System.out.println("You've chosen Faces Canada!");
				preferances();
				break;
				case 8: System.out.println("You've chosen Lotus!");
				preferances();
				break;
				case 9 : cream();
				default: System.err.println("Invalid input");
				cream();
			  }
			
				}
				catch(InputMismatchException input)
				{
					System.err.println("Invalid Input");
					cream();
				}
			  
	}

		 void foundation() {
		// TODO Auto-generated method stub
			 System.out.println("Pick up your favourite brands!");
				System.out.println("========Press 1 => Lakme========");
				System.out.println("========Press 2 => Maybelline New York========");
				System.out.println("========Press 3 => CLINIQUE========");
				System.out.println("========Press 4 => Sugar Cosmetics========");
				System.out.println("========Press 5 => RENEE========");
				System.out.println("========Press 6 => Bobbi Brown========");
				System.out.println("========Press 7 => L'oreal Paris========");
				System.out.println("========Press 8 => Faces Canada========");
				System.out.println("========Press 9 => Back to choose Foundation========");

				
				Scanner ref = new Scanner(System.in);
				try {
				int i = ref.nextInt();
				switch (i)
				{
				case 1: System.out.println("You've chosen Lakme!");
				preferances();
				break;
				case 2: System.out.println("You've chosen Maybelline New York!");
				preferances();
				break;
				case 3: System.out.println("You've chosen CLINIQUE!");
				preferances();
				break;
				case 4: System.out.println("You've chosen Sugar Cosmetics!");
				preferances();
				break;
				case 5: System.out.println("You've chosen RENEE!");
				preferances();
				break;
				case 6: System.out.println("You've chosen Bobbi Brown!");
				preferances();
				break;
				case 7: System.out.println("You've chosen L'oreal Paris!");
				preferances();
				break;
				case 8: System.out.println("You've chosen Faces Canada!");
				preferances();
				break;
				case 9: foundation();
				default: System.err.println("Invalid input");
				foundation();
			  }
			
				}
				catch(InputMismatchException input)
				{
					System.err.println("Invalid Input");
					foundation();
				}
			  }
	

			 
		
	

		public void conceler() {
		// TODO Auto-generated method stub
			System.out.println("Pick up your favourite brands!");
			System.out.println("========Press 1 => Lakme========");
			System.out.println("========Press 2 => Maybelline New York========");
			System.out.println("========Press 3 => Bounjour Paris========");
			System.out.println("========Press 4 => 82° E========");
			System.out.println("========Press 5 => Kay By Katrina========");
			System.out.println("========Press 6 => Back to choose Concealer========");
			
	
			
			Scanner ref = new Scanner(System.in);
			try {
			int i = ref.nextInt();
			switch (i)
			{
			case 1: System.out.println("You've chosen Lakme!");
			preferances();
			break;
			case 2: System.out.println("You've chosen Maybelline New York!");
			preferances();
			break;
			case 3: System.out.println("You've chosen Bounjour Paris!");
			preferances();
			break;
			case 4: System.out.println("You've chosen 82° E!");
			preferances();
			break;
			case 5: System.out.println("You've chosen Kay By Katrina!");
			preferances();
			case 6: conceler();
			break;
			
			
			default: System.err.println("Invalid input");
			conceler();
		  }
		
			}
			catch(InputMismatchException input)
			{
				System.err.println("Invalid Input");
				conceler();
			}
		
	}

		 void compact() {
		// TODO Auto-generated method stub
			 System.out.println("Pick up your favourite brands!");
				System.out.println("========Press 1 => Lakme========");
				System.out.println("========Press 2 => Maybelline New York========");
				System.out.println("========Press 3 => MamaEarth========");
				System.out.println("========Press 4 => Sugar Cosmetics========");
				System.out.println("========Press 5 => RENEE========");
				System.out.println("========Press 6 => Blue Heaven========");
				System.out.println("========Press 7 => L'oreal Paris========");
				System.out.println("========Press 8 => Faces Canada========");
				System.out.println("========Press 9 => Back to choose Compact========");
		
				
				Scanner ref = new Scanner(System.in);
				try {
				int i = ref.nextInt();
				switch (i)
				{
				case 1: System.out.println("You've chosen Lakme!");
				preferances();
				break;
				case 2: System.out.println("You've chosen Maybelline New York!");
				preferances();
				break;
				case 3: System.out.println("You've chosen MamaEarth!");
				preferances();
				break;
				case 4: System.out.println("You've chosen Sugar Cosmetics!");
				preferances();
				break;
				case 5: System.out.println("You've chosen RENEE!");
				preferances();
				break;
				case 6: System.out.println("You've chosen Blue Heaven!");
				preferances();
				break;
				case 7: System.out.println("You've chosen L'oreal Paris!");
				preferances();
				break;
				case 8: System.out.println("You've chosen Faces Canada!");
				preferances();
				break;
				case 9: compact();
				
				default: System.err.println("Invalid input");
				compact();
			  }
			
				}
				catch(InputMismatchException input)
				{
					System.err.println("Invalid Input");
					compact();
				}
			  }
	

		
			public  void bronzer() 
			  {
				// TODO Auto-generated method stub
				System.out.println("Pick up your favourite brands!");
				System.out.println("========Press 1 => Lakme========");
				System.out.println("========Press 2 => PAC========");
				System.out.println("========Press 3 => Wet n Wild========");
				System.out.println("========Press 4 => Revolution Pro========");
				System.out.println("========Press 5 => Back to choose Bronzer========");
				
				Scanner ref = new Scanner(System.in);
				try {
				int i = ref.nextInt();
				switch (i)
				{
				case 1: System.out.println("You've chosen Lakme!");
				preferances();
				break;
				case 2: System.out.println("You've chosen PAC!");
				preferances();
				break;
				case 3: System.out.println("You've chosen Wet n Wild!");
				preferances();
				break;
				case 4: System.out.println("You've chosen Revolution Pro!");
				preferances();
				break;
				case 5 : bronzer();
				default: System.err.println("Invalid input");
				
			  }
			
				}
				catch(InputMismatchException input)
				{
					System.err.println("Invalid Input");
					bronzer();
				}
			  }
//			 
//		
				 
	

		 public  void blush() 
		  {
			// TODO Auto-generated method stub
			System.out.println("Pick up your favourite brands!");
			System.out.println("========Press 1 => Lakme========");
			System.out.println("========Press 2 => MyGlamm========");
			System.out.println("========Press 3 => Swiss Beauty========");
			System.out.println("========Press 4 => Faces Canada========");
			System.out.println("========Press 5 => Mabelline========");
			System.out.println("========Press 6 => L'Oreal Paris========");
			System.out.println("========Press 7 => The Body Shop========");
			System.out.println("========Press 8 => Back to choose Blush========");
			Scanner ref = new Scanner(System.in);
			try {
			int i = ref.nextInt();
			switch (i)
			{
			case 1: System.out.println("You've chosen Lakme!");
			preferances();
			break;
			case 2: System.out.println("You've chosen MyGlamm!");
			preferances();
			break;
			case 3: System.out.println("You've chosen Swiss Beauty!");
			preferances();
			break;
			case 4: System.out.println("You've chosen Faces Canada!");
			preferances();
			break;
			case 5: System.out.println("You've chosen Mabelline!");
			preferances();
			break;
			case 6: System.out.println("You've chosen L'Oreal Paris!");
			preferances();
			break;
			case 7: System.out.println("You've chosen The Body Shop!");
			preferances();
			break;
			case 8: blush();
			break;
			default: System.err.println("Invalid input");
			blush();
		  }
		
			}
			catch(InputMismatchException input)
			{
				System.err.println("Invalid Input");
				blush();
			}
		  }
		 public  void preferances()
		 {
			
			System.out.println("Select your preferences ==>");
			System.out.println("Press 1 : Vegan || Press 2 : Parabean Free || Press 3 : Gluten Free || Press 4 : Back to choose Brands");
			
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
		 
	
			public  void  superIngredient()
			{
				System.out.println("====Select essential ingredients as per your choice====");
				System.out.println("Press 1 : Vitamin C || Press 2 : Hyaluronic Acid || Press 3 : Shea Butter || Press 4 : Jojoba Oil || Press 5 : Back to choose Preferances");
				//Add a method to go bck for selection
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
				System.out.println("Press 1 : Shimmer || Press 2 : Natural || Press 3 : Radiant || Press 4 : Matte || Press 5 : Back to choose Super Ingredients");
				
				Scanner ref = new Scanner(System.in);
				try {
				int choice = ref.nextInt();
				switch (choice)
				{
				case 1 : System.out.println("Shimmer");
				if (isRegistered == false) {
					System.out.println("You've chosen Shimmer MakeupFinish!");
					signup();
				}
					switch(choice)
					{
					case 1: System.out.print("Press Y/y to confirm the purchase: ");
					char confirm = ref.next().charAt(0);
					if (confirm == 'y' || confirm == 'Y')
					{
						total = total + 2000;
						cart.put("Shimmer Glam", 2000);
					}
						else
						{
							makeupFinish();
						}
					}
				break;
				case 2 :  System.out.println("You've chosen Natural MakeupFinish"); 
				if (isRegistered == false) {
					System.out.println("You've chosen Natural MakeupFinish!");
					signup();
				}
					
					
					System.out.print("Press Y/y to confirm the purchase: ");
					char confirm = ref.next().charAt(0);
					if (confirm == 'y' || confirm == 'Y')
					{
						total = total + 1000;
						cart.put("Natural Glam", 1000);
					}
						else
						{
							makeupFinish();
						}
					
				break;
				case 3 :
					if (isRegistered == false) {
						System.out.println("You've chosen Matte MakeupFinish!");
						signup();
					}
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
				case 4 : System.out.println("You've chosen Matte MakeupFinish");
				if (isRegistered == false) {
					System.out.println("You've chosen Matte MakeupFinish!");
					signup();
				}
					 System.out.print("Press Y/y to confirm the purchase: ");
					char confirm2 = ref.next().charAt(0);
					if (confirm2 == 'y' || confirm2 == 'Y')
					{
						total = total + 2500;
						cart.put("Matte Glam", 2500);
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
	

