package org.bank;

public class AxisBank extends BankInfo {
	
	//type override
	public void deposit(String deposit){
		
		deposit="Deposited :Rs.10000/-  & Interest :Rs.350/-";
		System.out.println(deposit);
	}
	
	//number of arguments override
	
	public void deposit(int a, int b) {
		
		 a=10000;
		 b=350;
		System.out.println("Deposited :Rs." +a +"/-" +"&"+"interest:Rs."+b+"/-");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AxisBank depositcheck=new AxisBank();
        
        //normal method
        
        depositcheck.deposit(0);
        
        
        //type overrided method -output
        depositcheck.deposit("overall account statement");
        
        
        //number of arguments override-output
        
        depositcheck.deposit(0, 0);
        

	}

}
