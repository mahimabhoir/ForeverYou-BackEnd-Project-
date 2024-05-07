package com.foreverYou;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WomenLipCare extends LipCare
{
	public void lip_category()
	{
		
			  System.out.println("Enter your preferences for facecare");
			  System.out.println("Press 1 : Lipstick");
			  System.out.println("Press 2 : Lip Balm");
			  System.out.println("Press 3 : Lip Crayon");
			  System.out.println("Press 4 : Lip Gloss");
			  System.out.println("Press 5 : Lip Liner");
			  System.out.println("Press 6 : Lip Primer");
			  System.out.println("Press 7 : Lip MakeUp lip_micellar");
			  System.out.println("Press 8 : Exit");
			  
			  try {
			  Scanner ref = new Scanner(System.in);
			  
			  int x = ref.nextInt();
			  switch (x)
			  {
			  case 1 : System.out.println("====Explore the world of Lipstick====");
			  lipstick();
			  break;
			  case 2 : System.out.println("====Explore the world of Lip Balms====");
			  lipbalm();
			  break;
			  case 3 : System.out.println("====Explore the world of Lip Crayons====");
			  crayon();
			  break;
			  case 4 : System.out.println("====Explore the world of Lip Glosses====");
			  gloss();
			  break;
			  case 5 : System.out.println("====Explore the world of Lip Liners====");
			  liners();
			  break;
			  case 6 : System.out.println("====Explore the world of Lip Primers====");
			  primers();
			  break;
			  case 7 : System.out.println("====Explore the world of Lip MakeUp lip_micellar====");
			  lip_micellar();
			  break;
			  case 8 :gender_category();
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
			  
		   public void lip_micellar() {
		// TODO Auto-generated method stub
			   System.out.println("Pick up your favourite brands!");
				System.out.println("========Press 1 => Garnier Misceller========");
				System.out.println("========Press 2 => IT Cosmetics Bye Bye Makeup Cleansing Balm========");
				System.out.println("========Press 3 => NYX Makeup Remover========");
				System.out.println("========Press 4 => AOA Lip Makeup Remover Pads========");
				System.out.println("========Press 5 => Back to choose category========");

		
				
				Scanner ref = new Scanner(System.in);
				try {
				int i = ref.nextInt();
				switch (i)
				{
				case 1: System.out.println("You've chosen Garnier Misceller!");
				shade();
				break;
				case 2: System.out.println("You've chosen IT Cosmetics Bye Bye Makeup Cleansing Balm!");
				shade();
				break;
				case 3: System.out.println("You've chosen NYX Makeup Remover!");
				shade();
				break;
				case 4: System.out.println("You've chosen AOA Lip Makeup Remover Pads!");
				shade();
				break;
				case 5: lip_category();
				break;
				default: System.err.println("Invalid input");
				lip_micellar();
			  }
			
				}
				catch(InputMismatchException input)
				{
					System.err.println("Invalid Input");
					lip_micellar();
				}   
			   
		
	}

		 void primers() {
		// TODO Auto-generated method stub
			 	System.out.println("Pick up your favourite brands!");
				System.out.println("========Press 1 => NYX Professional Makeup Lip primer========");
				System.out.println("========Press 2 => E.L.F Lip Primer========");
				System.out.println("========Press 3 => Prime & Prep========");
				System.out.println("========Press 4 => Anastasia Beverly Hills Lip Primer========");
				System.out.println("========Press 5 => CLINIQUE Pop Lip Primer========");
				System.out.println("========Press 6 => Trish McEvoy Flawless Lip Primer========");
				System.out.println("========Press 7 => MAC Cosmetics Prep + Prime Lip Primer========");
				System.out.println("========Press 8=> Tom Ford Lip Lock Priming Balm========");
				System.out.println("========Press 9=> Back to choose CAtegory========");

		
				
				Scanner ref = new Scanner(System.in);
				try {
				int i = ref.nextInt();
				switch (i)
				{
				case 1: System.out.println("You've chosen NYX Professional Makeup Lip primer!");
				shade();
				break;
				case 2: System.out.println("You've chosen E.L.F Lip Primer!");
				shade();
				break;
				case 3: System.out.println("You've chosen Prime & Prep!");
				shade();
				break;
				case 4: System.out.println("You've chosen Anastasia Beverly Hills Lip Primer!");
				shade();
				break;
				case 5: System.out.println("You've chosen CLINIQUE Pop Lip Primer!");
				shade();
				break;
				case 6: System.out.println("You've chosen Trish McEvoy Flawless Lip Primer!");
				shade();
				break;
				case 7: System.out.println("You've chosen MAC Cosmetics Prep + Prime Lip Primer!");
				shade();
				break;
				case 8: System.out.println("You've chosen Tom Ford Lip Lock Priming Balm!");
				shade();
				break;
				case 9 : lip_category();
				default: System.err.println("Invalid input");
				primers();
			  }
			
				}
				catch(InputMismatchException input)
				{
					System.err.println("Invalid Input");
					primers();
				}
			  
	}

		 void liners() {
		// TODO Auto-generated method stub
			 System.out.println("Pick up your favourite brands!");
				System.out.println("========Press 1 => Dior Contour Lip Liner========");
				System.out.println("========Press 2 => Pat McGrath Labs Permagel Ultra Lip Pencil========");
				System.out.println("========Press 3 => Milani Color Statement LipLiner========");
				System.out.println("========Press 4 => Victoria Beckham Beauty Lip Definer========");
				System.out.println("========Press 5 => Colourpop Lippie Pencil========");
				System.out.println("========Press 6 => Maybelline Color Sensational Lip Liner========");
				System.out.println("========Press 7 => Tower 28 OneLiner========");
				System.out.println("========Press 8 => Tarte Marajuca Juicy Lip Liner========");
				System.out.println("========Press 9 => Back to choose category========");

				
				Scanner ref = new Scanner(System.in);
				try {
				int i = ref.nextInt();
				switch (i)
				{
				case 1: System.out.println("You've chosen Dior Contour Lip Liner!");
				shade();
				break;
				case 2: System.out.println("You've chosen Pat McGrath Labs Permagel Ultra Lip Pencil!");
				shade();
				break;
				case 3: System.out.println("You've chosen Milani Color Statement LipLiner!");
				shade();
				break;
				case 4: System.out.println("You've chosen Victoria Beckham Beauty Lip Definer!");
				shade();
				break;
				case 5: System.out.println("You've chosen Colourpop Lippie Pencil!");
				shade();
				break;
				case 6: System.out.println("You've chosen Maybelline Color Sensational Lip Liner!");
				shade();
				break;
				case 7: System.out.println("You've chosen Tower 28 OneLiner!");
				shade();
				break;
				case 8: System.out.println("You've chosen Tarte Marajuca Juicy Lip Liner!");
				shade();
				break;
				case 9: lip_category();
				default: System.err.println("Invalid input");
				liners();
			  }
			
				}
				catch(InputMismatchException input)
				{
					System.err.println("Invalid Input");
					liners();
				}
			  }
	

			 
		
	

		public void gloss() {
		// TODO Auto-generated method stub
			System.out.println("Pick up your favourite brands!");
			System.out.println("========Press 1 => Glossier Lip Gloss========");
			System.out.println("========Press 2 => Bobbi Brown Crushed Oil-Infused Gloss========");
			System.out.println("========Press 3 => Fenty Beauty Gloss Bomb========");
			System.out.println("========Press 4 => Saie GlossyBounce========");
			System.out.println("========Press 5 => Maybelline New York Lip Lifter Gloss========");
			System.out.println("========Press 6 => Tower 28 ShineOn Non-Sticky Gloss========");
			System.out.println("========Press 7 => Westman Atelier========");
			System.out.println("========Press 8 => Rare Beauty========");
			System.out.println("========Press 9 => Pat McGrath Labs Lust Gloss========");
			System.out.println("========Press 10 => Back to choose Category========");
			
	
			
			Scanner ref = new Scanner(System.in);
			try {
			int i = ref.nextInt();
			switch (i)
			{
			case 1: System.out.println("You've chosen Glossier Lip Gloss!");
			shade();
			break;
			case 2: System.out.println("You've chosen Bobbi Brown Crushed Oil-Infused Gloss!");
			shade();
			break;
			case 3: System.out.println("You've chosen Fenty Beauty Gloss Bomb!");
			shade();
			break;
			case 4: System.out.println("You've chosen Saie GlossyBounce!");
			shade();
			break;
			case 5: System.out.println("You've chosen Maybelline New York Lip Lifter Gloss!");
			shade();
			break;
			case 6: System.out.println("You've chosen Tower 28 ShineOn Non-Sticky Gloss!");
			shade();
			break;
			case 7: System.out.println("You've chosen Westman Atelier!");
			shade();
			break;
			case 8: System.out.println("You've chosen Rare Beauty!");
			shade();
			break;
			case 9: System.out.println("You've chosen Pat McGrath Labs Lust Gloss!");
			shade();
			break;
			case 10: lip_category();
			break;
			
			
			default: System.err.println("Invalid input");
			gloss();
		  }
		
			}
			catch(InputMismatchException input)
			{
				System.err.println("Invalid Input");
				gloss();
			}
		
	}

		 void crayon() {
		// TODO Auto-generated method stub
			 System.out.println("Pick up your favourite brands!");
				System.out.println("========Press 1 => Swiss Beauty Matte & Gloss Crayon========");
				System.out.println("========Press 2 => Nykaa Matte & Glossilicious Lip Crayon========");
				System.out.println("========Press 3 => Kay Beauty Matinee Matte & Gloss Lip Crayon========");
				System.out.println("========Press 4 => SUGAR Matte & Gloss As Hell Crayon========");
				System.out.println("========Press 5 => Maybelline New York Super Stay Crayon========");
				System.out.println("========Press 6 => Faces Canada Ultime Pro Matte & Gloss Lip Crayon========");
				System.out.println("========Press 7 => Lakme Absolute Plush Matte & Gloss Lip Crayon========");
				
				System.out.println("========Press 8 => Back to choose category========");
		
				
				Scanner ref = new Scanner(System.in);
				try {
				int i = ref.nextInt();
				switch (i)
				{
				case 1: System.out.println("You've chosen Swiss Beauty Matte & Gloss Crayon!");
				shade();
				break;
				case 2: System.out.println("You've chosen Nykaa Matte & Glossilicious Lip Crayon!");
				shade();
				break;
				case 3: System.out.println("You've chosen Kay Beauty Matinee Matte & Gloss Lip Crayon!");
				shade();
				break;
				case 4: System.out.println("You've chosen SUGAR Matte & Gloss As Hell Crayon!");
				shade();
				break;
				case 5: System.out.println("You've chosen Maybelline New York Super Stay Crayon!");
				shade();
				break;
				case 6: System.out.println("You've chosen Faces Canada Ultime Pro Matte & Gloss Lip Crayon!");
				shade();
				break;
				case 7: System.out.println("You've chosen Lakme Absolute Plush Matte & Gloss Lip Crayon!");
				shade();
				break;
				
				case 8: lip_category();
				
				default: System.err.println("Invalid input");
				crayon();
			  }
			
				}
				catch(InputMismatchException input)
				{
					System.err.println("Invalid Input");
					crayon();
				}
			  }
	

		
			public  void lipbalm() 
			  {
				// TODO Auto-generated method stub
				System.out.println("Pick up your favourite brands!");
				System.out.println("========Press 1 => Dior Addict Lip Glow========");
				System.out.println("========Press 2 => HourGlass Cosmetics========");
				System.out.println("========Press 3 => Summer Fridays Lip Butter Balm========");
				System.out.println("========Press 4 => Cay Skin SPF 30 Lip Balm========");
				System.out.println("========Press 5 => Vaseline Original Petroleum Jelly========");
				System.out.println("========Press 6 => Rhode Peptide Lip Treatment========");
				System.out.println("========Press 7 => Laneige Berry Lip Glowy Balm ========");
				System.out.println("========Press 8 => Sugar Cosmetics========");
				System.out.println("========Press 9 => Mamaearth========");
				
				System.out.println("========Press 10 => Back to choose category========");
				
				Scanner ref = new Scanner(System.in);
				try {
				int i = ref.nextInt();
				switch (i)
				{
				case 1: System.out.println("You've chosen Dior Addict Lip Glow!");
				shade();
				break;
				case 2: System.out.println("You've chosen HourGlass Cosmetics!");
				shade();
				break;
				case 3: System.out.println("You've chosen Summer Fridays Lip Butter Balm!");
				shade();
				break;
				case 4: System.out.println("You've chosen Cay Skin SPF 30 Lip Balm!");
				shade();
				break;
				case 5: System.out.println("You've chosen Vaseline Original Petroleum Jelly!");
				shade();
				break;
				case 6: System.out.println("You've chosen Rhode Peptide Lip Treatment!");
				shade();
				break;
				case 7: System.out.println("You've chosen Laneige Berry Lip Glowy Balm!");
				shade();
				break;
				case 8: System.out.println("You've chosen Sugar Cosmetics!");
				shade();
				break;
				case 9: System.out.println("You've chosen Mamaearth!");
				shade();
				break;
				
				
				case 10 : lip_category();
				default: System.err.println("Invalid input");
				
			  }
			
				}
				catch(InputMismatchException input)
				{
					System.err.println("Invalid Input");
					lipbalm();
				}
			  }
//			 
//		
				 
	

		 public  void lipstick() 
		  {
			// TODO Auto-generated method stub
			System.out.println("Pick up your favourite brands!");
			System.out.println("========Press 1 => CHANEL ROUGE ALLURE ========");
			System.out.println("========Press 2 => Giorgio Armani Beauty========");
			System.out.println("========Press 3 => Yves Saint Laurent========");
			System.out.println("========Press 4 => Dior Addict========");
			System.out.println("========Press 5 => Tom Ford========");
			System.out.println("========Press 6 => Gucci Beauty========");
			System.out.println("========Press 7 => Maybelline New York========");
			System.out.println("========Press 8 => Back to choose category========");
			Scanner ref = new Scanner(System.in);
			try {
			int i = ref.nextInt();
			switch (i)
			{
			case 1: System.out.println("You've chosen CHANEL ROUGE ALLURE!");
			shade();
			break;
			case 2: System.out.println("You've chosen Giorgio Armani Beauty!");
			shade();
			break;
			case 3: System.out.println("You've chosen Yves Saint Laurent!");
			shade();
			break;
			case 4: System.out.println("You've chosen Dior Addict!");
			shade();
			break;
			case 5: System.out.println("You've chosen Tom Ford!");
			shade();
			break;
			case 6: System.out.println("You've chosen Gucci Beauty!");
			shade();
			break;
			case 7: System.out.println("You've chosen Maybelline New York!");
			shade();
			break;
			case 8: lip_category();
			break;
			default: System.err.println("Invalid input");
			lipstick();
		  }
		
			}
			catch(InputMismatchException input)
			{
				System.err.println("Invalid Input");
				lipstick();
			}
		  }
		 public  void shade()
		 {
			
			System.out.println("Select your favourite shades ==>");
			System.out.println("====Press 1 : Classic Red====");
			System.out.println("====Press 2 : Wine====");
			System.out.println("====Press 3 : Taupe====");
			System.out.println("====Press 4 : Nude====");
			System.out.println("====Press 5 : Mauve====");
			System.out.println("====Press 6 : Coral====");
			System.out.println("====Press 7 : Plum====");
			System.out.println("====Press 8 : Berry====");
			System.out.println("====Press 9 : Baby Pink====");
			System.out.println("====Press 10 : Back to Category====");
			
			Scanner ref = new Scanner(System.in);
			try {
			int choice = ref.nextInt();
			switch (choice)
			{
			case 1 : type();
			break;
			case 2 : type(); 
			break;
			case 3 : type();
			break;
			case 5 : lip_category();
			break;
			case 6 : lip_category();
			break;
			case 7 : lip_category();
			break;
			case 8 : lip_category();
			break;
			case 9 : lip_category();
			break;
			case 10 : lip_category();
			break;
			
			
			default : System.err.println("Invalid input");
			shade();
			}
			}
			catch(InputMismatchException input)
			{
				System.err.println("Select shade appropriately!");
				shade();
			}
			}
		 
	
			public  void  type()
			{
				System.out.println("====Select essential type as per your choice====");
				System.out.println("Press 1 : SmudgeProof || Press 2 : Sensational || Press 3 : WaterProof || Press 4 : Moisturizing || Press 5 : Back to choose shade");
				//Add a method to go bck for selection
				Scanner ref = new Scanner(System.in);
				try {
				int choice = ref.nextInt();
				switch (choice)
				{
				case 1 : scent();
				break;
				case 2 :  scent(); 
				break;
				case 3 :  scent();
				break;
				case 4 : scent();
				break;
				case 5 : shade();
				break;
				default : System.err.println("Invalid input");
				type();
				}
				}
				catch(InputMismatchException input)
				{
					System.err.println("Select the ingredients appropriately!");
					type();
				}
				}
			
			public  void scent()
			{
				System.out.println("====Select scent for lip care as per your choice====");
				System.out.println("Press 1 : Floral & Fresh || Press 2 : Fruity & Tropical || Press 3 : Chocolate || Press 4 : Matte & Gloss  || Press 5 : Back to choose Scents");
				
				Scanner ref = new Scanner(System.in);
				try {
				int choice = ref.nextInt();
				switch (choice)
				{
				case 1 : System.out.println("Floral & Fresh");
				if (isRegistered == false) {
					System.out.println("You've chosen Floral & Fresh scent!");
					signup();
				}
					switch(choice)
					{
					case 1: System.out.print("Press Y/y to confirm the purchase: ");
					char confirm = ref.next().charAt(0);
					if (confirm == 'y' || confirm == 'Y')
					{
						total = total + 2000;
						cart.put("Floral & Fresh Glam", 2000);
					}
						else
						{
							scent();
						}
					}
				break;
				case 2 :  System.out.println("You've chosen Fruity & Tropical scent"); 
				if (isRegistered == false) {
					System.out.println("You've chosen Fruity & Tropical scent!");
					signup();
				}
					
					
					System.out.print("Press Y/y to confirm the purchase: ");
					char confirm = ref.next().charAt(0);
					if (confirm == 'y' || confirm == 'Y')
					{
						total = total + 1000;
						cart.put("Fruity & Tropical Glam", 1000);
					}
						else
						{
							scent();
						}
					
				break;
				case 3 :
					if (isRegistered == false) {
						System.out.println("You've chosen Matte & Gloss scent!");
						signup();
					}
					System.out.println("You've chosen Chocolate scent");
				
					 System.out.print("Press Y/y to confirm the purchase: ");
					char confirm1 = ref.next().charAt(0);
					if (confirm1 == 'y' || confirm1 == 'Y')
					{
						total = total + 2100;
						cart.put("Chocolate Glam", 2100);
					}
						else
						{
							scent();
						}
					
				break;
				case 4 : System.out.println("You've chosen Matte & Gloss scent");
				if (isRegistered == false) {
					System.out.println("You've chosen Matte & Gloss scent!");
					signup();
				}
					 System.out.print("Press Y/y to confirm the purchase: ");
					char confirm2 = ref.next().charAt(0);
					if (confirm2 == 'y' || confirm2 == 'Y')
					{
						total = total + 2500;
						cart.put("Matte & Gloss Glam", 2500);
					}
						else
						{
							scent();
						}
					
				break;
				case 5: type();
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
