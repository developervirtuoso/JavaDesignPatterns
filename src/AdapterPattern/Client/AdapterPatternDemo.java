package AdapterPattern.Client;

import AdapterPattern.Adapter.BankCustomer;
import AdapterPattern.Target.CreditCard;

public class AdapterPatternDemo {  
	 public static void main(String args[]){  
	  CreditCard targetInterface=new BankCustomer();  
	  targetInterface.giveBankDetails();  
	  System.out.print(targetInterface.getCreditCard());  
	  System.out.println(targetInterface.getrate());
	 }   
	}