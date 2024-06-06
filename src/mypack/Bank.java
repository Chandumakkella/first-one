package mypack;

public class Bank {
	static int currentBalance =1000;
	public static void greetCustomer () { 
		System.out.println("Banking application");
	}
	public void deposit(int amount) {
		currentBalance =currentBalance+amount;
		System.out.println(" deopsite");
	}
	public static void withdrawl(int amount) {
		currentBalance =currentBalance-amount;
		System.out.println(" withdrawl");
	}
	public static int getcurrentBalance() {
		return currentBalance;
		
		
	}
	public static void main(String[] args) {
		greetCustomer();
		Bank bank = new Bank();
		bank.deposit(600);
		System.out.println("current balanace is"+getcurrentBalance());
		withdrawl(500);
		System.out.println("current balanace is"+getcurrentBalance());
		withdrawl(300);
		System.out.println("current balanace is"+getcurrentBalance());
		
	
	}
    
}
