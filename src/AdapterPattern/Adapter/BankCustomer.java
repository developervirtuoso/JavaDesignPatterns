package AdapterPattern.Adapter;



import java.io.BufferedReader;  
import java.io.InputStreamReader;

import AdapterPattern.Adaptee.BankDetails;
import AdapterPattern.Target.CreditCard;  
public class BankCustomer extends BankDetails implements CreditCard {  
public void giveBankDetails(){  
 try{  
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
     
  System.out.print("Enter the account holder name :");  
  String customername=br.readLine();  
  System.out.print("\n");  
     
  System.out.print("Enter the account number:");  
  long accno=Long.parseLong(br.readLine());  
  System.out.print("\n");  
     
  System.out.print("Enter the Ammount number:");  
  long ammount=Long.parseLong(br.readLine());  
  System.out.print("\n");  
  
  System.out.print("Enter the bank name :");  
  String bankname=br.readLine();  
     
  setAccHolderName(customername);  
  setAccNumber(accno);  
  setBankName(bankname);  
  setAmmount(ammount);
  }catch(Exception e){  
       e.printStackTrace();  
  }  
 }  

@Override  
 public String getCreditCard() {  
  long accno=getAccNumber();  
  String accholdername=getAccHolderName();  
  String bname=getBankName();  
         
  return ("The Account number "+accno+" of "+accholdername+" in "+bname+ "bank is valid and authenticated for issuing the credit card. ");  
 }

@Override
public long getrate() {
	long rate=3*getAmmount();
	return rate;
}  

}