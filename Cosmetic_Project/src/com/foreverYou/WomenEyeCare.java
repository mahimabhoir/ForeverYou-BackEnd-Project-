package com.foreverYou;

import java.util.*;

public class WomenEyeCare extends EyeCare
{
	
public WomenEyeCare()
{
	super();
}
	
	public  void eye_category()
	{
		
			  System.out.println("Enter your preferences for EyeCare");
			  System.out.println("Press 1 : Eyeliner");
			  System.out.println("Press 2 : Eye Shadow");
			  System.out.println("Press 3 : Mascara");
			  System.out.println("Press 4 : Kajal");
			  System.out.println("Press 5 : Eyebrow Enhancer");
			  System.out.println("Press 6 : Eye Makeupup Remover");
			  System.out.println("Press 7 : Eye Primer");
			  System.out.println("Press 8 : Exit");
			  
			  try {
			  Scanner ref = new Scanner(System.in);
			  
			  int x = ref.nextInt();
			  switch (x)
			  {
			  case 1 : System.out.println("====Explore the world of Eyeliners====");
			  eyeLiner();
			  break;
			  case 2 : System.out.println("====Explore the world of Eye Shadows====");
			  eyeShadow();
			  break;
			  case 3 : System.out.println("====Explore the world of Mascaras====");
			  mascara();
			  break;
			  case 4 : System.out.println("====Explore the world of Kajal Brands====");
			  kajal();
			  break;
			  case 5 : System.out.println("====Explore the world of Eyebrow Enhancers====");
			  enhancer();
			  break;
			  case 6 : System.out.println("====Explore the world of Eye Makeupup Removers====");
			  remover();
			  break;
			  case 7 : System.out.println("====Explore the world of Eye Primers====");
			  primer();
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
		   public void mascara() {
		// TODO Auto-generated method stub
			   System.out.println("Pick up your favourite brands!");
				System.out.println("========Press 1 => Marc Jacobs========");
				System.out.println("========Press 2 => Chanel========");
				System.out.println("========Press 3 => Giorgio Armani========");
				System.out.println("========Press 4 => Dior Diorshow========");
				System.out.println("========Press 5 => Pat McGrath Labs========");
				System.out.println("========Press 6 => Maybelline New York========");
				System.out.println("========Press 7 => L’Oréal Voluminous Carbon Black========");
				System.out.println("========Press 8 => CLINIQUE========");
				System.out.println("========Press 9 => Charlotte Tilbury========");
				System.out.println("========Press 10 => Back to choose Category========");

		
				
				Scanner ref = new Scanner(System.in);
				try {
				int i = ref.nextInt();
				switch (i)
				{
				case 1: System.out.println("You've chosen Marc Jacobs!");
				palatte();
				break;
				case 2: System.out.println("You've chosen Chanel!");
				palatte();
				break;
				case 3: System.out.println("You've chosen Giorgio Armani!");
				palatte();
				break;
				case 4: System.out.println("You've chosen Dior Diorshow!");
				palatte();
				break;
				case 5: System.out.println("You've chosen Pat McGrath Labs!");
				palatte();
				break;
				case 6: System.out.println("You've chosen Maybelline New York!");
				palatte();
				break;
				case 7: System.out.println("You've chosen L’Oréal Voluminous Carbon Black!");
				palatte();
				break;
				case 8: System.out.println("You've chosen CLINIQUE!");
				palatte();
				break;
				case 9: System.out.println("You've chosen Charlotte Tilbury!");
				palatte();
				break;
				case 10: eye_category();
				break;
				
				default: System.err.println("Invalid input");
				mascara();
			  }
			
				}
				catch(InputMismatchException input)
				{
					System.err.println("Invalid Input");
					mascara();
				}   
			   
		
	}

		 void kajal() {
		// TODO Auto-generated method stub
			 	System.out.println("Pick up your favourite brands!");
				System.out.println("========Press 1 => MAC Eye Kohl Pencil========");
				System.out.println("========Press 2 => Lakme Eyeconic Kajal========");
				System.out.println("========Press 3 => Maybelline New York Eye Studio========");
				System.out.println("========Press 4 => Bobbi Brown Long-Wear Eye Pencil========");
				System.out.println("========Press 5 => Blue Heaven Artisto Kajal========");
				System.out.println("========Press 6 => Elle 18 Eye Drama Kajal========");
				System.out.println("========Press 7 => SUGAR Cosmetics========");
				System.out.println("========Press 8=> The Body Shop Matte Kajal========");
				System.out.println("========Press 9=> Back to choose Category========");

		
				
				Scanner ref = new Scanner(System.in);
				try {
				int i = ref.nextInt();
				switch (i)
				{
				case 1: System.out.println("You've chosen MAC Eye Kohl Pencil!");
				palatte();
				break;
				case 2: System.out.println("You've chosen Lakme Eyeconic Kajal!");
				palatte();
				break;
				case 3: System.out.println("You've chosen Maybelline New York Eye Studio!");
				palatte();
				break;
				case 4: System.out.println("You've chosen Bobbi Brown Long-Wear Eye Pencil!");
				palatte();
				break;
				case 5: System.out.println("You've chosen Blue Heaven Artisto Kajal!");
				palatte();
				break;
				case 6: System.out.println("You've chosen Elle 18 Eye Drama Kajal!");
				palatte();
				break;
				case 7: System.out.println("You've chosen SUGAR Cosmetics!");
				palatte();
				break;
				case 8: System.out.println("You've chosen The Body Shop Matte Kajal!");
				palatte();
				break;
				case 9 : eye_category();
				default: System.err.println("Invalid input");
				kajal();
			  }
			
				}
				catch(InputMismatchException input)
				{
					System.err.println("Invalid Input");
					kajal();
				}
			  
	}

		 void enhancer() {
		// TODO Auto-generated method stub
			 System.out.println("Pick up your favourite brands!");
				System.out.println("========Press 1 => Lamel========");
				System.out.println("========Press 2 => Maybelline New York========");
				System.out.println("========Press 3 => Forest Essentials========");
				System.out.println("========Press 4 => Anastasia========");
				System.out.println("========Press 5 => PAC========");
				System.out.println("========Press 6 => Miss Claire========");
				System.out.println("========Press 7 => MARS========");
				System.out.println("========Press 8 => Swiss Beauty========");
				System.out.println("========Press 9 => Back to choose brands========");

				
				Scanner ref = new Scanner(System.in);
				try {
				int i = ref.nextInt();
				switch (i)
				{
				case 1: System.out.println("You've chosen Lamel!");
				palatte();
				break;
				case 2: System.out.println("You've chosen Maybelline New York!");
				palatte();
				break;
				case 3: System.out.println("You've chosen Forest Essentials!");
				palatte();
				break;
				case 4: System.out.println("You've chosen Anastasia!");
				palatte();
				break;
				case 5: System.out.println("You've chosen PAC!");
				palatte();
				break;
				case 6: System.out.println("You've chosen Miss Claire!");
				palatte();
				break;
				case 7: System.out.println("You've chosen MARS!");
				palatte();
				break;
				case 8: System.out.println("You've chosen Swiss Beauty!");
				palatte();
				break;
				case 9: eye_category();
				default: System.err.println("Invalid input");
				enhancer();
			  }
			
				}
				catch(InputMismatchException input)
				{
					System.err.println("Invalid Input");
					enhancer();
				}
			  }
	

			 
		
	

		public void remover() {
		// TODO Auto-generated method stub
			System.out.println("Pick up your favourite brands!");
			System.out.println("========Press 1 => CHANEL========");
			System.out.println("========Press 2 => Bioderma========");
			System.out.println("========Press 3 => CLINIQUE Micellar========");
			System.out.println("========Press 4 => NARS========");
			System.out.println("========Press 5 => MAKEUP FOR EVER Eye Cleanser========");
			System.out.println("========Press 6 => Back to choose Concealer========");
			
	
			
			Scanner ref = new Scanner(System.in);
			try {
			int i = ref.nextInt();
			switch (i)
			{
			case 1: System.out.println("You've chosen CHANEL!");
			palatte();
			break;
			case 2: System.out.println("You've chosen Bioderma!");
			palatte();
			break;
			case 3: System.out.println("You've chosen CLINIQUE Micellar!");
			palatte();
			break;
			case 4: System.out.println("You've chosen NARS!");
			palatte();
			break;
			case 5: System.out.println("You've chosen MAKEUP FOR EVER Eye Cleanser!");
			palatte();
			case 6: eye_category();
			break;
			
			
			default: System.err.println("Invalid input");
			remover();
		  }
		
			}
			catch(InputMismatchException input)
			{
				System.err.println("Invalid Input");
				remover();
			}
		
	}

		 void primer() {
		// TODO Auto-generated method stub
			 System.out.println("Pick up your favourite brands!");
				System.out.println("========Press 1 => Urban Decay========");
				System.out.println("========Press 2 => Ruby Kisses========");
				System.out.println("========Press 3 => NARS========");
				System.out.println("========Press 4 => LORAC========");
				System.out.println("========Press 5 => Ilia========");
				System.out.println("========Press 6 => MAC========");
				System.out.println("========Press 7 => Rare Beauty========");
				System.out.println("========Press 8 => Milani========");
				System.out.println("========Press 9 => Back to choose category========");
		
				
				Scanner ref = new Scanner(System.in);
				try {
				int i = ref.nextInt();
				switch (i)
				{
				case 1: System.out.println("You've chosen Urban Decay!");
				palatte();
				break;
				case 2: System.out.println("You've chosen Ruby Kisses!");
				palatte();
				break;
				case 3: System.out.println("You've chosen NARS!");
				palatte();
				break;
				case 4: System.out.println("You've chosen LORAC!");
				palatte();
				break;
				case 5: System.out.println("You've chosen Ilia!");
				palatte();
				break;
				case 6: System.out.println("You've chosen MAC!");
				palatte();
				break;
				case 7: System.out.println("You've chosen Rare Beauty!");
				palatte();
				break;
				case 8: System.out.println("You've chosen Milani!");
				palatte();
				break;
				case 9: eye_category();
				
				default: System.err.println("Invalid input");
				primer();
			  }
			
				}
				catch(InputMismatchException input)
				{
					System.err.println("Invalid Input");
					primer();
				}
			  }
	

		
			public  void eyeShadow() 
			  {
				// TODO Auto-generated method stub
				System.out.println("Pick up your favourite brands!");
				System.out.println("========Press 1 => Maybelline The Nudes Eyeshadow ========");
				System.out.println("========Press 2 => Charlotte Tilbury========");
				System.out.println("========Press 3 => Dior========");
				System.out.println("========Press 4 => Pat McGrath Labs========");
				System.out.println("========Press 5 => ColorPop========");
				System.out.println("========Press 6 => Alamar Cosmetics========");
				System.out.println("========Press 7 => Too Faced========");
				System.out.println("========Press 8 => Natasha Denona Senset EyeShadow========");
				System.out.println("========Press 9 => Victoria Beckham Beauty========");
				System.out.println("========Press 10 => Back to choose Bronzer========");
				
				Scanner ref = new Scanner(System.in);
				try {
				int i = ref.nextInt();
				switch (i)
				{
				case 1: System.out.println("You've chosen Maybelline The Nudes Eyeshadow!");
				palatte();
				break;
				case 2: System.out.println("You've chosen Charlotte Tilbury!");
				palatte();
				break;
				case 3: System.out.println("You've chosen Dior!");
				palatte();
				break;
				case 4: System.out.println("You've chosen Pat McGrath Labs!");
				palatte();
				break;
				case 5: System.out.println("You've chosen ColorPop!");
				palatte();
				break;
				case 6: System.out.println("You've chosen Alamar Cosmetics!");
				palatte();
				break;
				case 7: System.out.println("You've chosen Too Faced!");
				palatte();
				break;
				case 8: System.out.println("You've chosen Natasha Denona Senset EyeShadow!");
				palatte();
				break;
				case 9: System.out.println("You've chosen Victoria Beckham Beauty!");
				palatte();
				break;
				case 10 : eye_category();
				break;
				default: System.err.println("Invalid input");
				
			  }
			
				}
				catch(InputMismatchException input)
				{
					System.err.println("Invalid Input");
					eyeShadow();
				}
			  }
//			 
//		
				 
	

		 public   void eyeLiner() 
		  {
			// TODO Auto-generated method stub
			System.out.println("Pick up your favourite brands!");
			System.out.println("========Press 1 => Lakme 9 to 5 EyeLiner========");
			System.out.println("========Press 2 => Faces Canada========");
			System.out.println("========Press 3 => Sugar Cosmetics========");
			System.out.println("========Press 4 => L'oreal Paris Flash Cat EyeLiner========");
			System.out.println("========Press 5 => RENEE========");
			System.out.println("========Press 6 => Maybelline New York Colossal Liquid========");
			System.out.println("========Press 7 => Swiss Beauty========");
			System.out.println("========Press 8 => Back to choose category========");
			Scanner ref = new Scanner(System.in);
			try {
			int i = ref.nextInt();
			switch (i)
			{
			case 1: System.out.println("You've chosen Lakme 9 to 5 EyeLiner!");
			palatte();
			break;
			case 2: System.out.println("You've chosen Faces Canada!");
			palatte();
			break;
			case 3: System.out.println("You've chosen Sugar Cosmetics!");
			palatte();
			break;
			case 4: System.out.println("You've chosen L'oreal Paris Flash Cat EyeLiner!");
			palatte();
			break;
			case 5: System.out.println("You've chosen RENEE!");
			palatte();
			break;
			case 6: System.out.println("You've chosen Maybelline New York Colossal Liquid!");
			palatte();
			break;
			case 7: System.out.println("You've chosen Swiss Beauty!");
			palatte();
			break;
			case 8: eye_category();
			break;
			default: System.err.println("Invalid input");
			eyeLiner();
		  }
		
			}
			catch(InputMismatchException input)
			{
				System.err.println("Invalid Input");
				eyeLiner();
			}
		  }
		 public   void palatte()
		 {
			
			System.out.println("Select Color palatte ==>");
			System.out.println("Press 1 : Metal Magenta || Press 2 : Royal Blue || Press 3 : Luxury Brown || Press 4 : Ivory Dusty Rose || Press 5 : Back to Brand");
			
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
			case 5 : palatte();
			default : System.err.println("Invalid input");
			palatte();
			}
			}
			catch(InputMismatchException input)
			{
				System.err.println("Select palatte appropriately!");
				palatte();
			}
			}
		 
	
			public   void  formula()
			{
				System.out.println("====Select formulation as per your choice====");
				System.out.println("Press 1 : Gel || Press 2 : Pencil || Press 3 : Liquid || Press 4 : Cream || Press 5 : Back to choose palatte");
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
				case 5 : palatte();
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
				System.out.println("====Select Makeup type as per your choice====");
				System.out.println("Press 1 : Glamorous || Press 2 : Nude || Press 3 : Glossy || Press 4 : Matte || Press 5 : Back to choose Formulation");
				
				Scanner ref = new Scanner(System.in);
				try {
				int choice = ref.nextInt();
				switch (choice)
				{
				case 1 : System.out.println("You've chosen Glamorous MakeUp!");
				if (isRegistered == false) {
					System.out.println("You've chosen Glamorous MakeUp!");
					signup();
				}
					switch(choice)
					{
					case 1: System.out.print("Press Y/y to confirm the purchase: ");
					char confirm = ref.next().charAt(0);
					if (confirm == 'y' || confirm == 'Y')
					{
						total = total + 4000;
						cart.put("Glamorous MakeUp", 4000);
					}
						else
						{
							type();
						}
					}
				break;
				case 2 :  System.out.println("You've chosen Nude MakeUp!"); 
				if (isRegistered == false) {
					System.out.println("You've chosen Nude MakeUp!");
					signup();
				}
					
					
					System.out.print("Press Y/y to confirm the purchase: ");
					char confirm = ref.next().charAt(0);
					if (confirm == 'y' || confirm == 'Y')
					{
						total = total + 2000;
						cart.put("Nude Makeup", 2000);
					}
						else
						{
							type();
						}
					
				break;
				case 3 :
					if (isRegistered == false) {
						System.out.println("You've chosen Glossy MakeUp!");
						signup();
					}
					System.out.println("You've chosen Glossy MakeUp");
				
					 System.out.print("Press Y/y to confirm the purchase: ");
					char confirm1 = ref.next().charAt(0);
					if (confirm1 == 'y' || confirm1 == 'Y')
					{
						total = total + 2100;
						cart.put("Glossy Makeup", 2100);
					}
						else
						{
							type();
						}
					
				break;
				case 4 : System.out.println("You've chosen Matte Makeup!");
				if (isRegistered == false) {
					System.out.println("You've chosen Matte Makeup!");
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
							type();
						}
					
				break;
				case 5: type();
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
	

