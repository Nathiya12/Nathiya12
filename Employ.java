package dataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class Employ {
	
	int EmpId;
	String Name;
	String Doj;
	String Gender;

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int EmpId) {
		this.EmpId = EmpId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDoj() {
		return Doj;
	}

	public void setDoj(String doj) {
		Doj = doj;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}
	public void display(ArrayList<Employ> Employees) {
		System.out.println("+-------+-------+---------------+-------+");
		System.out.println("|Name\t|Emp Id\t|\tDOJ\t|Gender\t|");
		System.out.println("+-------+-------+---------------+-------+");
		for (int i = 0; i < Employees.size(); i++) {
			System.out.println("|"+Employees.get(i).getName() + "\t" + "|" + Employees.get(i).getEmpId() + "\t"
					+ "|" + Employees.get(i).getDoj() + "\t" + "|" + Employees.get(i).getGender() + "\t" + "|");
			System.out.println("+-------+-------+---------------+-------+");
		}
		
	}
	public void optionDisplay() {
		System.out.println("*********");
		System.out.println(" ♢🐯🆂🅴🅻🅴🅲🆃 🆃🅷🅴 🅾🅿🆃🅸🅾🅽 🆆🅷🅰🆃 🆈🅾🆄 🆆🅷🅰🅽🆃 🅼🅾🅳🅸🅵🆈???♢🐯"+"\n");
		System.out.println("1)𝙄𝙛 𝙮𝙤𝙪 𝙬𝙖𝙣𝙩 𝙩𝙤 𝙖𝙙𝙙 𝙀𝙢𝙥𝙡𝙤𝙮𝙚𝙚 𝙙𝙚𝙩𝙖𝙞𝙡𝙨 𝙥𝙧𝙚𝙨𝙨 1️⃣");
		System.out.println("2)𝗜𝗳 𝘆𝗼𝘂 𝘄𝗮𝗻𝘁 𝘁𝗼 𝗿𝗲𝗺𝗼𝘃𝗲 𝗘𝗺𝗽𝗹𝗼𝘆𝗲𝗲 𝗱𝗲𝘁𝗮𝗶𝗹𝘀 𝗽𝗿𝗲𝘀𝘀 2️⃣");
		System.out.println("3)𝗜𝗳 𝘆𝗼𝘂 𝘄𝗮𝗻𝘁 𝘁𝗼 𝗴𝗲𝘁 𝗘𝗺𝗽𝗹𝗼𝘆𝗲𝗲 𝗱𝗲𝘁𝗮𝗶𝗹𝘀 𝗽𝗿𝗲𝘀𝘀 3️⃣");
		System.out.println("4)🅸🅵 🆈🅾🆄 🆆🅰🅽🆃 🆃🅾 🅲🅻🅾🆂🅴 🆃🅷🅴 🆃🅰🅱 🅿🆁🅴🆂🆂 4️⃣");
		System.out.println("********");
	}

	public static void main(String[] args) {
		Employ obj=new Employ();
		Scanner sc = new Scanner(System.in);
		System.out.println("      😍🆆🅴🅻🅲🅾🅼🅴❗!!❕😍       ");
		System.out.println();
		System.out.print(" 💥please Enter the Number of Employees❓ 💥: ");
		int EmpCount = Integer.parseInt(sc.nextLine());
		System.out.println();
		ArrayList<Employ> Employees = new ArrayList<>();
		for (int i = 0; i < EmpCount; i++) {
			Employ s = new Employ();
			System.out.print("Enter the Name (*ALPHAPET ONLY) :");
			s.setName(sc.nextLine());
			System.out.print("Enter the EmpId (*NUMBERS ONLY) : ");
			s.setEmpId(Integer.parseInt(sc.nextLine()));
			System.out.print("Enter the DOJ (*NUMBERS ONLY) : ");
			s.setDoj(sc.nextLine());
			System.out.print("Enter the Gender (*ALPHAPET ONLY) : ");
			s.setGender(sc.nextLine());
			System.out.println();
			Employees.add(s);
		}
		obj.display(Employees);
		obj.optionDisplay();
		int option;
		do {
			System.out.print("Please Enter your option!: ");
			 option = sc.nextInt();
			 switch(option) {
			 case 1:
				 Employ s = new Employ();
					System.out.println();
					System.out.print("Enter the Position value to Add details : ");
					int Position = sc.nextInt();
					sc.nextLine();
					System.out.println();
					int index = Position - 1;
					System.out.print("Enter the Name (ALPHAPET ONLY) : ");
					s.setName(sc.nextLine());
					System.out.print("Enter the Employee Id (NUMBERS ONLY) : ");
					s.setEmpId(Integer.parseInt(sc.nextLine()));
					System.out.print("Enter the Doj (NUMBERS ONLY) : ");
					s.setDoj(sc.nextLine());
					System.out.print("Enter the Gender (ALPHAPET ONLY) : ");
					s.setGender(sc.nextLine());
					Employees.add(index, s);
					obj.display(Employees);
					obj.optionDisplay();
					break;
			 case 2:
				 System.out.println();
				 System.out.print("Enter the EmpId to Remove : ");
					int Empid = sc.nextInt();
					sc.nextLine();
					for (int i = 0; i < Employees.size(); i++) {
						if (Employees.get(i).getEmpId() == Empid) {
							Employees.remove(i);

						}
					}
					obj.display(Employees);
					obj.optionDisplay();
					break;
			 case 3:
				 System.out.print("Enter the EmpId to Get the Details : ");
					int EmpId = sc.nextInt();
					sc.nextLine();
					System.out.println();
					for (int i = 0; i < Employees.size(); i++) {
						if (Employees.get(i).getEmpId() == EmpId) {
							System.out.println("+-------+-------+---------------+-------+");
							System.out.println("|Name\t|Emp Id\t|\tDOJ\t|Gender\t|");
							System.out.println("+-------+-------+---------------+-------+");
							System.out.println("|"+Employees.get(i).getName() + "\t" + "|" + Employees.get(i).getEmpId() + "\t"
										+ "|" + Employees.get(i).getDoj() + "\t" + "|" + Employees.get(i).getGender() + "\t" + "|");
							System.out.println("+-------+-------+---------------+-------+");
						}
					}
					obj.optionDisplay();
				 break;
			 case 4:
				 sc.close();
					System.out.println();
					System.out.println(" 🙏 Thank you for your information 🙏..!");
			 break;
			 default:
				 System.out.println("❌Your option is incorrect🚫❌");
				 System.out.println("Please check your option🥺🥺 ");
					obj.optionDisplay();
			 }
		} while (option != 4);
	

	}

}
