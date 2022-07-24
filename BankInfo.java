package org.bank;

public class BankInfo {
	
	public void saving(String accountno ) {
		System.out.println("This is savings account");
		
	}
	public void fixed(String fdinfo) {
		System.out.println("You have two FD");
		
	}
	public void deposit(int a) {
		
		 a=10000;
		System.out.println("Deposited :Rs." +a +"/-");
		
	}

}
