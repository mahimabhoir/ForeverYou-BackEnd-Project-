package com.foreverYou;

import java.util.*;

public class ForeverYou implements Abstraction{

	
		private String name;
		private long contact ;
		private String email;
		private String address;
		private String gender;
		private String password;
		private String cpassword;
		
		static boolean isRegistered = true;
		
		static Map<String, Integer> cart = new LinkedHashMap<>();
		boolean b = false;

		static int total;

		@Override
		public void login() 
		{
			if (isRegistered == false) {
				System.out.println("Your account has been succesully created. Please proceed to login!");
				signup();
			} // A seperate method
			
			System.out.println("==Hey user, Please proceed for Login!==");
			Scanner sc = new Scanner(System.in);
		
			
		System.out.println("Press 1 : Login using contact number || Press 2 : Login using registered mailID");
			
			int choice = sc.nextInt();
			switch (choice) 
			{
			case 1:
				System.out.print("Hey user, kindly enter the registered contact number: +91 ");
				long contact = sc.nextLong();
				sc.nextLine();
				if (contact == this.contact) 
				{
					System.out.println("The contact is validated!");
				
				} 
				else 
				{
					System.err.println("Hey user, please try again!");
					login();
				}
				System.out.println("=======Continue Surfing=========");
				homepage();
				break;
				
			case 2:
				System.out.print("Hey user, kindly enter the registered mailID: ");
				sc.nextLine();
				String email = sc.nextLine();
				if (email.equals(this.email)) 
				{
					System.out.println("The mailID is validated!");
					//passwordChecking();
					
				} 
				else

				{
					System.err.println("Hey user, please try again!");
					login();
				}
				System.out.println("=======Continue Surfing=========");
				homepage();
				break;

			default:
				System.err.println("Hey user, please try again!!");
				login();
			}

		}

		@Override
		public void passwordChecking()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Hey user, enter the password to login");
			String password = sc.nextLine();
			if (password.equals(this.password)) 
			{
				System.out.println("Login Successful");
				b = true;
			} else {
				System.err.println("Hey user, the password is incorrect. Please try again!");
				login();
			}
		}

		@Override
		public  void signup() {
			System.out.println("==Hey user, Kindly proceed to create your new account==");
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter your name: ");
			name = sc.nextLine();
			contactValidation();
			emailValidation();
			System.out.print("Enter your address: ");
			address = sc.nextLine();
			genderValidation();
//			System.out.print("Enter your gender: ");
//			gender = sc.nextLine();
			passwordValidation();
			otp();
			isRegistered = true;
		}

		@Override
		public void otp() 
		{
			String otp = "";
			Random r = new Random();
			while (otp.length() < 6) 
			{
				//Random class
				int n = r.nextInt(123);// ---> 0 to 122
				if ((n >= 65 && n <= 90) || (n >= 97 && n <= 122) || (n >= 48 && n <= 57)) {
					otp = otp + (char) n;
				}
			}
			System.out.println(otp);
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the OTP: ");
			String userOTP = sc.nextLine();
			if (otp.equals(userOTP)) {
				System.out.println("======= The registration is successful! =========");
				login();
			} 
			else
			{
				System.err.println("You've entered wrong OTP!");
				otp();
			}
		}

		public static void passwordValidation() {
		    Scanner ref = new Scanner(System.in);
		    System.out.println("Set 8-characters based alphanumeric password having at least 1 special character!");
		    String password = ref.nextLine();
		    if (ValidPassword(password)) {
		        System.out.println("Password is Valid!");
		        Scanner ref2 = new Scanner(System.in);
			    System.out.print("Confirm the entered password: ");
			    
			    String cpassword = ref2.nextLine();
			    if (password.equals(cpassword)) {
			        System.out.println("Password Matched!!!");
			        
			    } else {
			        System.err.println("Those passwords didn't match. Try Again!!");
			        passwordValidation();
			    }; // Call pconfirm() to confirm the password
		    } else {
		        System.err.println("Password is invalid.");
		        passwordValidation(); // Repeat the password entry process
		    }
		}

			
		
		
		//how to apply condition for char and num as well????
		public static boolean ValidPassword(String password)
		{
			if (password.length() < 8) 
			{
				//System.out.println("Enter password in correct format of 8 digits");
				return false;
			}	
			boolean upper = false, lower = false, number = false, special = false;
			for (int i = 0; i<password.length(); i++)
			{
				char ch = password.charAt(i);
				if(ch == ' ') 
				{
					return false;
				}
				else if(ch>='A' && ch <= 'Z') 
				{
					upper  = true;
				}
				else if(ch>='a' && ch <= 'z') 
				{
					lower  = true;
				}
				else if(ch>='0' && ch <= '9') 
				{
					number   = true;
				}
//				else if(ch == '@' || ch == '#'|| ch =='$' || ch == '%' || ch == '&'|| ch =='_' )
//				{
//					
//				}
				else
				{
					special = true;
				}
				
				
			}
			if (upper && lower && number && special)
			{
				//System.out.println("Right");
				return true;
				
			}
			else
			{
				//System.out.println("Wrong format enter in correct format");
				return false;
			}
			
		}
		
//		public void pconfirm() {
//		    Scanner ref2 = new Scanner(System.in);
//		    System.out.println("Confirm the entered password");
//		    
//		    String cpassword = ref2.nextLine();
//		    if (password.equals(cpassword)) {
//		        System.out.println("Password Match");
//		        
//		    } else {
//		        System.err.println("Those passwords didn't match. Try Again!!");
//		        passwordValidation();
//		    }
//		}
		
		public static void genderValidation()
		{
			Scanner ref = new Scanner(System.in);
			System.out.print("Enter your gender ==>");
			System.out.println(" Press 1 : Female or Press 2 : Male");
			try {
			int x = ref.nextInt();
			switch (x) {
			case 1 : System.out.println("ForeverYou Heartily Welcomes You Mam!");
			break;
			case 2 : System.out.println("ForeverYou Heartily Welcomes You Sir!");
			
			}
			}
			catch(Exception e)
			{
				System.out.println("Enter valid input.");
			}
			}
		
		public void emailValidation() {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter your mail ID: ");
			email = sc.nextLine();
			if (email.endsWith("@gmail.com") || email.endsWith("@yahoo.com") || email.endsWith("@hotmail.com") || email.endsWith("@email.com")) {
				System.out.println("Mail is Valid!");
			} else
			{
				System.err.println("Invalid Try Again");
				emailValidation();
			}
		}

		public void contactValidation() {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter your mobile number: +91 ");
			try {
				contact = sc.nextLong();
				if (contact > 999999999L && contact < 10000000000L) {
					System.out.println("Contact number is Valid!");
				} else {
					System.err.print("Enter 10 digits number");
					contactValidation(); // method recursion
				}
			} catch (InputMismatchException ref) {
				System.err.println("Enter numbers only");
				contactValidation();
			}
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public long getContact() {
			return contact;
		}

		public void setContact(long contact) {
			this.contact = contact;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public void total_bill() {
			for (Map.Entry<String, Integer> e : cart.entrySet()) {
				System.out.println(e.getKey() + "  " + e.getValue());
			}
			System.out.println("Press 1 : UPI Payment || Press 2 : Cash On Delievery");
			//System.out.println("Enter 2 for Cash on Delivery");
			try {
			Scanner ref = new Scanner(System.in);
			int i = ref.nextInt();
			switch (i)
			{
			case 1 : System.out.println("== Proceed further for UPI payment ==");
			System.out.print("Kindly enter the amount: ₹");
			int amount = ref.nextInt();
			System.out.print("Kindly enter the PIN: ");
			int pin = ref.nextInt();
			System.out.println("====== Payment Sucessfull!!! =========");
			System.out.println("Do you want to surf more ?");
			switch(i)
			{
			case 1: System.out.print("Press Y/y to confirm the surfing: ");
			char confirm = ref.next().charAt(0);
			if (confirm == 'y' || confirm == 'Y')
			{
				homepage();
			}
			
			else 
			{
				System.out.println("Hey user, it was great to have you here!!");
				System.exit(0);
			}
			}
				
			break;
			case 2: System.out.println("You've chosen Cash on Delievery!!!");
			break;
			default : System.err.println("Invalid selection for payment!");
			total_bill();
			}
			}
			catch(InputMismatchException input)
			{
				System.err.println("Invalid selection for payment!");
				total_bill();
			}
			}

		@Override
		public void homepage() {
			System.out.println("===Press 1: Face Care===");
			System.out.println("===Press 2: Eye Care===");
			System.out.println("===Press 3: Lip Care===");
			System.out.println("===Press 4: Hair Care===");
			System.out.println("===Press 5: Nail Care===");
			System.out.println("===Press 6: Exit===");
			Scanner sc = new Scanner(System.in);
			try {
			int n = sc.nextInt();
			switch (n) {
			case 1: //FaceCare
				
				FaceCare f = new FaceCare();
				f.gender_category();
				break;
				
			case 2: // EyeCare
				
				
				EyeCare e = new EyeCare();
				e.gender_category();
				break;
				
			case 3: // LipCare
				LipCare l = new LipCare();
				l.gender_category();
				break;
				
			case 4: // HairCare
				HairCare h = new HairCare();
				h.gender_category();
				break;
				
			case 5: // NailCare
				NailCare nail = new NailCare();
				nail.gender_category();
				break;
				
			case 6:
				System.out.println("It was great to have you here!!!!");
				System.exit(0);
				
			default:
				System.err.println("Choose correct option from above");
				homepage();
			}
			}
			catch(Exception ref)
			{
				System.err.println("Choose correct option from above");
				homepage();
			}
			System.out.println("Your total bill is :  " + total);
		}

		
	}


