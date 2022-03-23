package dataStructures;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Jio {
	
	public enum Level1 {
		OPTION_1("💎English➡️ 1"), OPTION_2("💎தமிழ்➡️ 2"), OPTION_3("💎Hindi➡️ 3"), OPTION_4("🔚.Exit👉0 ");

		private final String text;

		Level1(final String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}

	public enum Level2 {
		OPTION_1("😍Rechare👉 1"), OPTION_2("🎼CallerTune👉 2"), OPTION_3("😍DTH👉 3"), OPTION_4("🎁New🎉Offers👉 4"),
		OPTION_5("🔙Back👉 9"), OPTION_6("🔚Exit👉 0 ");

		private final String text;

		Level2(final String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}

	public enum Level3 {
		OPTION_1("😍ரீஜார்ச்👉 5"), OPTION_2("🎼காலர் டியுன்👉 6"), OPTION_3("😍டிடிஎச்👉 7"), OPTION_4("🎁புதிய🎉ஆஃபர்👉 8"),
		OPTION_5("🔙முந்தைய பக்கம்👉9"),OPTION_6("🔚வெளியேறு👉 0");

		private final String text;

		Level3(final String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}

	public enum Recharge {
		OPTION_1("🤓Rechare through Jio Payments Bank Account==>1"), OPTION_2("🤓Coupon Recharge==>2"), OPTION_3("🔙Back👉 9"),
		OPTION_4("🔚Exit👉 0 ");

		private final String text;

		Recharge(final String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}

	public enum CallerTune {
		OPTION_1("🎼Arabic Kuthu👉 4"), OPTION_2("🎼Mudhal Nee Mudivu Nee👉 5"), OPTION_3("🎼Naaga Vera Maari👉 6"),
		OPTION_4("🎼Two Two Two👉 7"), OPTION_5("🔙Back👉 9"), OPTION_6("🔚Exit👉 0 ");

		private final String text;

		CallerTune(final String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}

	public enum Dth {
		OPTION_1("😻Airtel DTH HD Plan Rs.251=49Channels+30D➡️ 1"), OPTION_2("😻Airtel DTH ₹ 285 Pack = 68 Channels+30D➡️ 2"),
		OPTION_3("😻Airtel DTH ₹ 252 Pack = 78 Channels+30D➡️ 3"), OPTION_4("🔙Back👉 9"), OPTION_5("🔚Exit👉 0 ");

		private final String text;

		Dth(final String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}

	public enum NewOffers {
		OPTION_1("🦋UL 265.00 , 1.5GB/Day , 28 Days , Valid till 28-03-2022👉 1"),
		OPTION_2("🦋UL 479.00 , 1.5GB/DAY , 56 Days , Valid till 25-04-2022👉 2"),
		OPTION_3("🦋UL 299.00 , 1GB/DAY   , 28 Days , Valid till 28-03-2022👉 3"),
		OPTION_4("🦋UL 549.00 , 3GB/Day   , 56 Days , Valid till 28-04-2022👉 4"), OPTION_5("🔙Back👉 9"), OPTION_6("🔚Exit👉 0 ");

		private final String text;

		NewOffers(final String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}
	public enum TamilCallerTune {
		OPTION_1("🎼அரபிக் குத்து👉11"), OPTION_2("🎼முதல் நீ முடிவும் நீ👉12"), OPTION_3("🎼நாங்க வேற மாறி👉13"),
		OPTION_4("🎼டும் டும்👉14"), OPTION_5("🔙.முந்தைய பக்கம்👉9"), OPTION_6("0.வெளியேறு 🔚");

		private final String text;

		TamilCallerTune(final String text) {
			this.text = text;
		}

		public String toString() {
			return text;
		}
	}
	
	static class SelectedOptions {
		private int level;
		private int choice;

		SelectedOptions(int level, int choice) {
			this.level = level;
			this.choice = choice;
		}

		public int getLevel() {
			return level;
		}

		public void setLevel(int level) {
			this.level = level;
		}

		public int getChoice() {
			return choice;
		}

		public void setChoice(int choice) {
			this.choice = choice;
		}

	}

	static Stack<SelectedOptions> backStack = new Stack<SelectedOptions>();

	public static void main(String args[]) {
		 Jio obj=new  Jio();
		int choice;
		Scanner input = new Scanner(System.in);
		backStack.push(new SelectedOptions(0, 0));
		print(0, 0);
		do {
			System.out.println("***");
			System.out.print("please Enter your option : ");
			choice = input.nextInt();
			System.out.println();
			System.out.println("***");
			if (choice == 9) {
				backStack.pop();

				if (backStack.isEmpty()) {
					break;
				}
			} else {
				backStack.push(new SelectedOptions(backStack.peek().level + 1, choice));

			}
			SelectedOptions top = backStack.peek();
			print(top.level, top.choice);

		} while (choice != 0);
		System.out.println(" 🙏Thank you for visiting our website 🙏");
		input.close();
	}

	private static void print(int level, int choice) {

		for (String choiceString : getChoices(level, choice)) {
			System.out.println(choiceString);
		}
	}

	static ArrayList<String> getChoices(int level, int choice) {
		ArrayList<String> choiceList = new ArrayList<>();
		if (level == 0) {
			choiceList.add(Level1.OPTION_1.toString());
			choiceList.add(Level1.OPTION_2.toString());
			choiceList.add(Level1.OPTION_3.toString());
			choiceList.add(Level1.OPTION_4.toString());
		} else if (level == 1) {
			switch (choice) {
			case 1:
				choiceList.add(Level2.OPTION_1.toString());
				choiceList.add(Level2.OPTION_2.toString());
				choiceList.add(Level2.OPTION_3.toString());
				choiceList.add(Level2.OPTION_4.toString());
				choiceList.add(Level2.OPTION_5.toString());
				choiceList.add(Level2.OPTION_6.toString());
				break;
			case 2:
				choiceList.add(Level3.OPTION_1.toString());
				choiceList.add(Level3.OPTION_2.toString());
				choiceList.add(Level3.OPTION_3.toString());
				choiceList.add(Level3.OPTION_4.toString());
				choiceList.add(Level3.OPTION_5.toString());
				choiceList.add(Level3.OPTION_6.toString());
			
				break;  
			}
		} 
		else if (level == 2) {
			switch (choice) {
			case 1:
				choiceList.add(Recharge.OPTION_1.toString());
				choiceList.add(Recharge.OPTION_2.toString());
				choiceList.add(Recharge.OPTION_3.toString());
				choiceList.add(Recharge.OPTION_4.toString());
				break;
			case 2:
				choiceList.add(CallerTune.OPTION_1.toString());
				choiceList.add(CallerTune.OPTION_2.toString());
				choiceList.add(CallerTune.OPTION_3.toString());
				choiceList.add(CallerTune.OPTION_4.toString());
				choiceList.add(CallerTune.OPTION_5.toString());
				choiceList.add(CallerTune.OPTION_6.toString());
				break;
			case 3:
				choiceList.add(Dth.OPTION_1.toString());
				choiceList.add(Dth.OPTION_2.toString());
				choiceList.add(Dth.OPTION_3.toString());
				choiceList.add(Dth.OPTION_4.toString());
				choiceList.add(Dth.OPTION_5.toString());
				break;
			case 4:
				choiceList.add(NewOffers.OPTION_1.toString());
				choiceList.add(NewOffers.OPTION_2.toString());
				choiceList.add(NewOffers.OPTION_3.toString());
				choiceList.add(NewOffers.OPTION_4.toString());
				choiceList.add(NewOffers.OPTION_5.toString());
				choiceList.add(NewOffers.OPTION_6.toString());
				break;
			case 6:
				choiceList.add(TamilCallerTune.OPTION_1.toString());
				choiceList.add(TamilCallerTune.OPTION_2.toString());
				choiceList.add(TamilCallerTune.OPTION_3.toString());
				choiceList.add(TamilCallerTune.OPTION_4.toString());
				choiceList.add(TamilCallerTune.OPTION_5.toString());
				choiceList.add(TamilCallerTune.OPTION_6.toString());
			}
		} else if (level == 3 && (choice==4||choice==5||choice==6||choice==7)) {
			System.out.println("your callertune has set sucessfully  ");
			System.out.println();
			System.out.println("🔙Back👉 9");
			System.out.println("🔚Exit👉 0");
		} 
		else if(level==3&&(choice==11||choice==12||choice==13||choice==14)) {
			System.out.println("உங்களுடைய அழைப்பு இசை அமைக்கப்பட்டது ✅");
			System.out.println();
			System.out.println("🔙முந்தைய பக்கம்👉 9");
			System.out.println("🔚வெளியேறு👉 0 ");
			
		}
		else if (level == 3 && choice <= 2) {
			 Jio obj=new  Jio();
			 obj.display();
		}
		
		return choiceList;

	}
	
	public void display() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your 📱 mobileNumber:");
		long mobilenumber = scan.nextLong();
		System.out.print("Amount-Rs. 💵:");
		int amount = scan.nextInt();
		System.out.print("Enter a AccountNumber:");
		long AccountNumber = scan.nextLong();
		System.out.print("Enter a 6 digit otp:");
		int otp = scan.nextInt();
		System.out.println();
		System.out.println(" ✅Verification complete!!");
		System.out.println();
		System.out.println("=================================================================================================");
		System.out.println();
		System.out.println("✉️Recharge of Rs." + amount + " is successful for your Jio number " + mobilenumber + "  ✉️    ");
		System.out.println();
		System.out.println("=================================================================================================");
		System.out.println("🔙Back👉 9");
		System.out.println("🔚Exit👉 0");
	}
	
	public void tamilDisplay() {
		Scanner scan = new Scanner(System.in);
		System.out.print("உங்கள் 📱கைபேசி எண்ணை பதிவிடவும்:");
		long mobilenumber = scan.nextLong();
		System.out.print("காசுகளை பதிவிடவும் 💵:");
		int amount = scan.nextInt();
		System.out.print(" வங்கி கணக்கு எண்ணை பதிவிடவும்:");
		long AccountNumber = scan.nextLong();
		System.out.print("ஆறு (6) இலக்க கடவு எண்ணை பதிவிடவும்:");
		int otp = scan.nextInt();
		System.out.println();
		System.out.println("✅சரிபார்ப்பு முடிந்தது!!");
		System.out.println();
		System.out.println("=================================================================================================");
		System.out.println();
		System.out.println("|✉️உங்கள் ஜியோ"+mobilenumber+" எண்ணில், ரூ."+amount+".00 க் கான ரீச்சார்ஜ் வெற்றிகரமாக செய்யப்பட்டுள்ளது✉️  |" );
		System.out.println();
		System.out.println("==================================================================================================");
		System.out.println("🔙முந்தைய பக்கம்👉 9");
		System.out.println("🔚வெளியேறு👉 0");
		
	}

}
