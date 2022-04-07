package com.training;

import com.training.model.BankAccount;
import com.training.services.BankAccountService;
import java.util.*;
public class MyApplication {

	public static void main(String[] args) {

		
		BankAccountService service = new BankAccountService();
		BankAccount[] list = new BankAccount[10];
		int idx = 0;
		int choice =0;
		Scanner sc = new Scanner(System.in);
		
		do{
			
					System.out.println("Account Number");
						int accountNumber = sc.nextInt();
					
					System.out.println("Account Holder Name");
					  String accountHolderName = sc.next();
			        
			        System.out.println("Balance");
			              double  balance = sc.nextDouble();
			         
			         System.out.println("Account Type [savings,fixed,recurring]");
			         	String accountType=sc.next();
			         
			         BankAccount account = 
			        		 new BankAccount(accountNumber, accountHolderName, 
			        				 balance,accountType);
			
			        list[idx]= account;
			        
			        System.out.println("Enter 0 to end 1 to continue");
			         choice = sc.nextInt();
			         
		}while(choice==1);
		
		   double[] values =service.findInterestByAccountType(list);
		
		    for(double eachValue: values) {
		    	System.out.println(eachValue);
		    }
	
		 sc.close();
	}

	
}
