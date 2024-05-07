package com.foreverYou;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenLipCare extends LipCare
{
	public void lip_category()
	{
		
			  System.out.println("Enter your preferences for Lip Balm SPF");
			  System.out.println("Press 1 : Lip Balm SPF");
			  
			  System.out.println("Press 2 : Exit");
			  
			  try {
			  Scanner ref = new Scanner(System.in);
			  
			  int x = ref.nextInt();
			  switch (x)
			  {
			  case 1 : System.out.println("====Explore the world of Lip Balm SPFs====");
			  men_lipBalm();
			  break;
			  
			  case 8 :lip_category();
			  break;
			  default: System.err.println("Invalid input!");
			  lip_category();
			  }
		  
	}
	catch(InputMismatchException input)
	{
		System.out.println("Exception occured");
		lip_category();
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
			  
	

		 public  void men_lipBalm() 
		  {
			// TODO Auto-generated method stub
			System.out.println("Pick up your favourite brands!");
			System.out.println("========Press 1 => Kiehl’s Butterstick Lip Treatment SPF 30========");
			System.out.println("========Press 2 => Sun Bum Sunscreen Lip Balm SPF 30========");
			System.out.println("========Press 3 => Aquaphor Lip Protectant + Broad Spectrum SPF 30========");
			System.out.println("========Press 4 => Vaseline Lip Therapy Advanced Healing Lip Moisturizer Lip Balm========");
			System.out.println("========Press 5 => Alba Botanica Lipcare SPF 25========");

			System.out.println("========Press 6 => Back to choose category=======");
			Scanner ref = new Scanner(System.in);
			try {
			int i = ref.nextInt();
			switch (i)
			{
			case 1: System.out.println("You've chosen Kiehl’s Butterstick Lip Treatment SPF 30!");
			preferances();
			break;
			case 2: System.out.println("You've chosen Sun Bum Sunscreen Lip Balm SPF 30!");
			preferances();
			break;
			case 3: System.out.println("You've chosen Aquaphor Lip Protectant + Broad Spectrum SPF 30!");
			preferances();
			break;
			case 4: System.out.println("You've chosen Vaseline Lip Therapy Advanced Healing Lip Moisturizer Lip Balm!");
			preferances();
			break;
			case 5: System.out.println("You've chosen Alba Botanica Lipcare SPF 25!");
			preferances();
			break;
			
			case 8: lip_category();
			break;
			default: System.err.println("Invalid input");
			men_lipBalm();
		  }
		
			}
			catch(InputMismatchException input)
			{
				System.err.println("Invalid Input");
				men_lipBalm();
			}
		  }
		 public  void preferances()
		 {
			
			System.out.println("Select your preferences ==>");
			System.out.println("Press 1 : Non Transparent || Press 2 : Scented || Press 3 : Oil Free || Press 4 : Back to choose Brands");
			
			Scanner ref = new Scanner(System.in);
			try {
			int choice = ref.nextInt();
			switch (choice)
			{
			case 1 : scent();
			break;
			case 2 : scent(); 
			break;
			case 3 : scent();
			break;
			case 4 : lip_category();
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
		 
	
			
			
			public  void scent()
			{
				System.out.println("====Select Scent as per your choice====");
				System.out.println("Press 1 : Lily of Valley || Press 2 : Musk || Press 3 : SandalWood || Press 4 : Vanilla || Press 5 : Back to choose Super Ingredients");
				
				Scanner ref = new Scanner(System.in);
				try {
				int choice = ref.nextInt();
				switch (choice)
				{
				case 1 : System.out.println("Lily of Valley");
				if (isRegistered == false) {
					System.out.println("You've chosen Lily of Valley scent!");
					signup();
				}
					switch(choice)
					{
					case 1: System.out.print("Press Y/y to confirm the purchase: ");
					char confirm = ref.next().charAt(0);
					if (confirm == 'y' || confirm == 'Y')
					{
						total = total + 2000;
						cart.put("Lily of Valley", 2000);
					}
						else
						{
							scent();
						}
					}
				break;
				case 2 :  System.out.println("You've chosen Musk scent"); 
				if (isRegistered == false) {
					System.out.println("You've chosen Musk scent!");
					signup();
				}
					
					
					System.out.print("Press Y/y to confirm the purchase: ");
					char confirm = ref.next().charAt(0);
					if (confirm == 'y' || confirm == 'Y')
					{
						total = total + 1000;
						cart.put("Musk", 1000);
					}
						else
						{
							scent();
						}
					
				break;
				case 3 :
					if (isRegistered == false) {
						System.out.println("You've chosen SandalWood scent!");
						signup();
					}
					System.out.println("You've chosen SandalWood scent");
				
					 System.out.print("Press Y/y to confirm the purchase: ");
					char confirm1 = ref.next().charAt(0);
					if (confirm1 == 'y' || confirm1 == 'Y')
					{
						total = total + 2100;
						cart.put("SandalWood", 2100);
					}
						else
						{
							scent();
						}
					
				break;
				case 4 : System.out.println("You've chosen Vanilla scent");
				if (isRegistered == false) {
					System.out.println("You've chosen Vanilla scent!");
					signup();
				}
					 System.out.print("Press Y/y to confirm the purchase: ");
					char confirm2 = ref.next().charAt(0);
					if (confirm2 == 'y' || confirm2 == 'Y')
					{
						total = total + 2500;
						cart.put("Vanilla scent", 2500);
					}
						else
						{
							scent();
						}
					
				break;
				case 5: preferances();
				break;
				default : System.err.println("Invalid input");
				scent();
				}
				}
				catch(InputMismatchException input)
				{
					System.err.println("Select the ingredients appropriately!");
					scent();
				
				}
				
			
			}

}
