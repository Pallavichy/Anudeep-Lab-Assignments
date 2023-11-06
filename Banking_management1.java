package Self_learning;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class Transaction{
	private String type;
	private double amount;
	Transaction(String type,double amount){
		this.type=type;
		this.amount=amount;
	}
	    public String toString() {
	        return  type + " - Amount: " + amount;
	    }
}
class Bank {
	private int pin;
	private int Acc_no;
	private double balance;
	private String name;
    static List<Bank> list=new ArrayList<>();
    private List<Transaction> History;
   
	public Bank(){
		History=new ArrayList<>();
	}
	public  void getHistory(int acc){
		for(Bank b: list) {
			if(b.getAcount()==acc)
				System.out.println(b.History);
		}
		
	}
	int getPin() {
		return this.pin;
	}
	double get_balance() {
		return this.balance;
	}
	void set_balance(double balance) {
		this.balance=balance;
	}
	int getAcount() {
		return this.Acc_no;
	}
	Bank(int Acc_no,double balance,String name,int pin){
		try {
		this.Acc_no=Acc_no;
		this.name=name;
		this.balance=balance;
		this.pin=pin;}
		catch(Exception e) {
			System.out.println(" Something wrong! Try again "+e);
		}
	}
	 public static boolean isValidName(String name) {
	        return name.matches("[a-zA-Z ]+");
	    }
	 public double getbalance() {
		 return this.balance;
	 }
	
	public void update_pin(int acc_no) {
		try {
		for(Bank b:list) {
			if(b.getAcount()==acc_no) {
		Scanner a=new Scanner(System.in);
		System.out.println(" Enter old pin ");
		int pin_old=a.nextInt();
		if(b.pin==pin_old) {
			System.out.println(" Enter New pin ");
			int pin_new=a.nextInt();
			b.pin=pin_new;
			System.out.println(" pin successfully changed ");
			return;
		}
		else {
			System.out.println(" you entered wrong pin ");}
		}
		else
			System.out.println(" you entered wrong Account_no ");
			
		}}
		catch(Exception e) {
			System.out.println(" Something wrong! Try again "+e);
		}
		
	}
	public void deposit(int acc_no) {
		try {
		for(Bank b: list) {
			if(acc_no==b.getAcount()) {
		Scanner a=new Scanner(System.in);
		System.out.println(" Enter your pin ");
		int enter_pin=a.nextInt();
		if(b.getPin()==enter_pin) {
			System.out.println(" Enter Amount you want to deposite  ");
			double amount=a.nextInt();
		amount+=b.get_balance();
		//b.History.add(new Transaction("Credit",amount));
		b.set_balance(amount);
		return;
		}
		else {
			System.out.println("You entered wrong pin ");
		}
		}
			else
				System.out.println(" You entered wrong account_no: Try again/n ");
		}}
		catch(Exception e) {
			System.out.println(" Something wrong! Try again "+e);
		}
	}
	public void current_balance(int acc_no) {
		try {
		for(Bank b:list) {
			if(b.getAcount()==acc_no) {
		Scanner a=new Scanner(System.in);
		System.out.println(" Enter your pin ");
		int enter_pin=a.nextInt();
		if(b.pin==enter_pin) {
		System.out.println("Balance = "+b.get_balance());
		return;
		}
//		else 
//			System.out.println(" You Entered wrong pin ");
	  }
//			else {
//				System.out.println(" You entered wrong account_no /n Try again/n ");
//			}
	}}catch(Exception e) {
		System.out.println(" Something wrong! Try again "+e);
	}
}
	public void withdraw(int acc_no) {
		try {
		for(Bank b:list) {
			if(b.getAcount()==acc_no) {
		double amount;
		Scanner a=new Scanner(System.in);
		
		
		System.out.println(" Enter your pin ");
		int enter_pin=a.nextInt();
		if(b.pin==enter_pin) {
			System.out.println("Enter amount you want to withdraw");
			amount=a.nextDouble();
		amount=b.get_balance()-amount;
		b.set_balance(amount);
		return;
		//b.History.add(new Transaction("Debit",amount));
		}
		else
			System.out.println(" you entered wrong pin ");
			}
			else
				System.out.println(" You entered wrong account_no /n Try again/n ");
		}}
		catch(Exception e) {
			System.out.println(" Something wrong! Try again "+e);
		}
	}

	public void Fetch() {
		try {
		System.out.println(list);}
		catch(Exception e) {
			System.out.println(" Something wrong! Try again "+e);
		}
	}
	
	public String toString() {
		return " Name: " + this.name+ " Acc_No " + this.Acc_no+ " Pin: "+this.pin+" Balance: "+balance+"\n";
		
	}
	public void transfer(int acc) {
		int amount;
		int ac;
		try {
		Scanner a=new Scanner(System.in);
		System.out.println(" Enter amount you want to transfer ");
		amount=a.nextInt();
		
		for(Bank b:list) {
			if(b.getAcount()==acc) {
				
				System.out.println(" Enter account number You want to Transfer to ");
				ac=a.nextInt();
				for(Bank b1:list) {
				if( b1.getAcount()==ac) {
					
					double amoun=b1.get_balance();
					amoun+=amount;
					b1.set_balance(amoun);
					double amoun1=b.get_balance();
					amoun1-=amount;
					b.set_balance(amoun1);
					break;
				}
				}
			}
			
		}}
		catch(Exception e) {
			System.out.println(" oops Wrong input:");
		}
	}
	
}

public class Banking_management1 extends Bank{
	
	public void create_account() {
		try {
			Scanner cus=new Scanner(System.in);
			System.out.println(" Set account Number of customer ");
			int Acc_no=cus.nextInt();
		for(Bank l :list) {
			
			  while(Acc_no==l.getAcount()) {
		  if(Acc_no== l.getAcount()) {
			 System.out.println(" Acoount no exist enter another number ");
			  Acc_no=cus.nextInt();
				continue;
		  }}
		  
		}
		System.out.println(" Give initial balance ");
		double balance=cus.nextDouble();
		System.out.println(" Input Name of customer ");
		cus.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		 String name=cus.nextLine();
		 Bank b=new Bank();
			 while(!(b.isValidName(name))) {
				 System.out.println(" Only Alphabets are allowed: Try again");
				 name=cus.nextLine();
				 
			 }
		 
		System.out.println(" Set pin for account ");
		 int pin=cus.nextInt();
		
	
		Bank customer = new Bank(Acc_no,balance,name,pin);
		list.add(customer);
		}
		catch(Exception e) {
			System.out.println(" Something wrong! Try again "+e);
		}
	}
	
	public static void main(String args[]) {
		Banking_management1 bm=new Banking_management1();
		
		Bank customer1=new Bank();
		
		Scanner a=new Scanner(System.in);
		int choic=0;
		
		do {
			try {
			System.out.print("1: Balance enqury\t\t");
			System.out.println("2: Deposite");
			System.out.print("3: Withdraw\t\t");
			System.out.println("\t4: Pin change");
			System.out.print("5: create new account\t\t");
			System.out.println("6: Fetch list of customers");
			System.out.println("7: Transfer amount\t\t");
			System.out.println(" ----------------------------------------- ");
			System.out.println("Enter your choice:");
			
			int choice=a.nextInt();
			switch(choice) {
			case 1:{
				 System.out.println(" enter your account_no to perform  oprations");
				 int acc=a.nextInt();
				customer1.current_balance(acc);
				break;}
			     	
			case 2:{
				 System.out.println(" enter your account_no to perform  oprations ");
				 int acc=a.nextInt();
				customer1.deposit(acc);
				break;}
			case 3:{
				 System.out.println(" enter your account_no to perform  oprations ");
				 int acc=a.nextInt();
				customer1.withdraw(acc);
				break;}
			case 4:{
				System.out.println(" enter your account_no to perform  oprations ");
				 int acc=a.nextInt();
				customer1.update_pin(acc);
				break;}
			case 5:
			  bm.create_account();
				break;
			case 6:
				bm.Fetch();break;
			case 7:
				System.out.println(" enter your account_no to perform  oprations ");
				 int acc=a.nextInt();
				bm.transfer(acc);
			 }
			System.out.println("Type 1 to continue or any key to exit ");
			 choic=a.nextInt(); }catch(Exception e) {
				 choic=1;
					System.out.println(" oops  wrong input! Try again \n");
					
				}
			a.nextLine();			
	}while(choic ==1);
		
}}
